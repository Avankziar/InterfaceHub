package main.java.me.avankziar.interfacehub.spigot.economy.currencydigitalold;

import java.util.Locale;

public class EconomyCurrency implements DigitalCurrency
{
	private final CurrencyConcept currencyConcept;
	
	protected EconomyCurrency(CurrencyConcept currencyConcept)
	{
		this.currencyConcept = currencyConcept;
	}
	
	@Override
	public String getUniqueName()
	{
		return currencyConcept.uniqueName;
	}

	@Override
	public String getMajorSingular()
	{
		return currencyConcept.majorSingular;
	}

	@Override
	public String getMajorPlural()
	{
		return currencyConcept.majorPlural;
	}

	@Override
	public String getMinorSingular()
	{
		return currencyConcept.minorSingular;
	}

	@Override
	public String getMinorPlural()
	{
		return currencyConcept.minorPlural;
	}

	@Override
	public Locale getLocale()
	{
		return currencyConcept.locale;
	}

	@Override
	public String getWorld()
	{
		return currencyConcept.world;
	}

	@Override
	public double getWorth()
	{
		return currencyConcept.worth;
	}
	
	
}
