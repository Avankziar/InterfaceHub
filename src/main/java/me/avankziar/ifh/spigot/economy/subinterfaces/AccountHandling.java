package main.java.me.avankziar.ifh.spigot.economy.subinterfaces;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;

import org.bukkit.OfflinePlayer;

import main.java.me.avankziar.ifh.spigot.economy.account.Account;
import main.java.me.avankziar.ifh.spigot.economy.account.AccountType;
import main.java.me.avankziar.ifh.spigot.economy.account.EconomyEntity;
import main.java.me.avankziar.ifh.spigot.economy.currency.EconomyCurrency;

public interface AccountHandling
{
	int getMultiAccountLimit(EconomyEntity.EconomyType entityType, AccountType accountType);
	
	double getAccountSizeLimit(EconomyEntity.EconomyType entityType, AccountType accountType);
	
	/**
	 * Player, npc should have a UUID. For Example Citizen NPC has a UUID.<br>
	 * For Serveraccount, you could generate a UUID and save this. The EconomyEntity class can generate one<br>
	 * BUT! This methode with only uuid input should be reserved for players only.<br>
	 * <br>However, this method is rather inaccurate, since only the ownerUUID.
	 * <br>For getting the default account use <b>getDefaultPlayerAccount(UUID ownerUUID)</b>
	 * @param uuid
	 * @return the respective account
	 */
	Account getAccount(UUID ownerUUID, EconomyEntity.EconomyType ownerEntityType);
	
	Account getAccount(UUID ownerUUID, EconomyCurrency accountCurrency);
	
	Account getAccount(UUID ownerUUID, EconomyCurrency accountCurrency, AccountType accountType);
	
	Account getAccount(UUID ownerUUID, EconomyCurrency accountCurrency, AccountType accountType, EconomyEntity.EconomyType ownerEntityType);
	
	default boolean hasAccount(UUID uuid, EconomyEntity.EconomyType ownerEntityType)
	{
		return getAccount(uuid, ownerEntityType).exists();
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
	
	boolean createAccount(String accountName, AccountType type, EconomyCurrency accountCurrency,
			EconomyEntity owner, LinkedHashMap<EconomyEntity, Boolean> members);
	
	boolean createAccount(String accountName, AccountType type, EconomyCurrency accountCurrency,
			EconomyEntity owner, LinkedHashMap<EconomyEntity, Boolean> members, double startingBalance);
	
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
	
	Account getPlayerDefaultAccount(UUID ownerUUID);
	
	void setPlayerDefaultAccount(UUID ownerUUID);
}