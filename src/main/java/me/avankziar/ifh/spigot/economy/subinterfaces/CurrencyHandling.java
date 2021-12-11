package main.java.me.avankziar.ifh.spigot.economy.subinterfaces;

import main.java.me.avankziar.ifh.spigot.economy.account.AccountType;
import main.java.me.avankziar.ifh.spigot.economy.account.EconomyEntity;
import main.java.me.avankziar.ifh.spigot.economy.currency.Currency;
import main.java.me.avankziar.ifh.spigot.economy.currency.EconomyCurrency;

public interface CurrencyHandling
{
	/**
	 * @param economyCurrency
	 * @return true, if the currency already exists.
	 */
	boolean existsCurrency(String uniqueCurrencyName);
	
	/**
	 * Registered a currency. The unique name of the currency must not exist!
	 * @param currency
	 * @return true, if the currency is registered.
	 */
	boolean registerCurrency(Currency currency);
	
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
	
	double getTotalMoneyInTheSystem();
	
	double getTotalMoneyInTheSystem(AccountType accountType);
	
	double getTotalMoneyInTheSystem(EconomyEntity.EconomyType ownerType);
	
	double getTotalMoneyInTheSystem(AccountType accountType, EconomyEntity.EconomyType ownerType);
}