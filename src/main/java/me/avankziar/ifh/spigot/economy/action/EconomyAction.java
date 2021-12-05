package main.java.me.avankziar.ifh.spigot.economy.action;

import main.java.me.avankziar.ifh.spigot.economy.account.EconomyEntity;

public class EconomyAction
{
	public enum ErrorMessageType
	{
		NO_TYPE_SET,
		ISNT_ENABLED,
		HAS_NO_WALLET_SUPPORT,
		HAS_NO_BANK_SUPPORT,
		WITHDRAW_ACCOUNT_DONT_EXIST, DEPOSIT_ACCOUNT_DONT_EXIST, TAX_ACCOUNT_DONT_EXIST,
		WITHDRAW_HAS_NOT_ENOUGH,
		WITHDRAW_IS_NEGATIV,
		DEPOSIT_IS_NEGATIV,
		TAX_IS_HIGHER_AS_100_PERCENT
	}
	
	private final ErrorMessageType errorMessageType;
	
	private final String defaultErrorMessage;
	
	private final boolean transactionSuccess;
	
	private final EconomyEntity withdraw;
	
	private final EconomyEntity deposit;
	
	private final double amount;
	
	private final double withdrawBalance;
	
	private final double depositBalance;
	
	public EconomyAction(double amount, EconomyEntity withdraw, EconomyEntity deposit,
			boolean transactionSuccess, String defaultErrorMessage, ErrorMessageType errorMessageType,
			double withdrawBalance, double depositBalance)
	{
		this.amount = amount;
		this.withdraw = withdraw;
		this.deposit = deposit;
		this.transactionSuccess = transactionSuccess;
		this.defaultErrorMessage = defaultErrorMessage;
		this.errorMessageType = errorMessageType;
		this.withdrawBalance = withdrawBalance;
		this.depositBalance = depositBalance;
	}
	
	public EconomyAction(double amount, EconomyEntity withdraw, boolean transactionSuccess, String defaultErrorMessage, 
			double withdrawBalance, double depositBalance)
	{
		this(amount, withdraw, null, transactionSuccess, defaultErrorMessage, ErrorMessageType.NO_TYPE_SET, 
				withdrawBalance, depositBalance);
	}
	
	public EconomyAction(double amount, EconomyEntity withdraw,
			boolean transactionSuccess, String defaultErrorMessage, ErrorMessageType errorMessageType, 
			double withdrawBalance, double depositBalance)
	{
		this(amount, withdraw, null, transactionSuccess, defaultErrorMessage, errorMessageType,
				withdrawBalance, depositBalance);
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

	public ErrorMessageType getErrorMessageType()
	{
		return errorMessageType;
	}

	public String getDefaultErrorMessage()
	{
		return defaultErrorMessage;
	}

	public double getWithdrawBalance()
	{
		return withdrawBalance;
	}

	public double getDepositBalance()
	{
		return depositBalance;
	}
}
