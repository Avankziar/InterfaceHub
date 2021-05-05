package main.java.me.avankziar.interfacehub.spigot.economy;

import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;

import org.bukkit.OfflinePlayer;

import main.java.me.avankziar.interfacehub.spigot.economy.account.Account;
import main.java.me.avankziar.interfacehub.spigot.economy.account.AccountType;
import main.java.me.avankziar.interfacehub.spigot.economy.account.EconomyEntity;
import main.java.me.avankziar.interfacehub.spigot.economy.currencydigital.EconomyCurrency;

public interface Economy
{
	/**
	 * @return true if the normal economy is enabled.
	 */
	boolean isEnabled();
	
	/**
	 * @return true if multiple currency exists and are supported.
	 */
	boolean isMultiCurrency();
	
	/**
	 * @return true if wallet accounts are supported.
	 */
	boolean hasWalletSupport();
	
	/**
	 * @return true if bank accounts are supported.
	 */
	boolean hasBankSupport();
	
	/**
	 * Return the Plugin, which has implemented this interface
	 * @return Plugin name
	 */
	String getName();
	
	/**
	 * @return String array of the Authors.
	 */
	String[] getAuthors();
	
	/**
	 * @param amount
	 * @return a string format of the amount.
	 */
	String format(double amount);
	
	/**
	 * @param amount
	 * @param locale
	 * @return a string format of the amount in the locale.
	 */
	String format(double amount, Locale locale);
	
	/**
	 * @param amount
	 * @param economyCurrency
	 * @return a string format of the amount in the specific currency.
	 */
	String format(double amount, EconomyCurrency economyCurrency);
	
	/**
	 * @param amount
	 * @param economyCurrency
	 * @param locale
	 * @return  string format of the amount in the specific currency in the locale.
	 */
	String format(double amount, EconomyCurrency economyCurrency, Locale locale);
	
	/**
	 * @param economyCurrency
	 * @return true, if the currency already exists.
	 */
	boolean existsCurrency(EconomyCurrency economyCurrency);
	
	/**
	 * Registered a currency. The unique name of the currency must not already exist!
	 * @param economyCurrency
	 * @return true, if the currency is registered.
	 */
	boolean registerCurrency(EconomyCurrency economyCurrency);
	
	/**
	 * @return the default currency.
	 */
	EconomyCurrency getDefaultCurrency();
	
	/**
	 * @param world
	 * @return the default currency in this world.
	 */
	EconomyCurrency getDefaultCurrency(String world);
	
	/**
	 * @param uniqueName
	 * @return the currency with the uniqueName.
	 */
	EconomyCurrency getCurrency(String uniqueName);
	
	int getMultiAccountLimit(EconomyEntity.EconomyType entityType, AccountType accountType);
	
	double getAccountSizeLimit(EconomyEntity.EconomyType entityType, AccountType accountType);
	
	/**
	 * Player, npc should have a UUID. For Example Citizen NPC has a UUID.<br>
	 * For Serveraccount, you could generate a a UUID and save this.<br>
	 * BUT! This methode with only uuid input should be reserved for players only.<br>
	 * However, this method is rather inaccurate, since only the ownerUUID.
	 * @param uuid
	 * @return
	 */
	Account getAccount(UUID ownerUUID);
	
	Account getAccount(UUID ownerUUID, EconomyCurrency accountCurrency);
	
	Account getAccount(UUID ownerUUID, EconomyCurrency accountCurrency, AccountType accountType);
	
	Account getAccount(UUID ownerUUID, EconomyCurrency accountCurrency, AccountType accountType, EconomyEntity.EconomyType ownerEntityType);
	
	default boolean hasAccount(UUID uuid)
	{
		return getAccount(uuid).exists();
	}
	
	default boolean hasAccount(UUID uuid, EconomyCurrency accountCurrency)
	{
		return getAccount(uuid, accountCurrency).exists();
	}
	
	default boolean hasAccount(UUID uuid, EconomyCurrency accountCurrency, AccountType accountType)
	{
		return getAccount(uuid, accountCurrency, accountType).exists();
	}
	
	default boolean hasAccount(UUID uuid, EconomyCurrency accountCurrency, AccountType accountType, EconomyEntity.EconomyType entityType)
	{
		return getAccount(uuid, accountCurrency, accountType, entityType).exists();
	}
	
	boolean createAccount(Account account);
	
	boolean createAccount(Account account, double startingBalance);
	
	boolean createAccount(OfflinePlayer player);
	
	boolean createAccount(OfflinePlayer player, double startingBalance);
	
	boolean deleteAccount(Account account);
	
	boolean deleteAllAccounts(OfflinePlayer player);
	
	boolean deleteAllAccounts(OfflinePlayer player, AccountType accountType);
	
	boolean deleteAllAccounts(UUID uuid, EconomyEntity.EconomyType entityType);
	
	boolean deleteAllAccounts(UUID uuid, EconomyEntity.EconomyType entityType, AccountType accountType);
	
	ArrayList<Account> getAccounts();
	
	ArrayList<Account> getAccounts(AccountType accountType);
	
	ArrayList<Account> getAccounts(EconomyEntity.EconomyType ownerType);
	
	ArrayList<Account> getAccount(AccountType accountType, EconomyEntity.EconomyType ownerType);
}
