package main.java.me.avankziar.interfacehub.spigot.economy.currency;

public interface CurrencyInterface
{
	String getUniqueName();
	
	CurrencyGradation currencyGradation();
	
	String getServer();
	
	String getWorld();
	
	double getWorth();
}
