package main.java.me.avankziar.ifh.bungee.economy.currency;

import main.java.me.avankziar.ifh.spigot.economy.currency.CurrencyType;

public interface CurrencyInterface
{
	String getUniqueName();
	
	CurrencyGradation getCurrencyGradation();
	
	CurrencyType getCurrencyType();
	
	boolean isExchangeable();
	
	boolean getTaxationBeforeExchange();
	
	double getExchangeWorth();
}
