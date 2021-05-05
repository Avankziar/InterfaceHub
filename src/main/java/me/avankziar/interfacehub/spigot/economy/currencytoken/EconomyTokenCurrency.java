package main.java.me.avankziar.interfacehub.spigot.economy.currencytoken;

import org.bukkit.inventory.ItemStack;

public class EconomyTokenCurrency implements TokenCurrency
{
	private final TokenConcept tokenConcept;
	
	public EconomyTokenCurrency(TokenConcept tokenConcept)
	{
		this.tokenConcept = tokenConcept;
	}

	@Override
	public String getSingular()
	{
		return tokenConcept.singular;
	}

	@Override
	public String getPlural()
	{
		return tokenConcept.plural;
	}

	@Override
	public double getTokenWorth()
	{
		return tokenConcept.tokenWorth;
	}

	@Override
	public double getTokenWorth(ItemStack itemStack)
	{
		return tokenConcept.itemStackMap.getOrDefault(itemStack, 0.0);
	}

	@Override
	public double getTokenExpLevelWorth()
	{
		return tokenConcept.tokenExpLevelWorth;
	}

}
