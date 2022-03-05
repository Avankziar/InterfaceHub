package main.java.me.avankziar.ifh.spigot.economy.subinterfaces;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import main.java.me.avankziar.ifh.general.economy.account.AccountType;
import main.java.me.avankziar.ifh.general.economy.account.EconomyEntity;
import main.java.me.avankziar.ifh.general.economy.currency.CurrencyType;
import main.java.me.avankziar.ifh.spigot.economy.currency.Currency;
import main.java.me.avankziar.ifh.spigot.economy.currency.EconomyCurrency;
import main.java.me.avankziar.ifh.spigot.economy.subinterfaces.CurrencyHandling.Exchange.TaxToCurrency;

public interface CurrencyHandling
{
	/**
	 * @param economyCurrencyName
	 * @return true, if the currency already exists.
	 */
	boolean existsCurrency(String uniqueCurrencyName);
	
	/**
	 * Registered a currency. The unique name of the currency must not exist!<br>
	 * Made for extern register at every start of the Server.
	 * @param currency
	 * @return true, if the currency is registered.
	 */
	boolean registerCurrency(Currency currency);
	
	boolean registerCurrency(Currency currency, 
			int gradationQuantity, boolean useSIPrefix, int decimalPlaces, boolean useSymbol,
			String thousandSeperator, String decimalSeperator, LinkedHashMap<Double, String> siPrefix);
	
	/**
	 * get all registered Currency
	 * @return
	 */
	ArrayList<EconomyCurrency> getCurrencies(CurrencyType type);
	
	/**
	 * Return all currency, which are exchangable.
	 * @return
	 */
	ArrayList<EconomyCurrency> getExchangableCurrencies(CurrencyType type);
	
	/**
	 * @return the default currency for the respective type.
	 */
	EconomyCurrency getDefaultCurrency(CurrencyType type);
	
	/**
	 * Set the currency as default for the currencytype which is included in the currency object.
	 * @param currency
	 * @return return, if the default currency is now setted
	 */
	boolean setDefaultCurrency(EconomyCurrency currency);
	
	/**
	 * @param uniqueName
	 * @return the currency with the uniqueName.
	 */
	EconomyCurrency getCurrency(String uniqueName);
	
	double getTotalMoneyInTheSystem(EconomyCurrency currency);
	
	double getTotalMoneyInTheSystem(EconomyCurrency currency, AccountType accountType);
	
	double getTotalMoneyInTheSystem(EconomyCurrency currency, EconomyEntity.EconomyType ownerType);
	
	double getTotalMoneyInTheSystem(EconomyCurrency currency, AccountType accountType, EconomyEntity.EconomyType ownerType);
	
	/**
	 * Returns the a object which contains the .<br>
	 * <b>amountFromCurrency</b> * <b>multiply</b> = <b>toCurrency amount</b> (return value)
	 * @param amountFromCurrency
	 * @param fromCurrency
	 * @param toCurrency
	 * @param taxInPercent
	 * @param taxAreAddition
	 * @param taxationBeforeExchange
	 * @return
	 */
	public default Exchange getExchangeOfCurrency(double amountFromCurrency, EconomyCurrency fromCurrency, EconomyCurrency toCurrency,
			double taxInPercent, boolean taxAreExclusive, boolean taxationBeforeExchange)
	{
		double f = fromCurrency.getExchangeWorth();
		double t = toCurrency.getExchangeWorth();
		
		double amount = 300.0;
		
		if(taxationBeforeExchange)
		{
			double amountToWithdraw = 0.0;
			double amountToDeposit = 0.0;
			if(taxAreExclusive)
			{
				amountToWithdraw = amount + amount*taxInPercent;
				amountToDeposit = amount;
			} else
			{
				amountToWithdraw = amount;
				amountToDeposit = amount - amount*taxInPercent;
			}
			double amountToTax = amountToWithdraw - amountToDeposit;
			
			double i = 0.0;
			if(f > t)
			{
				i = amountToDeposit * (Math.max(f, t)/Math.min(f, t));
			} else if(f < t)
			{
				i = amountToDeposit / (Math.max(f, t)/Math.min(f, t));
			} else
			{
				i = amountToDeposit;
			}
			return new Exchange(amountToWithdraw, i, amountToTax, TaxToCurrency.TO_WITHDRAW_CURRENCY);
		} else
		{
			double i = 0.0;
			
			if(f > t)
			{
				i = amount * (Math.max(f, t)/Math.min(f, t));
			} else if(f < t)
			{
				i = amount / (Math.max(f, t)/Math.min(f, t));
			} else
			{
				i = amount;
			}
			
			double amountToWithdraw = 0.0;
			double amountToDeposit = 0.0;
			if(taxAreExclusive)
			{
				amountToWithdraw = amount + amount*taxInPercent;
				amountToDeposit = i;
			} else
			{
				amountToWithdraw = amount;
				amountToDeposit = i - i*taxInPercent;
			}
			double amountToTax = i - amountToDeposit;
			return new Exchange(amountToWithdraw, amountToDeposit, amountToTax, TaxToCurrency.TO_DEPOSIT_CURRENCY);
		}
	}
	
	public class Exchange
	{
		public enum TaxToCurrency
		{
			TO_WITHDRAW_CURRENCY,
			TO_DEPOSIT_CURRENCY
		}
		
		public final double toWithdrawAccount;
		public final double toDepositAccount;
		public final double toTaxAccount;
		public final TaxToCurrency taxTo;
		
		
		public Exchange(double toWithdrawAccount, double toDepositAccount, double toTaxAccount, TaxToCurrency taxTo)
		{
			this.toWithdrawAccount = toWithdrawAccount;
			this.toDepositAccount = toDepositAccount;
			this.toTaxAccount = toTaxAccount;
			this.taxTo = taxTo;
		}
	}	
}