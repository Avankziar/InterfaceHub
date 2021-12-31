package main.java.me.avankziar.ifh.spigot.economy.subinterfaces;

import java.util.LinkedHashMap;
import java.util.UUID;

import org.bukkit.inventory.ItemStack;

import main.java.me.avankziar.ifh.spigot.economy.account.Account;
import main.java.me.avankziar.ifh.spigot.economy.action.EconomyAction;

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
	
	EconomyAction transaction(Account withdraw, Account deposit, double amount,
			UUID orderer, String actionLogCategory, String actionLogComment);
	
	/**
	 * Use to do a simple economy action between 2 Accounts.
	 * <br>If you wish to take or add a amount on one EconomyEntity, please use
	 * <br>the single transaction methode.
	 * <br>taxAreAdditional is true => amountWhichAreWithdrawn = amount + amount*taxInPercent
	 * <br>taxAreAdditional is false=> amountWhichAreWithdrawn = amount - amount*taxInPercent
	 * @param withdraw
	 * @param deposit
	 * @param amount
	 * @param taxInPercent
	 * @param taxAreAddition
	 * @return
	 */
	EconomyAction transaction(Account withdraw, Account deposit, double amount, double taxInPercent, boolean taxAreAddition);
	
	EconomyAction transaction(Account withdraw, Account deposit, double amount, double taxInPercent, boolean taxAreAddition,
			UUID orderer, String actionLogCategory, String actionLogComment);
	
	EconomyAction transaction(Account withdraw, Account deposit, double amount, double taxInPercent, boolean taxAreAddition, Account taxDepot);
	
	EconomyAction transaction(Account withdraw, Account deposit, double amount, double taxInPercent, boolean taxAreAddition, Account taxDepot,
			UUID orderer, String actionLogCategory, String actionLogComment);
	
	/**
	 * Use to do a simple economy action of only one EconomyEntity.
	 * Here you can add money from this account.
	 * @param holder
	 * @param amount
	 * @return EconomyAction
	 */
	EconomyAction deposit(Account holder, double amount);
	
	EconomyAction deposit(Account holder, double amount, UUID orderer,
			String actionLogCategory, String actionLogComment);
	
	EconomyAction deposit(Account holder, double amount, double taxInPercent, boolean taxAreAddition);
	
	EconomyAction deposit(Account holder, double amount, double taxInPercent, boolean taxAreAddition,
			UUID orderer, String actionLogCategory, String actionLogComment);
	
	EconomyAction deposit(Account holder, double amount, double taxInPercent, boolean taxAreAddition, Account taxDepot);
	
	EconomyAction deposit(Account holder, double amount, double taxInPercent, boolean taxAreAddition, Account taxDepot,
			UUID orderer, String actionLogCategory, String actionLogComment);
	
	/**
	 * Use to do a simple economy action of only one EconomyEntity.
	 * Here you can take money from this account to the void.
	 * @param holder
	 * @param amount
	 * @return EconomyAction
	 */
	EconomyAction withdraw(Account holder, double amount);
	
	EconomyAction withdraw(Account holder, double amount, 
			UUID orderer, String actionLogCategory, String actionLogComment);
	
	EconomyAction withdraw(Account holder, double amount, double taxInPercent, boolean taxAreAddition);
	
	EconomyAction withdraw(Account holder, double amount, double taxInPercent, boolean taxAreAddition, 
			UUID orderer, String actionLogCategory, String actionLogComment);
	
	EconomyAction withdraw(Account holder, double amount, double taxInPercent, boolean taxAreAddition, Account taxDepot);
	
	EconomyAction withdraw(Account holder, double amount, double taxInPercent, boolean taxAreAddition, Account taxDepot,
			UUID orderer, String actionLogCategory, String actionLogComment);
	
	EconomyAction withdraw(Account holder, double amount, LinkedHashMap<ItemStack, Double> possibleItemsWithRelatedValue,
			double taxInPercent, boolean taxAreAddition, Account taxDepot,
			UUID orderer, String actionLogCategory, String actionLogComment);
}