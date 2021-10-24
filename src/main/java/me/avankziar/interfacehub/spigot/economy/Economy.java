package main.java.me.avankziar.interfacehub.spigot.economy;

import main.java.me.avankziar.interfacehub.spigot.economy.currency.EconomyCurrency;
import main.java.me.avankziar.interfacehub.spigot.economy.subinterfaces.AccountHandling;
import main.java.me.avankziar.interfacehub.spigot.economy.subinterfaces.CurrencyHandling;
import main.java.me.avankziar.interfacehub.spigot.economy.subinterfaces.TransactionHandling;

public interface Economy
extends AccountHandling, CurrencyHandling, TransactionHandling
{
	/**
	 * @return true if the normal economy is enabled.
	 */
	boolean isEnabled();
	
	/**
	 * @return true if multiple currency exists and are supported.
	 */
	boolean isMultiCurrency();
	
	/**
	 * @return true if wallet accounts are supported.
	 */
	boolean hasWalletSupport();
	
	/**
	 * @return true if bank accounts are supported.
	 */
	boolean hasBankSupport();
	
	/**
	 * @return true if the plugin support itemstackcurrency
	 */
	boolean hasItemStackCurrencySupport();
	
	/**
	 * @return true if the plugin support playerexperiencecurrency
	 */
	boolean hasPlayerExperienceCurrencySupport();
	
	/**
	 * Return the Plugin, which has implemented this interface
	 * @return Plugin name
	 */
	String getName();
	
	/**
	 * @return String array of the Authors.
	 */
	String[] getAuthors();
	
	/**
	 * @param amount
	 * @return a string format of the amount.
	 */
	String format(double amount);
	
	/**
	 * A string format of the amount in the specific currency in one String.
	 * @param amount
	 * @param economyCurrency
	 * @param decimalPlaces
	 * @param onlyUseMajor
	 * @param useSymbol
	 * @return 
	 * F.e.: 
	 * <br>- '20 $' (decimalPlaces:0 | useSymbol:true | onlyUseMajor:<b>here does not matter, symbol is preceding</b>)
	 * <br>- '20.0 Dollars' (decimalPlaces:1 | useSymbol:false | onlyUseMajor:true)
	 * <br>- '20 Dollars 1 Cent' (decimalPlaces:0 | useSymbol:false | onlyUseMajor:false)
	 * <br>- '1 Gold 13 Silver 88 Copper' (decimalPlaces:0 | useSymbol:false | onlyUseMajor:false) If you have more degradation as two as for dollars and cents
	 */
	String formatWithCurrency(double amount, EconomyCurrency economyCurrency, int decimalPlaces, boolean useSymbol, boolean onlyUseMajor);
}