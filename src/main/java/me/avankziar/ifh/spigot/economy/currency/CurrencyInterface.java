package main.java.me.avankziar.ifh.spigot.economy.currency;

public interface CurrencyInterface
{
	String getUniqueName();
	
	CurrencyGradation getCurrencyGradation();
	
	CurrencyType getCurrencyType();
	
	boolean isExchangeable();
	
	boolean getTaxationBeforeExchange();
	
	double getExchangeWorth();
}
