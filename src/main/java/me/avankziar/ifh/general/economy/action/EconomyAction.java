package main.java.me.avankziar.ifh.general.economy.action;

public class EconomyAction
{
	public enum ErrorMessageType
	{
		NO_TYPE_SET, //If no error type is set.
		SUCCESS,
		CURRENCYS_ARE_NOT_THE_SAME,
		CURRENCYS_ARE_NOT_EXCHANGEABLE,
		IS_NOT_ENABLED,
		HAS_NO_WALLET_SUPPORT,
		HAS_NO_BANK_SUPPORT,
		WITHDRAW_ACCOUNT_DONT_EXIST, DEPOSIT_ACCOUNT_DONT_EXIST, TAX_ACCOUNT_DONT_EXIST,
		WITHDRAW_HAS_NOT_ENOUGH,
		AMOUNT_IS_NEGATIVE,
		TAX_IS_NEGATIVE,
		TAX_IS_HIGHER_OR_EQUAL_AS_100_PERCENT
	}
	
	private final ErrorMessageType errorMessageType;
	
	private final String defaultErrorMessage;
	
	private final boolean transactionSuccess;
	
	private final double withDrawAmount;
	
	private final double depositAmount;
	
	private final double taxAmount;
	
	private final double withdrawBalanceAfterTransaction;
	
	private final double depositBalanceAfterTransaction;
	
	public EconomyAction(double withDrawAmount, double depositAmount, double taxAmount,
			boolean transactionSuccess, String defaultErrorMessage, ErrorMessageType errorMessageType,
			double withdrawBalanceAfterTransaction, double depositBalanceAfterTransaction)
	{
		this.withDrawAmount = withDrawAmount;
		this.depositAmount = depositAmount;
		this.taxAmount = taxAmount;
		this.transactionSuccess = transactionSuccess;
		this.defaultErrorMessage = defaultErrorMessage;
		this.errorMessageType = errorMessageType;
		this.withdrawBalanceAfterTransaction = withdrawBalanceAfterTransaction;
		this.depositBalanceAfterTransaction = depositBalanceAfterTransaction;
	}
	
	public boolean isSuccess()
	{
		return transactionSuccess;
	}
	
	public double getWithDrawAmount()
	{
		return withDrawAmount;
	}
	
	public double getDepositAmount()
	{
		return depositAmount;
	}
	
	public double getTaxAmount()
	{
		return taxAmount;
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
