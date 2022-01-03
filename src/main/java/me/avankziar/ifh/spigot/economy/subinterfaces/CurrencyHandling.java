package main.java.me.avankziar.ifh.spigot.economy.subinterfaces;

import java.util.ArrayList;

import main.java.me.avankziar.ifh.spigot.economy.account.AccountType;
import main.java.me.avankziar.ifh.spigot.economy.account.EconomyEntity;
import main.java.me.avankziar.ifh.spigot.economy.currency.Currency;
import main.java.me.avankziar.ifh.spigot.economy.currency.EconomyCurrency;

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
	
	/**
	 * get all registered digital Currency
	 * @return
	 */
	ArrayList<EconomyCurrency> getDigitalCurrencies();
	
	/**
	 * get all registered itemstack Currency
	 * @return
	 */
	ArrayList<EconomyCurrency> getItemStackCurrencies();
	
	/**
	 * get all registered experience Currency
	 * @return
	 */
	ArrayList<EconomyCurrency> getExperienceCurrencies();
	
	/**
	 * Return all digital currency, which are exchangable.
	 * @return
	 */
	ArrayList<EconomyCurrency> getExchangableDigitalCurrencies();
	
	/**
	 * Return all itemstack currency, which are exchangable.
	 * @return
	 */
	ArrayList<EconomyCurrency> getExchangableItemStackCurrencies();
	
	/**
	 * Return all experience currency, which are exchangable.
	 * @return
	 */
	ArrayList<EconomyCurrency> getExchangableExperienceCurrencies();
	
	/**
	 * @return the default currency.
	 */
	EconomyCurrency getDefaultCurrency();
	
	/**
	 * @return the default itemstack based currency.
	 */
	EconomyCurrency getDefaultItemStackCurrency();
	
	/**
	 * @return the default playerexperience based currency.
	 */
	EconomyCurrency getDefaultExperienceCurrency();
	
	/**
	 * @param server, nullable
	 * @param world, nullable
	 * @return the default currency in this server & world.
	 */
	EconomyCurrency getDefaultCurrency(String server, String world);
	
	/**
	 * @param server, nullable
	 * @param world, nullable
	 * @return the default itemstack currency in this server & world.
	 */
	EconomyCurrency getDefaultItemStackCurrency(String server, String world);
	
	/**
	 * @param server, nullable
	 * @param world, nullable
	 * @return the default experience currency in this server & world.
	 */
	EconomyCurrency getDefaultExperienceCurrency(String server, String world);
	
	/**
	 * @param server, nullable
	 * @param world, nullable
	 * @return return, if the default currency is now setted
	 */
	boolean setDefaultCurrency(EconomyCurrency currency, String server, String world);
	
	/**
	 * @param server, nullable
	 * @param world, nullable
	 * @return return, if the default currency is now setted
	 */
	boolean setDefaultItemStackCurrency(EconomyCurrency currency, String server, String world);
	
	/**
	 * @param server, nullable
	 * @param world, nullable
	 * @return return, if the default currency is now setted
	 */
	boolean setDefaultExperienceCurrency(EconomyCurrency currency, String server, String world);
	
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
	 * Returns the value for the second Currency by exchanging both currencies.<br>
	 * <b>amountFromCurrency</b> * <b>multiply</b> = <b>toCurrency amount</b> (return value)
	 * @param amountFromCurrency amount as double, which one uses from the first currency as exchange.
	 * @param fromCurrency
	 * @param toCurrency
	 * @return amount as double, which you get from the second currency in exchange.
	 */
	default double getExchangeOfCurrency(double amountFromCurrency, EconomyCurrency fromCurrency, EconomyCurrency toCurrency)
	{
		return amountFromCurrency *
				(Math.max(fromCurrency.getExchangeWorth(), toCurrency.getExchangeWorth())
						/Math.min(fromCurrency.getExchangeWorth(), toCurrency.getExchangeWorth()));
		
	}
}