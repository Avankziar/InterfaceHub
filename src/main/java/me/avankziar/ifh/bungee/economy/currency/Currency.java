package main.java.me.avankziar.ifh.bungee.economy.currency;

import main.java.me.avankziar.ifh.spigot.economy.currency.CurrencyType;

public class Currency
{
	/**
	 * set a name like "Dollar" or a unique name.
	 */
	protected String uniqueName;
	
	/**
	 * The Gradation of this currency.<br>
	 * This make it possible to add a major and a minor or multiple more, if you wish.
	 */
	protected CurrencyGradation currencyGradation;
	
	/**
	 * The type of the currency.<br>
	 * Digital is a normal currency like dollar.
	 */
	protected CurrencyType currencyType;
	
	/**
	 * If the currency is exchangable with other currency.
	 */
	protected boolean isExchangeable;
	
	/**
	 * If the currency is exchange in another currency, this define, if the taxation happens before the exchange in the other currency.
	 */
	protected boolean taxationBeforeExchange;
	
	/**
	 * The worth of the currency to a undefine standartunit.<br>
	 * For example, if this currency is worth 0.25 and a other currency is 1.25, <br>
	 * then need to change 5 times this currency for 1 unit of the other.
	 */
	protected double standartUnitWorth = 1;
	
	public Currency(){}
	
	public Currency setUnique(String uniqueName)
	{
		this.uniqueName = uniqueName;
		return this;
	}

	public Currency setCurrencyGradation(CurrencyGradation currencyGradation)
	{
		this.currencyGradation = currencyGradation;
		return this;
	}
	
	public Currency setCurrencyType(CurrencyType currencyType)
	{
		this.currencyType = currencyType;
		return this;
	}
	
	public Currency setExchangeable(boolean isExchangeable)
	{
		this.isExchangeable = isExchangeable;
		return this;
	}

	public Currency setTaxationBeforeExchange(boolean taxationBeforeExchange)
	{
		this.taxationBeforeExchange = taxationBeforeExchange;
		return this;
	}

	public Currency setStandartUnitWorth(double standartUnitWorth)
	{
		if(standartUnitWorth <= 0)
		{
			return this;
		}
		this.standartUnitWorth = standartUnitWorth;
		return this;
	}
	
	public EconomyCurrency toCurrency()
	{
		return new EconomyCurrency(this);
	}
	
	@Override
	public String toString()
	{
		return "Currency{"+
				"UniqueName="+this.uniqueName+","+
				"CurrencyGradation="+this.currencyGradation.toString()+","+
				"CurrencyType="+this.currencyType.toString()+","+
				"isExchangable="+this.isExchangeable+","+
				"StandartUnitWorth="+this.standartUnitWorth+"}";
	}
}