package main.java.me.avankziar.ifh.spigot.economy.subinterfaces;

import java.util.ArrayList;
import java.util.UUID;

import main.java.me.avankziar.ifh.spigot.economy.account.Account;
import main.java.me.avankziar.ifh.spigot.economy.account.AccountType;
import main.java.me.avankziar.ifh.spigot.economy.account.EconomyEntity;
import main.java.me.avankziar.ifh.spigot.economy.currency.EconomyCurrency;

public interface AccountHandling
{
	int getMultiAccountLimit(EconomyEntity.EconomyType entityType, AccountType accountType);
	
	int getMultiAccountLimit(EconomyEntity.EconomyType entityType, AccountType accountType, String server, String world);
	
	double getAccountSizeLimit(EconomyEntity.EconomyType entityType, AccountType accountType);
	
	double getAccountSizeLimit(EconomyEntity.EconomyType entityType, AccountType accountType, String server, String world);
	
	boolean hasAccount(UUID uuid, EconomyCurrency accountCurrency, AccountType accountType, EconomyEntity.EconomyType entityType);	
	
	boolean createAccount(Account account);
	
	boolean createAccount(String accountName, AccountType type, EconomyCurrency accountCurrency,
			EconomyEntity owner, double balance);
	
	boolean createAccount(String accountName, AccountType type, EconomyCurrency accountCurrency,
			EconomyEntity owner, double balance, String server, String world);
	
	boolean deleteAccount(Account account);
	
	boolean deleteAccount(EconomyCurrency accountCurrency);
	
	boolean deleteAllAccounts(UUID uuid);
	
	boolean deleteAllAccounts(UUID uuid, AccountType accountType);
	
	boolean deleteAllAccounts(UUID uuid, EconomyEntity.EconomyType entityType);
	
	boolean deleteAllAccounts(UUID uuid, EconomyEntity.EconomyType entityType, AccountType accountType);
	
	boolean deleteAllAccounts(UUID uuid, EconomyEntity.EconomyType entityType, AccountType accountType, String server, String world);
	
	boolean deleteAllAccounts(AccountType accountType);
	
	boolean deleteAllAccounts(EconomyEntity.EconomyType entityType);
	
	boolean deleteAllAccounts(EconomyEntity.EconomyType entityType, AccountType accountType);
	
	boolean deleteAllAccounts(String server, String world);
	
	boolean deleteAllAccounts(EconomyEntity.EconomyType entityType, AccountType accountType, String server, String world);
	
	/**
	 * Get the Account
	 * @param ownerUUID
	 * @param accountCurrency
	 * @param accountType
	 * @param ownerEntityType
	 * @return
	 */
	Account getAccount(String accountName);
	
	Account getAccount(UUID ownerUUID, EconomyEntity.EconomyType ownerEntityType, AccountType accountType, EconomyCurrency accountCurrency);
	
	Account getAccount(EconomyEntity owner, AccountType accountType, EconomyCurrency accountCurrency);
	
	Account getAccount(UUID ownerUUID, EconomyCurrency accountCurrency, AccountType accountType, EconomyEntity.EconomyType ownerEntityType,
			String server, String world);
	
	ArrayList<Account> getAccounts();
	
	ArrayList<Account> getAccounts(AccountType accountType);
	
	ArrayList<Account> getAccounts(EconomyEntity.EconomyType ownerType);
	
	ArrayList<Account> getAccount(AccountType accountType, EconomyEntity.EconomyType ownerType);
	
	ArrayList<Account> getAccount(AccountType accountType, EconomyEntity.EconomyType ownerType, String server, String world);
	
	Account getPlayerDefaultAccount(UUID ownerUUID);
	
	Account getPlayerDefaultAccount(UUID ownerUUID, String server, String world);
	
	void setPlayerDefaultAccount(Account account);
	
	void setPlayerDefaultAccount(Account account, String server, String world);
	
	boolean setOwner(Account account, EconomyEntity newowner);
	
	boolean isMember(Account account, EconomyEntity member);
	
	boolean canWithdrawAsMember(Account account, EconomyEntity member);
	
	boolean addMember(Account account, EconomyEntity member, boolean canWithdraw);
	
	boolean removeMember(Account account, EconomyEntity member);
	
	Account getDefaultTaxAccount(EconomyCurrency accountCurrency);
	
	Account getDefaultTaxAccount(EconomyCurrency accountCurrency, String server, String world);
	
	Account getDefautVoidAccount(EconomyCurrency accountCurrency);
	
	Account getDefautVoidAccount(EconomyCurrency accountCurrency, String server, String world);
}