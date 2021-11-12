package main.java.me.avankziar.ifh.spigot.economy.currency;

public class Currency
{
	/**
	 * set a name like "Dollar" or a unique name.
	 */
	protected String uniqueName;
	
	/**
	 * The Gradation of this currency.
	 * This make it possible to add a major and a minor or multiple more, if you wish.
	 */
	protected CurrencyGradation currencyGradation;
	
	/*
	 * the applied server.
	 */
	protected String server;
	
	/*
	 * the applied world.
	 */
	protected String world;
	
	/*
	 * The worth of the currency to a undefine standartunit.
	 * For example, if this currency is worth 0.25 and a other currency is 1.25, 
	 * then need to change 5 times this currency for 1 unit of the other.
	 */
	protected double standartUnitWorth = 1;
	
	public Currency(){}
	
	public Currency setUnique(String uniqueName)
	{
		this.uniqueName = uniqueName;
		return this;
	}
	
	public Currency setServer(String server)
	{
		this.server = server;
		return this;
	}

	public Currency setCurrencyGradation(CurrencyGradation currencyGradation)
	{
		this.currencyGradation = currencyGradation;
		return this;
	}

	public Currency setWorld(String world)
	{
		this.world = world;
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
	
	/*
	 * return a ratio from one EconomyCurrency to this.
	 * The factor applies to this EconomyCurrency.
	 * For Example, if this Currency has a worth of 1.25 and the other of 0.25, than the factor is 5.
	 * This means, we must applied a factor of 5 (multiplication) on the other currency to match ours.
	 */
	/*public double worthRatioTo(Currency economyCurrency)
	{
		if(this.worth <= 0 || economyCurrency.getWorth() <= 0)
		{
			return 1;
		}
		return this.worth/economyCurrency.getWorth();
	}*/
	
	@Override
	public String toString()
	{
		return "Currency{"+
				"uniquename='"+this.uniqueName+"',"+
				"currencygradation='"+this.currencyGradation.toString()+"',"+
				"server='"+this.server+"',"+
				"world='"+this.world+"',"+
				"worth='"+this.standartUnitWorth+"'}";
	}
}