package main.java.me.avankziar.interfacehub.spigot.economy.currencytoken;

import java.util.LinkedHashMap;

import org.bukkit.inventory.ItemStack;

public class TokenConcept
{
	/*
	 * set a name like "Coin".
	 */
	protected String singular;
	
	/*
	 * set a name like "Coins".
	 */
	protected String plural;
	
	/*
	 * The worth of 1 tokencurrency to a undefine standart unit.
	 */
	protected double tokenWorth;
	
	/*
	 * The define of a itemstack to a token currency
	 */
	protected final LinkedHashMap<ItemStack, Double> itemStackMap = new LinkedHashMap<>();
	
	/*
	 * the worth of 1 tokencurrency to player level. 
	 */
	protected int tokenExpLevelWorth;
	
	protected TokenConcept(){}
	
	public TokenConcept setTokenWorth(double worth)
	{
		this.tokenWorth = worth;
		return this;
	}
	
	public TokenConcept setTokenWorth(ItemStack itemstack, double worth)
	{
		this.itemStackMap.put(itemstack, worth);
		return this;
	}
	
	public TokenConcept setTokenWorth(int playerExpLevel)
	{
		this.tokenExpLevelWorth = playerExpLevel;
		return this;
	}
}
