package main.java.me.avankziar.ifh.spigot.economy.action;

import main.java.me.avankziar.ifh.spigot.economy.account.EconomyEntity;

public class EconomyAction
{
	public enum ErrorMessageType
	{
		NO_TYPE_SET, //If no error type is set.
		CURRENCYS_ARE_NOT_THE_SAME,
		IS_NOT_ENABLED,
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
	
	private final double withdrawBalanceAfterTransaction;
	
	private final double depositBalanceAfterTransaction;
	
	public EconomyAction(double amount, EconomyEntity withdraw, EconomyEntity deposit,
			boolean transactionSuccess, String defaultErrorMessage, ErrorMessageType errorMessageType,
			double withdrawBalanceAfterTransaction, double depositBalanceAfterTransaction)
	{
		this.amount = amount;
		this.withdraw = withdraw;
		this.deposit = deposit;
		this.transactionSuccess = transactionSuccess;
		this.defaultErrorMessage = defaultErrorMessage;
		this.errorMessageType = errorMessageType;
		this.withdrawBalanceAfterTransaction = withdrawBalanceAfterTransaction;
		this.depositBalanceAfterTransaction = depositBalanceAfterTransaction;
	}
	
	public EconomyAction(double amount, EconomyEntity withdraw, boolean transactionSuccess, String defaultErrorMessage, 
			double withdrawBalanceAfterTransaction, double depositBalanceAfterTransaction)
	{
		this(amount, withdraw, null, transactionSuccess, defaultErrorMessage, ErrorMessageType.NO_TYPE_SET, 
				withdrawBalanceAfterTransaction, depositBalanceAfterTransaction);
	}
	
	public EconomyAction(double amount, EconomyEntity withdraw,
			boolean transactionSuccess, String defaultErrorMessage, ErrorMessageType errorMessageType, 
			double withdrawBalanceAfterTransaction, double depositBalanceAfterTransaction)
	{
		this(amount, withdraw, null, transactionSuccess, defaultErrorMessage, errorMessageType,
				withdrawBalanceAfterTransaction, depositBalanceAfterTransaction);
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

	public double getWithdrawBalanceAfterTransaction()
	{
		return withdrawBalanceAfterTransaction;
	}

	public double getDepositBalanceAfterTransaction()
	{
		return depositBalanceAfterTransaction;
	}
}
