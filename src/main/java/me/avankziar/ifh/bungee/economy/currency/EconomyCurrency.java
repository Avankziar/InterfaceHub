package main.java.me.avankziar.ifh.bungee.economy.currency;

import main.java.me.avankziar.ifh.general.economy.currency.CurrencyType;

public class EconomyCurrency implements CurrencyInterface
{
	private final Currency currency;
	
	protected EconomyCurrency(Currency currency)
	{
		this.currency = currency;
	}

	@Override
	public String getUniqueName()
	{
		return currency.uniqueName;
	}

	@Override
	public CurrencyGradation getCurrencyGradation()
	{
		return currency.currencyGradation;
	}
	
	@Override 
	public CurrencyType getCurrencyType()
	{
		return currency.currencyType;
	}
	
	@Override
	public boolean isExchangeable()
	{
		return currency.isExchangeable;
	}

	@Override
	public double getExchangeWorth()
	{
		return currency.standartUnitWorth;
	}

	@Override
	public boolean getTaxationBeforeExchange()
	{
		return currency.taxationBeforeExchange;
	}
}