package main.java.me.avankziar.ifh.spigot.economy.subinterfaces;

import main.java.me.avankziar.ifh.spigot.economy.Action.EconomyAction;
import main.java.me.avankziar.ifh.spigot.economy.account.Account;

public interface TransactionHandling
{
	/**
	 * Use to do a simple economy action between 2 Accounts.
	 * <br>If you wish to take of add a amount on one EconomyEntity, please use
	 * <br>the single transaction methode.
	 * @param withdraw
	 * @param deposit
	 * @param amount
	 * @return EconomyAction
	 */
	EconomyAction transaction(Account withdraw, Account deposit, double amount);
	
	EconomyAction transaction(Account withdraw, Account deposit, double amount, double taxpercent);
	
	EconomyAction transaction(Account withdraw, Account deposit, double amount, double taxAsPercent, Account taxDepot);
	
	/**
	 * Use to do a simple economy action of only one EconomyEntity.
	 * Here you can take or add money from this account to or from the void.
	 * @param holder
	 * @param amount
	 * @return EconomyAction
	 */
	EconomyAction transaction(Account holder, double amount);
	
	EconomyAction transaction(Account holder, double amount, double taxAsPercent);
	
	EconomyAction transaction(Account holder, double amount, double taxAsPercent, Account taxDepot);
}