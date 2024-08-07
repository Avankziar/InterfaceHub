package me.avankziar.ifh.general.economy.account;

public enum AccountType
{
	WALLET(1), BANK(2);
	
	private final int priority;
	
	AccountType(int priority)
	{
		this.priority = priority;
	}
	
	public int getPriority()
	{
		return priority;
	}
}
