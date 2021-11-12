package main.java.me.avankziar.ifh.spigot.economy.currency;

public interface CurrencyInterface
{
	String getUniqueName();
	
	CurrencyGradation getCurrencyGradation();
	
	String getServer();
	
	String getWorld();
	
	double getWorth();
}
