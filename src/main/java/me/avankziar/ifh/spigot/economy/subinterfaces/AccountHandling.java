package main.java.me.avankziar.ifh.spigot.economy.subinterfaces;

import java.util.ArrayList;
import java.util.UUID;

import main.java.me.avankziar.ifh.general.economy.account.AccountCategory;
import main.java.me.avankziar.ifh.general.economy.account.AccountManagementType;
import main.java.me.avankziar.ifh.general.economy.account.AccountType;
import main.java.me.avankziar.ifh.general.economy.account.EconomyEntity;
import main.java.me.avankziar.ifh.spigot.economy.account.Account;
import main.java.me.avankziar.ifh.spigot.economy.currency.EconomyCurrency;

public interface AccountHandling
{
	EconomyEntity getEntity(UUID uuid);
	
	EconomyEntity getEntity(UUID uuid, EconomyEntity.EconomyType type);
	
	EconomyEntity getEntity(String name);
	
	EconomyEntity getEntity(String name, EconomyEntity.EconomyType type);
	
	ArrayList<EconomyEntity> getEntitys(EconomyEntity.EconomyType type);
	
	EconomyEntity getDefaultServer();
	
	EconomyEntity getDefaultEntity();
	
	boolean existAccount(UUID uuid, String accountName);
	
	boolean existAccount(UUID uuid, String accountName, EconomyCurrency accountCurrency);
	
	boolean existAccount(UUID uuid, EconomyCurrency accountCurrency, AccountType accountType, AccountCategory accountCategory,
			EconomyEntity.EconomyType entityType);
	
	boolean existAccount(UUID uuid, String accountName, EconomyCurrency accountCurrency, AccountType accountType, AccountCategory accountCategory,
			EconomyEntity.EconomyType entityType);
	
	boolean createAccount(Account account);
	
	boolean createAccount(String accountName, AccountType type, AccountCategory accountCategory, EconomyCurrency accountCurrency,
			EconomyEntity owner, double balance);
	
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
	int deleteAllAccounts(EconomyCurrency accountCurrency);
	
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
	 * Return the account with this id (Mysql or other database)<br>
	 * Can be null;
	 * @param id
	 * @return
	 */
	Account getAccount(int id);
	
	Account getAccount(EconomyEntity owner, String accountName);
	
	Account getAccount(UUID ownerUUID, String accountName, EconomyEntity.EconomyType ownerEntityType, AccountType accountType, AccountCategory accountCategory,
			EconomyCurrency accountCurrency);
	
	Account getAccount(EconomyEntity owner, String accountName, AccountType accountType, AccountCategory accountCategory, EconomyCurrency accountCurrency);
	
	ArrayList<Account> getAccounts();
	
	ArrayList<Account> getAccounts(AccountType accountType);
	
	ArrayList<Account> getAccounts(EconomyEntity.EconomyType ownerType);
	
	ArrayList<Account> getAccounts(AccountCategory accountCategory);
	
	ArrayList<Account> getAccounts(AccountType accountType, EconomyEntity.EconomyType ownerType);
	
	ArrayList<Account> getAccounts(AccountType accountType, EconomyEntity.EconomyType ownerType, AccountCategory accountCategory);
	
	/**
	 * Get the default account of the Player. The accountcategory default = AccountCategory.MAIN
	 * @param ownerUUID
	 * @param accountType
	 * @return
	 */
	Account getDefaultAccount(UUID ownerUUID);
	
	/**
	 * Get the default account of the Player per category.
	 * @param ownerUUID
	 * @param accountType
	 * @param accountCategory
	 * @return
	 */
	Account getDefaultAccount(UUID ownerUUID, AccountCategory accountCategory);
	
	Account getDefaultAccount(UUID ownerUUID, AccountCategory accountCategory, EconomyCurrency currency);
	
	void setDefaultAccount(UUID ownerUUID, Account account, AccountCategory accountCategory);
	
	/**
	 * Add a uuid with a specific accountmanagementtype to this account.
	 * @param account
	 * @param uuid
	 * @param acountManagementType
	 * @return
	 */
	boolean addManagementTypeToAccount(Account account, UUID uuid, AccountManagementType accountManagementType);
	
	/**
	 * Remove a uuid with a specific accountmanagementtype to this account.
	 * @param account
	 * @param uuid
	 * @param acountManagementType
	 * @return
	 */
	boolean removeManagementTypeFromAccount(Account account, UUID uuid, AccountManagementType accountManagementType);
	
	/**
	 * Removes all AccountManagementType for this accountid.
	 * @param account
	 * @return
	 */
	boolean removeManagementTypeFromAccount(int accountID);
	
	/**
	 * Return true if the uuid has the accountmanagementtype for this account.
	 * @param account
	 * @param uuid
	 * @param acountManagementType
	 * @return
	 */
	boolean canManageAccount(Account account, UUID uuid, AccountManagementType accountManagementType);
	
	boolean canManageAccount(int accountID, UUID uuid, AccountManagementType accountManagementType);
}