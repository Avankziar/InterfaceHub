package main.java.me.avankziar.ifh.velocity.economy.currency;

import main.java.me.avankziar.ifh.general.economy.currency.CurrencyType;

public interface CurrencyInterface
{
	String getUniqueName();
	
	CurrencyGradation getCurrencyGradation();
	
	CurrencyType getCurrencyType();
	
	boolean isExchangeable();
	
	boolean getTaxationBeforeExchange();
	
	double getExchangeWorth();
}
