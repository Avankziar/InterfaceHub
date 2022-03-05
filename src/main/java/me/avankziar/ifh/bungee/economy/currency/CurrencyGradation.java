package main.java.me.avankziar.ifh.bungee.economy.currency;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class CurrencyGradation
{	
	private final Gradation baseGradation;
	
	private final LinkedHashMap<Integer, Gradation> gradations;
	
	/**
	 * F.e. If you have a currency of copper, silver and gold, where copper is the minor, silver the middle and gold the major,
	 * than is copper the base, silver the FIRST gradation and gold the next/last gradation.
	 * @param baseGradation
	 * @param gradation
	 */
	public CurrencyGradation(Gradation baseGradation, Gradation... gradation) 
	{
		this.baseGradation = baseGradation;
		LinkedHashMap<Integer, Gradation> gradations = new LinkedHashMap<>();
		int i = 1;
		for(Gradation g : gradation)
		{
			gradations.put(i, g);
			i++;
		}
		this.gradations = gradations;
	}
	
	public Gradation getBaseGradation()
	{
		return this.baseGradation;
	}
	
	public int getHighestGradationNumber()
	{
		int i = 1;
		while(true)
		{
			if(this.gradations.containsKey(i))
			{
				i++;
			} else
			{
				break;
			}
		}
		return i;
	}
	
	public Gradation getHighestGradation()
	{
		int i = 1;
		while(true)
		{
			if(this.gradations.containsKey(i))
			{
				i++;
			} else
			{
				break;
			}
		}
		return getGradation(i);
	}
	
	public Gradation getGradation(int gradationNumber)
	{
		if(gradationNumber < 0)
		{
			return this.baseGradation;
		}
		if(this.gradations.containsKey(gradationNumber))
		{
			return this.gradations.get(gradationNumber);
		} else
		{
			if(gradationNumber-1 <= 0)
			{
				return this.baseGradation;
			}
			for(int i = gradationNumber-1; i > 0; i--)
			{
				if(this.gradations.containsKey(i))
				{
					return this.gradations.get(i);
				}
			}
			return this.baseGradation;
		}
	}
	
	@Override
	public String toString()
	{
		String s = "CurrencyGradation{"+this.baseGradation.toString();
		if(!this.gradations.isEmpty())
		{
			for(Entry<Integer, Gradation> e : this.gradations.entrySet())
			{
				s += ";"+e.getValue().toString();
			}
			s += ",";
		}
		s += "}";
		return s;
	}
}