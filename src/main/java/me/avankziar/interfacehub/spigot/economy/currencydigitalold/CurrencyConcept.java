package main.java.me.avankziar.interfacehub.spigot.economy.currencydigitalold;

import java.util.Locale;

public class CurrencyConcept
{
	/**
	 * set a name like "Dollar" or a unique name.
	 */
	protected String uniqueName;
	/*
	 * set a name like "Dollar".
	 */
	protected String majorSingular;
	
	/*
	 * set a name like "Dollars".
	 */
	protected String majorPlural;
	
	/*
	 * set a name like "Cent".
	 */
	protected String minorSingular;
	
	/*
	 * set a name like "Cents".
	 */
	protected String minorPlural;
	
	/*
	 * Your locale.
	 */
	protected Locale locale;
	
	/*
	 * the applied world.
	 */
	protected String world;
	
	/*
	 * The worth of the currency to a undefine standartunit.
	 * For example, if this currency is worth 0.25 and a other currency is 1.25, 
	 * then need to change 5 times this currency for 1 unit of the other.
	 */
	protected double worth = 1;
	
	protected CurrencyConcept(){}
	
	public CurrencyConcept setUnique(String uniqueName)
	{
		this.uniqueName = uniqueName;
		return this;
	}
	
	public CurrencyConcept setWorld(String world)
	{
		this.world = world;
		return this;
	}
	
	public CurrencyConcept setMajorSingular(String majorSingular)
	{
		this.majorSingular = majorSingular;
		return this;
	}
	
	public CurrencyConcept setMajorPlural(String majorPlural)
	{
		this.majorPlural = majorPlural;
		return this;
	}
	
	public CurrencyConcept setMinorSingular(String minorSingular)
	{
		this.minorSingular = minorSingular;
		return this;
	}
	
	public CurrencyConcept setMinorPlural(String minorPlural)
	{
		this.minorPlural = minorPlural;
		return this;
	}
	
	public CurrencyConcept setLocale(Locale locale)
	{
		this.locale = locale;
		return this;
	}
	
	public CurrencyConcept setWorth(double worth)
	{
		this.worth = worth;
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
	public double worthRatioTo(EconomyCurrency economyCurrency)
	{
		if(this.worth <= 0 || economyCurrency.getWorth() <= 0)
		{
			return 1;
		}
		return this.worth/economyCurrency.getWorth();
	}
	
	@Override
	public String toString()
	{
		return "DigitalCurrency{"+
				"majorsingular='"+majorSingular+"',"+
				"majorplural='"+majorPlural+"',"+
				"minorsingular='"+minorSingular+"',"+
				"minorplural='"+minorPlural+"',"+
				"locale='"+locale+"',"+
				"worth='"+worth+"'}";
	}
}
