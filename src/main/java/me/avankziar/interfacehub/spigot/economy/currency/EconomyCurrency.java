package main.java.me.avankziar.interfacehub.spigot.economy.currency;

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
	public CurrencyGradation currencyGradation()
	{
		return currency.currencyGradation;
	}

	@Override
	public String getServer()
	{
		return currency.server;
	}

	@Override
	public String getWorld()
	{
		return currency.world;
	}

	@Override
	public double getWorth()
	{
		return currency.standartUnitWorth;
	}
	
}
