package me.avankziar.ifh.spigot.economy.currency;

import me.avankziar.ifh.general.economy.currency.CurrencyType;

public interface CurrencyInterface
{
	String getUniqueName();
	
	CurrencyGradation getCurrencyGradation();
	
	CurrencyType getCurrencyType();
	
	boolean isExchangeable();
	
	boolean getTaxationBeforeExchange();
	
	double getExchangeWorth();
}
