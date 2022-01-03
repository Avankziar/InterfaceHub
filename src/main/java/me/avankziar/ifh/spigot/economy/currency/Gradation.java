package main.java.me.avankziar.ifh.spigot.economy.currency;

import org.bukkit.inventory.ItemStack;

public class Gradation
{	
	/**
	 * The plural from this gradation. F.e. "Dollars".
	 */
	private String plural;
	
	/**
	 * The singular from this gradation. F.e. "Dollar".
	 */
	private String singular;
	
	/**
	 * The symbol for this gradation. F.e. "$". for Dollar
	 */
	private String symbol;
	
	/*
	 * The define of a itemstack to a currency at BaseGradation. Only for Itemstack based Currency
	 */
	private ItemStack correspondingItem;
	
	/*
	 * the worth of 1 currency to 1 correspondingItem (baseGradation). Only for Itemstack based Currency
	 */
	private double itemstackWorth = Double.MAX_VALUE;
	
	/**
	 * 1 Dollar are xxx at the Base?
	 * The Base were Cent so 100 Cent are 1 Dollar.
	 */
	private double valueToBaseGradation;
	
	public Gradation(){}
	
	public Gradation(String plural, String singular, String symbol, double valueToBaseGradation)
	{
		setPlural(plural);
		setSingular(singular);
		setSymbol(symbol);
		setValueToBaseGradation(valueToBaseGradation);
	}
	
	public Gradation(String plural, String singular, String symbol, ItemStack correspondingItem, double itemstackWorth,
			double valueToBaseGradation)
	{
		setPlural(plural);
		setSingular(singular);
		setSymbol(symbol);
		setCorrespondingItem(correspondingItem);
		setItemstackWorth(itemstackWorth);
		setValueToBaseGradation(valueToBaseGradation);
	}

	public String getPlural()
	{
		return plural;
	}

	public Gradation setPlural(String plural)
	{
		this.plural = plural;
		return this;
	}

	public String getSingular()
	{
		return singular;
	}

	public Gradation setSingular(String singular)
	{
		this.singular = singular;
		return this;
	}

	/**
	 * @return the symbol
	 */
	public String getSymbol()
	{
		return symbol;
	}

	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol)
	{
		this.symbol = symbol;
	}
	
	public Gradation setItemStackWorthToBaseGradation(ItemStack itemstack, double worth)
	{
		this.correspondingItem = itemstack;
		this.itemstackWorth = worth;
		return this;
	}
	
	public ItemStack getCorrespondingItem()
	{
		return correspondingItem;
	}

	public void setCorrespondingItem(ItemStack correspondingItem)
	{
		this.correspondingItem = correspondingItem;
	}

	public double getItemstackWorth()
	{
		return itemstackWorth;
	}

	public void setItemstackWorth(double itemstackWorth)
	{
		this.itemstackWorth = itemstackWorth;
	}

	public double getValueToBaseGradation()
	{
		return valueToBaseGradation;
	}

	public Gradation setValueToBaseGradation(double valueToBaseGradation)
	{
		this.valueToBaseGradation = valueToBaseGradation;
		return this;
	}
	
	@Override
	public String toString()
	{
		return "Gradation{"+
				"singular="+this.singular+","+
				"plural="+this.plural+","+
				"symbol="+this.symbol+
				(this.correspondingItem != null ? "ItemStack="+this.correspondingItem.toString()+",Worth="+this.itemstackWorth : "")+
				"valueToBaseGradation="+this.valueToBaseGradation+"}";
	}
}