package me.avankziar.ifh.general.math;

public class MatchPrimitiveDataTypes
{
	public static boolean isBoolean(String boo)
	{
		if(boo == null)
		{
			return false;
		}
		if(boo.equalsIgnoreCase("true") || boo.equalsIgnoreCase("1")
				|| boo.equalsIgnoreCase("false") || boo.equalsIgnoreCase("0"))
		{
			return true;
		}
		return false;
	}
	
	public static Boolean getBoolean(String boo)
	{
		if(boo.equalsIgnoreCase("true") || boo.equalsIgnoreCase("1"))
		{
			return true;
		} else if(boo.equalsIgnoreCase("false") || boo.equalsIgnoreCase("0"))
		{
			return false;
		}
		return null;
	}
	
	public static boolean isByte(String number)
	{
		if(number == null)
		{
			return false;
		}
		try
		{
			Byte.parseByte(number);
			return true;
		} catch (Exception e) 
		{
			return false;
		}
	}
	
	public static boolean isShort(String number)
	{
		if(number == null)
		{
			return false;
		}
		try
		{
			Short.parseShort(number);
			return true;
		} catch (Exception e) 
		{
			return false;
		}
	}
	
	public static boolean isInteger(String number)
	{
		if(number == null)
		{
			return false;
		}
		try
		{
			Integer.parseInt(number);
			return true;
		} catch (Exception e) 
		{
			return false;
		}
	}
	
	public static boolean isLong(String number)
	{
		if(number == null)
		{
			return false;
		}
		try
		{
			Long.parseLong(number);
			return true;
		} catch (Exception e) 
		{
			return false;
		}
	}
	
	public static boolean isDouble(String number)
	{
		if(number == null)
		{
			return false;
		}
		try
		{
			Double.parseDouble(number);
			return true;
		} catch (Exception e) 
		{
			return false;
		}
	}
	
	public static boolean isFloat(String number)
	{
		if(number == null)
		{
			return false;
		}
		try
		{
			Float.parseFloat(number);
			return true;
		} catch (Exception e) 
		{
			return false;
		}
	}
}