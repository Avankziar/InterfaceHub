package me.avankziar.ifh.spigot.economy.currency;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class CurrencyGradation
{	
	private final Gradation baseGradation;
	
	private final LinkedHashMap<Integer, Gradation> gradations;
	
	/*
	 * the worth of 1 currency to 1 playerexperience (baseGradation).
	 */
	private double experienceWorth = Double.MAX_VALUE;
	
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
				if(i == 1)
				{
					i = 0;
				} else
				{
					i--;
				}
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
				if(i == 1)
				{
					i = 0;
				} else
				{
					i--;
				}
				break;
			}
		}
		return getGradation(i);
	}
	
	public Gradation getGradation(int gradationNumber)
	{
		if(gradationNumber <= 0)
		{
			return this.baseGradation;
		}
		if(this.gradations.containsKey(gradationNumber))
		{
			return this.gradations.get(gradationNumber);
		} else
		{
			for(int i = gradationNumber; i > 0; i--)
			{
				if(this.gradations.containsKey(i))
				{
					return this.gradations.get(i);
				}
			}
			return this.baseGradation;
		}
	}
	
	public CurrencyGradation setExperienceWorthToBaseGradation(int experienceWorth)
	{
		this.experienceWorth = experienceWorth;
		return this;
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
		s += ",ExperienceWorth="+this.experienceWorth+"}";
		return s;
	}
}