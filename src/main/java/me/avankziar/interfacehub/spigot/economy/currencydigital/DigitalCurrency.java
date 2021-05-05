package main.java.me.avankziar.interfacehub.spigot.economy.currencydigital;

import java.util.Locale;

public interface DigitalCurrency
{
	String getUniqueName();
	
	String getMajorSingular();
	
	String getMajorPlural();
	
	String getMinorSingular();
	
	String getMinorPlural();
	
	Locale getLocale();
	
	String getWorld();
	
	double getWorth();
	
	
}