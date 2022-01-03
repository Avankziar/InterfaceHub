package main.java.me.avankziar.ifh.spigot.economy.subinterfaces;

import java.util.ArrayList;
import java.util.UUID;

import main.java.me.avankziar.ifh.spigot.economy.account.Account;
import main.java.me.avankziar.ifh.spigot.economy.account.AccountCategory;
import main.java.me.avankziar.ifh.spigot.economy.account.AccountManagementType;
import main.java.me.avankziar.ifh.spigot.economy.account.AccountType;
import main.java.me.avankziar.ifh.spigot.economy.account.EconomyEntity;
import main.java.me.avankziar.ifh.spigot.economy.currency.EconomyCurrency;

public interface AccountHandling
{
	int getMultiAccountLimit(EconomyEntity.EconomyType entityType, AccountType accountType);
	
	int getMultiAccountLimit(EconomyEntity.EconomyType entityType, AccountType accountType, String server, String world);
	
	double getAccountSizeLimit(EconomyEntity.EconomyType entityType, AccountType accountType);
	
	double getAccountSizeLimit(EconomyEntity.EconomyType entityType, AccountType accountType, String server, String world);
	
	boolean hasAccount(UUID uuid, EconomyCurrency accountCurrency, AccountType accountType, AccountCategory accountCategory,
			EconomyEntity.EconomyType entityType);	
	
	boolean createAccount(Account account);
	
	boolean createAccount(String accountName, AccountType type, AccountCategory accountCategory, EconomyCurrency accountCurrency,
			EconomyEntity owner, double balance);
	
	boolean createAccount(String accountName, AccountType type, AccountCategory accountCategory, EconomyCurrency accountCurrency,
			EconomyEntity owner, double balance, String server, String world);
	
	/**
	 * Return the amount the deleted account.
	 * @param account
	 * @return
	 */
	int deleteAccount(Account account);
	
	/**
	 * Return the amount the deleted account.
	 * @param accountCurrency
	 * @return
	 */
	int deleteAccount(EconomyCurrency accountCurrency);
	
	/**
	 * Return the amount the deleted account.
	 * @param uuid
	 * @return
	 */
	int deleteAllAccounts(UUID uuid);
	
	/**
	 * Return the amount the deleted account.
	 * @param uuid
	 * @param accountType
	 * @return
	 */
	int deleteAllAccounts(UUID uuid, AccountType accountType);
	
	/**
	 * Return the amount the deleted account.
	 * @param uuid
	 * @param entityType
	 * @return
	 */
	int deleteAllAccounts(UUID uuid, EconomyEntity.EconomyType entityType);
	
	/**
	 * Return the amount the deleted account.
	 * @param uuid
	 * @param entityType
	 * @param accountType
	 * @return
	 */
	int deleteAllAccounts(UUID uuid, EconomyEntity.EconomyType entityType, AccountType accountType);
	
	/**
	 * Return the amount the deleted account.
	 * @param uuid
	 * @param entityType
	 * @param accountType
	 * @param server
	 * @param world
	 * @return
	 */
	int deleteAllAccounts(UUID uuid, EconomyEntity.EconomyType entityType, AccountType accountType, String server, String world);
	
	/**
	 * Return the amount the deleted account.
	 * @param accountType
	 * @return
	 */
	int deleteAllAccounts(AccountType accountType);
	
	/**
	 * Return the amount the deleted account.
	 * @param accountCategory
	 * @return
	 */
	int deleteAllAccounts(AccountCategory accountCategory);
	
	/**
	 * Return the amount the deleted account.
	 * @param entityType
	 * @return
	 */
	int deleteAllAccounts(EconomyEntity.EconomyType entityType);
	
	/**
	 * Return the amount the deleted account.
	 * @param entityType
	 * @param accountType
	 * @return
	 */
	int deleteAllAccounts(EconomyEntity.EconomyType entityType, AccountType accountType);
	
	/**
	 * Return the amount the deleted account.
	 * @param server
	 * @param world
	 * @return
	 */
	int deleteAllAccounts(String server, String world);
	
	/**
	 * Return the amount the deleted account.
	 * @param entityType
	 * @param accountType
	 * @param server
	 * @param world
	 * @return
	 */
	int deleteAllAccounts(EconomyEntity.EconomyType entityType, AccountType accountType, String server, String world);
	
	Account getAccount(UUID ownerUUID, EconomyEntity.EconomyType ownerEntityType, AccountType accountType, AccountCategory accountCategory,
			EconomyCurrency accountCurrency);
	
	Account getAccount(EconomyEntity owner, AccountType accountType, AccountCategory accountCategory, EconomyCurrency accountCurrency);
	
	Account getAccount(UUID ownerUUID, EconomyCurrency accountCurrency, AccountType accountType, AccountCategory accountCategory,
			EconomyEntity.EconomyType ownerEntityType, String server, String world);
	
	ArrayList<Account> getAccounts();
	
	ArrayList<Account> getAccounts(AccountType accountType);
	
	ArrayList<Account> getAccounts(EconomyEntity.EconomyType ownerType);
	
	ArrayList<Account> getAccounts(AccountCategory accountCategory);
	
	ArrayList<Account> getAccount(AccountType accountType, EconomyEntity.EconomyType ownerType);
	
	ArrayList<Account> getAccount(AccountType accountType, EconomyEntity.EconomyType ownerType, AccountCategory accountCategory);
	
	ArrayList<Account> getAccount(AccountType accountType, EconomyEntity.EconomyType ownerType, String server, String world);
	
	ArrayList<Account> getAccount(AccountType accountType, EconomyEntity.EconomyType ownerType, AccountCategory accountCategory, 
			String server, String world);
	
	Account getPlayerDefaultAccount(UUID ownerUUID, AccountType accountType, AccountCategory accountCategory);
	
	Account getPlayerDefaultAccount(UUID ownerUUID, AccountType accountType, AccountCategory accountCategory, String server, String world);
	
	void setPlayerDefaultAccount(UUID ownerUUID, Account account, AccountCategory accountCategory);
	
	void setPlayerDefaultAccount(UUID ownerUUID, Account account, AccountCategory accountCategory, String server, String world);
	
	boolean addManagementTypeToAccount(Account account, UUID uuid, AccountManagementType acountManagementType);
	
	boolean removeManagementTypeToAccount(Account account, UUID uuid, AccountManagementType acountManagementType);
	
	boolean canManageAccount(Account account, UUID uuid, AccountManagementType acountManagementType);
	
	Account getDefaultTaxAccount(EconomyCurrency accountCurrency);
	
	Account getDefaultTaxAccount(EconomyCurrency accountCurrency, String server, String world);
	
	Account getDefautVoidAccount(EconomyCurrency accountCurrency);
	
	Account getDefautVoidAccount(EconomyCurrency accountCurrency, String server, String world);
}