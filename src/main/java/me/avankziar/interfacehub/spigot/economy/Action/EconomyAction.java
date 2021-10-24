package main.java.me.avankziar.interfacehub.spigot.economy.Action;

import main.java.me.avankziar.interfacehub.spigot.economy.account.EconomyEntity;

public class EconomyAction
{
	private final boolean transactionSuccess;
	
	private final String transactionMessage;
	
	private final EconomyEntity withdraw;
	
	private final EconomyEntity deposit;
	
	private final double amount;
	
	public EconomyAction(double amount, EconomyEntity withdraw, EconomyEntity deposit, boolean transactionSuccess, String transactionMessage)
	{
		this.amount = amount;
		this.withdraw = withdraw;
		this.deposit = deposit;
		this.transactionSuccess = transactionSuccess;
		this.transactionMessage = transactionMessage;
	}
	
	public EconomyAction(double amount, EconomyEntity withdraw, boolean transactionSuccess, String transactionMessage)
	{
		this(amount, withdraw, null, transactionSuccess, transactionMessage);
	}
	
	public EconomyAction(double amount, EconomyEntity withdraw, boolean transactionSuccess)
	{
		this(amount, withdraw, null, transactionSuccess, null);
	}
	
	public boolean isSuccess()
	{
		return transactionSuccess;
	}
	
	public EconomyEntity getWithdraw()
	{
		return withdraw;
	}
	
	public EconomyEntity getDeposit()
	{
		return deposit;
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
