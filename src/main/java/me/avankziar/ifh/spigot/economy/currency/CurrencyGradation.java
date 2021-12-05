package main.java.me.avankziar.ifh.spigot.economy.currency;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.bukkit.inventory.ItemStack;

public class CurrencyGradation
{
	private final Gradation baseGradation;
	
	private final LinkedHashMap<Integer, Gradation> gradations;
	
	private boolean useItemStackCurrency = false;
	
	/*
	 * The define of a itemstack to a currency at BaseGradation.
	 */
	private LinkedHashMap<ItemStack, Double> itemStackMap = new LinkedHashMap<>();
	
	private boolean useExperienceCurrency = false;
	
	/*
	 * the worth of 1 player experience to 1 currency (baseGradation).
	 */
	private int experienceWorth = Integer.MAX_VALUE;
	
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
	
	public CurrencyGradation setUseItemStackCurrency(boolean useItemStackCurrency)
	{
		this.useItemStackCurrency = useItemStackCurrency;
		return this;
	}
	
	public CurrencyGradation addItemStackWorthToBaseGradation(ItemStack itemstack, double worth)
	{
		this.itemStackMap.put(itemstack, worth);
		return this;
	}
	
	public CurrencyGradation setUseExperienceCurrency(boolean useExperienceCurrency)
	{
		this.useExperienceCurrency = useExperienceCurrency;
		return this;
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
		s += "UseItemStackCurrency="+this.useItemStackCurrency+",";
		if(!this.itemStackMap.isEmpty())
		{
			s += "ItemStackMap{";
			int i = 0;
			for(Entry<ItemStack, Double> e : this.itemStackMap.entrySet())
			{
				s += "ItemStack="+e.getKey().toString()+",Worth="+e.getValue().toString();
				if(i-1 < this.itemStackMap.size())
				{
					s += ";";
				}
			}
			s += "}";
		}
		s += "UseExperienceWorth="+this.useExperienceCurrency+",ExperienceWorth="+this.experienceWorth+"}";
		return s;
	}
}