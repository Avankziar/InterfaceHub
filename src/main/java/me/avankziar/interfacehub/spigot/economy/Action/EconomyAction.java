package main.java.me.avankziar.interfacehub.spigot.economy.Action;

import main.java.me.avankziar.interfacehub.spigot.economy.account.EconomyEntity;

public class EconomyAction
{
	private final boolean transactionSuccess;
	
	private final String transactionMessage;
	
	private final EconomyEntity holder;
	
	private final EconomyEntity participant;
	
	private final double amount;
	
	public EconomyAction(double amount, EconomyEntity holder, EconomyEntity participant, boolean transactionSuccess, String transactionMessage)
	{
		this.amount = amount;
		this.holder = holder;
		this.participant = participant;
		this.transactionSuccess = transactionSuccess;
		this.transactionMessage = transactionMessage;
	}
	
	public EconomyAction(double amount, EconomyEntity holder, boolean transactionSuccess, String transactionMessage)
	{
		this(amount, holder, null, transactionSuccess, transactionMessage);
	}
	
	public EconomyAction(double amount, EconomyEntity holder, boolean transactionSuccess)
	{
		this(amount, holder, null, transactionSuccess, null);
	}
	
	public boolean isSuccess()
	{
		return transactionSuccess;
	}
	
	public EconomyEntity getHolder()
	{
		return holder;
	}
	
	public EconomyEntity getParticipant()
	{
		return participant;
	}
	
	public double getAmount()
	{
		return amount;
	}
	
	public String getMessage()
	{
		return transactionMessage;
	}
}
