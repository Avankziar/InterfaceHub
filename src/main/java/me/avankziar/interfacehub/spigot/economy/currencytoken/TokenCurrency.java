package main.java.me.avankziar.interfacehub.spigot.economy.currencytoken;

import org.bukkit.inventory.ItemStack;

public interface TokenCurrency
{
	/*
	 * The singular name of this currency. For example "Coin" or "Token".
	 */
	String getSingular();
	
	/*
	 * The plural name of this currency. For example "Coins" or "Token".
	 */
	String getPlural();
	
	/*
	 * Worth of this token to a undefine standart unit.
	 */
	double getTokenWorth();
	
	/*
	 * The worth of this itemStack in this TokenCurrency
	 */
	double getTokenWorth(ItemStack itemStack);
	
	/*
	 * The worth of 1 playerLevel in this TokenCurrency
	 */
	double getTokenExpLevelWorth();
	
}
