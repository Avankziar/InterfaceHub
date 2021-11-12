package main.java.me.avankziar.interfacehub.spigot.economy.subinterfaces;

import org.bukkit.inventory.ItemStack;

import main.java.me.avankziar.interfacehub.spigot.economy.currency.EconomyCurrency;

public interface CurrencyHandling
{
	/**
	 * @param economyCurrency
	 * @return true, if the currency already exists.
	 */
	boolean existsCurrency(String uniqueCurrencyName);
	
	/**
	 * Registered a currency. The unique name of the currency must not already exist!
	 * @param economyCurrency
	 * @return true, if the currency is registered.
	 */
	boolean registerCurrency(EconomyCurrency economyCurrency);
	
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
	 * @param server
	 * @param world
	 * @return the default currency in this world.
	 */
	EconomyCurrency getDefaultCurrency(String server, String world);
	
	/**
	 * @param server
	 * @param world
	 * @return the default itemstack currency in this world.
	 */
	EconomyCurrency getDefaultItemStackCurrency(String server, String world);
	
	/**
	 * @param server
	 * @param world
	 * @return the default experience currency in this world.
	 */
	EconomyCurrency getDefaultExperienceCurrency(String server, String world);
	
	/**
	 * @param uniqueName
	 * @return the currency with the uniqueName.
	 */
	EconomyCurrency getCurrency(String uniqueName);
	
	/**
	 * If the using currency has this itemstack not on his list,
	 * <br>than use this methode to determind the worth of the item.
	 * @param itemstack
	 * @return standart worth of the itemstack.
	 */
	double getDefaultItemStackWorth(ItemStack itemstack);
}