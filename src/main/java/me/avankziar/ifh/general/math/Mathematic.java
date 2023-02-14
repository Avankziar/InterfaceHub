package main.java.me.avankziar.ifh.general.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Mathematic
{
	public static double round(double value)
	{
		return round(value, 0, RoundingMode.HALF_UP);
	}
	
	public static double round(double value, int places)
	{
		return round(value, places, RoundingMode.HALF_UP);
	}
	
	public static double round(double value, int places, RoundingMode roundingMode)
	{
	    try
	    {
	    	BigDecimal bd = BigDecimal.valueOf(value);
		    bd = bd.setScale(places < 0 ? 0 : places, roundingMode);
		    return bd.doubleValue();
	    } catch (NumberFormatException e)
	    {
	    	return 0;
	    }
	}
	
	//Regionsberechnungen oder so machen
}