package me.avankziar.ifh.velocity.economy.subinterfaces;

import me.avankziar.ifh.general.economy.action.EconomyAction;
import me.avankziar.ifh.general.economy.action.OrdererType;
import me.avankziar.ifh.velocity.economy.account.Account;

public interface TransactionHandling
{	
	/**
	 * Use to do a simple economy action between 2 Accounts.
	 * <br>If you wish to take or add a amount on one EconomyEntity, please use
	 * <br>the single transaction methode.
	 * @param withdraw
	 * @param deposit
	 * @param amount
	 * @return EconomyAction
	 */
	EconomyAction transaction(Account withdraw, Account deposit, double amount);
	
	EconomyAction transaction(Account withdraw, Account deposit, double amount, boolean withdrawCanGoNegativ);
	
	/**
	 * Use to do a simple economy action between 2 Accounts.
	 * <br>If you wish to take or add a amount on one EconomyEntity, please use
	 * <br>the single transaction methode.
	 * @param withdraw
	 * @param deposit
	 * @param amount
	 * @param type
	 * @param ordererUUID
	 * @param actionLogCategory
	 * @param actionLogComment
	 * @return
	 */
	EconomyAction transaction(Account withdraw, Account deposit, double amount,
			OrdererType type, String ordererUUIDOrPluginName, String actionLogCategory, String actionLogComment);
	
	EconomyAction transaction(Account withdraw, Account deposit, double amount,
			OrdererType type, String ordererUUIDOrPluginName, String actionLogCategory, String actionLogComment, boolean withdrawCanGoNegativ);
	
	/**
	 * Use to do a simple economy action between 2 Accounts.
	 * <br>If you wish to take or add a amount on one EconomyEntity, please use
	 * <br>the single transaction methode.
	 * <br>taxAreExclusiveal is true
	 * <br>-> amountToWithdraw = amount + amount*taxInPercent;
	 * <br>-> amountToDeposit = amount;
	 * <br>-> amountForTax = ammountToWithdraw - amountToDeposit;
	 * <br>taxAreExclusiveal is false
	 * <br>-> amountToWithdraw = amount;
	 * <br>-> amountToDeposit = amount - amount*taxInPercent;
	 * <br>-> amountToTax = amountToWithdraw - amountToDeposit;
	 * <br>Here the money goes into a taxaccount, preferred, in the tax account of the player.
	 * @param withdraw
	 * @param deposit
	 * @param amount
	 * @param taxInPercent
	 * @param taxAreExclusive
	 * @param taxDepot
	 * @return
	 */
	EconomyAction transaction(Account withdraw, Account deposit, double amount,
			double taxInPercent, boolean taxAreExclusive, Account taxDepot);
	
	EconomyAction transaction(Account withdraw, Account deposit, double amount,
			double taxInPercent, boolean taxAreExclusive, Account taxDepot, boolean withdrawCanGoNegativ);
	
	EconomyAction transaction(Account withdraw, Account deposit, double amount,
			double taxInPercent, boolean taxAreExclusive, Account taxDepot,
			OrdererType type, String ordererUUIDOrPluginName, String actionLogCategory, String actionLogComment);
	
	EconomyAction transaction(Account withdraw, Account deposit, double amount,
			double taxInPercent, boolean taxAreExclusive, Account taxDepot,
			OrdererType type, String ordererUUIDOrPluginName, String actionLogCategory, String actionLogComment, boolean withdrawCanGoNegativ);
	
	/**
	 * Use to do a simple economy action of only one EconomyEntity.
	 * Here you can add money from this account.
	 * @param holder
	 * @param amount
	 * @return EconomyAction
	 */
	EconomyAction deposit(Account holder, double amount);
	
	EconomyAction deposit(Account holder, double amount, OrdererType type, String ordererUUIDOrPluginName,
			String actionLogCategory, String actionLogComment);
	
	EconomyAction deposit(Account holder, double amount, double taxInPercent, boolean taxAreExclusive, Account taxDepot);
	
	EconomyAction deposit(Account holder, double amount, double taxInPercent, boolean taxAreExclusive, Account taxDepot,
			OrdererType type, String ordererUUIDOrPluginName, String actionLogCategory, String actionLogComment);
	
	/**
	 * Use to do a simple economy action of only one EconomyEntity.
	 * Here you can take money from this account to the void.
	 * @param holder
	 * @param amount
	 * @return EconomyAction
	 */
	EconomyAction withdraw(Account holder, double amount);
	
	EconomyAction withdraw(Account holder, double amount, boolean withdrawCanGoNegativ);
	
	EconomyAction withdraw(Account holder, double amount, 
			OrdererType type, String ordererUUIDOrPluginName, String actionLogCategory, String actionLogComment);
	
	EconomyAction withdraw(Account holder, double amount, 
			OrdererType type, String ordererUUIDOrPluginName, String actionLogCategory, String actionLogComment, boolean withdrawCanGoNegativ);
	
	EconomyAction withdraw(Account holder, double amount, double taxInPercent, boolean taxAreExclusive, Account taxDepot);
	
	EconomyAction withdraw(Account holder, double amount, double taxInPercent, boolean taxAreExclusive, Account taxDepot, boolean withdrawCanGoNegativ);
	
	EconomyAction withdraw(Account holder, double amount, double taxInPercent, boolean taxAreExclusive, Account taxDepot,
			OrdererType type, String ordererUUIDOrPluginName, String actionLogCategory, String actionLogComment);
	
	EconomyAction withdraw(Account holder, double amount, double taxInPercent, boolean taxAreExclusive, Account taxDepot,
			OrdererType type, String ordererUUIDOrPluginName, String actionLogCategory, String actionLogComment, boolean withdrawCanGoNegativ);
	
	
	EconomyAction exchangeCurrencies(Account withdrawAccount, Account depositAccount, double amountFromWithdrawAccount);
	
	EconomyAction exchangeCurrencies(Account withdrawAccount, Account depositAccount, 
			double amountFromWithdrawAccount, 
			OrdererType type, String ordererUUIDOrPluginName,
			String actionLogCategory, String actionLogComment);
	
	EconomyAction exchangeCurrencies(Account withdrawAccount, Account depositAccount, double amountFromWithdrawAccount,
			double taxInPercent, boolean taxAreExclusive, Account withdrawAccounttaxDepot, Account depositAccounttaxDepot);
	/**
	 * Annotation! Exchange are suppose to happen to the same type of currency, not item to exp or item to normal etc.
	 * @param withdrawAccount
	 * @param depositAccount
	 * @param amountFromWithdrawAccount
	 * @param taxInPercent
	 * @param taxAreExclusive
	 * @param taxDepot
	 * @param type
	 * @param ordererUUIDOrPluginName
	 * @param actionLogCategoryForWithdrawAccount
	 * @param actionLogCommentForWithdrawAccount
	 * @param actionLogCategoryForDepositAccount
	 * @param actionLogCommentFordepositAccount
	 * @return
	 */
	EconomyAction exchangeCurrencies(Account withdrawAccount, Account depositAccount, double amountFromWithdrawAccount,
			double taxInPercent, boolean taxAreExclusive, Account withdrawAccounttaxDepot, Account depositAccounttaxDepot,
			OrdererType type, String ordererUUIDOrPluginName,
			String actionLogCategory, String actionLogComment);
}