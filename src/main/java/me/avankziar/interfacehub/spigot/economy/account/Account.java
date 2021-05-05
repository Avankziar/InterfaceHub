package main.java.me.avankziar.interfacehub.spigot.economy.account;

import java.util.LinkedHashMap;
import java.util.UUID;

import main.java.me.avankziar.interfacehub.spigot.economy.Action.EconomyAction;
import main.java.me.avankziar.interfacehub.spigot.economy.currencydigital.EconomyCurrency;
/**
 * The Account class. This represents all accounts, from normal, early player accounts, to bank accounts.<br>
 * For a explanation to implements this,
 * <br> look at <a href="#{@link}">{@link https://www.spigotmc.org/resources/authors/avankziar.332028/}</a>
 * 
 * If you use normal Economy and Tokeneconomy, so create 2 Object which both extends this.
 * @author Avankziar
 */
public abstract class Account
{
	/**
	 * The name of this account.
	 */
	protected String accountName;
	/**
	 * The accounttype define which type of account this is. A wallet or a typical bankaccount.
	 */
	protected final AccountType type;
	/**
	 * The currency of this account.
	 */
	protected EconomyCurrency accountCurrency;
	/**
	 * The owner of this account. The owner can always withdraw from the account.
	 */
	protected EconomyEntity owner;
	/**
	 * All members of this Account. The boolean is, if the specific member can withdraw from this account.
	 */
	protected LinkedHashMap<EconomyEntity, Boolean> members;
	
	/**
	 * Constructor of the account.
	 */
	public Account(String accountName, AccountType type, EconomyCurrency accountCurrency,
			EconomyEntity owner, LinkedHashMap<EconomyEntity, Boolean> members)
	{
		setAccountName(accountName);
		this.type = type;
		this.accountCurrency = accountCurrency;
		setOwner(owner);
		this.members = new LinkedHashMap<>();
		this.members.putAll(members);
	}
	
	/**
	 * @return the account name.
	 */
	public String getAccountName()
	{
		return accountName;
	}
	
	/**
	 * 
	 * @param accountName <br>Set the account name.
	 */
	public void setAccountName(String accountName)
	{
		this.accountName = accountName;
	}
	
	/**
	 * @return the economycurrency of this account.
	 */
	public EconomyCurrency getAccountCurrency()
	{
		return accountCurrency;
	}
	
	/**
	 * 
	 * @return EconomyEntity, owner of this account.
	 */
	public EconomyEntity getOwner()
	{
		return owner;
	}
	
	/**
	 * 
	 * @param owner<br>Set the owner.
	 */
	public void setOwner(EconomyEntity owner)
	{
		this.owner = owner;
	}
	
	/**
	 * 
	 * @return the members as linkedhashmap. The boolean represent, if the member can withdraw from this account.
	 */
	public LinkedHashMap<EconomyEntity, Boolean> getMembers()
	{
		return members;
	}
	
	/**
	 * 
	 * @return AccountType
	 */
	public AccountType getType()
	{
		return type;
	}
	
	//---- > General Management < ----------
	
	/**
	 * 
	 * @return true, if the Account already exist.
	 */
	public abstract boolean exists();
	
	/**
	 * 
	 * @param world
	 * @return true, if the Account in this world exists.
	 */
	public abstract boolean exists(String world);
	
	/**
	 * Checks if this type of EntityType with this UUID is allowed to withdraw money from the account.
	 * @param entityType
	 * @param uuid
	 * @return true, if the requester can withdraw from this account.
	 */
	public abstract boolean canWithdraw(EconomyEntity.EconomyType entityType, UUID uuid);
	
	
	
	
	//---- > Digital Currency Management < ----	
	
	/**
	 * Checks if the account has equal or more <b>digital</b> money as specified.
	 * @param amount
	 * @return true, if account balance >= amount
	 */
	public abstract boolean has(double amount);
	
	/**
	 * Checks if the account has equal or more <b>digital</b> money, in this world, as specified.
	 * @param amount
	 * @return true, if account balance >= amount
	 */
	public abstract boolean has(double amount, String world);
	
	/**
	 * Return the balance of the <b>digital</b> currency
	 * @return Balance as double
	 */
	public abstract double getBalance();
	
	/**
	 * Return the balance of the <b>digital</b> currency in this world
	 * @return Balance as double
	 */
	public abstract double getBalance(String world);
	
	/**
	 * Set the balance of the <b>digital</b> currency.
	 * @param amount
	 * @return true, if the set was successfull.
	 */
	public abstract boolean setBalance(double amount);
	
	/**
	 * Set the balance of the <b>digital</b> currency, in this world.
	 * @param amount
	 * @return true, if the set was successfull.
	 */
	public abstract boolean setBalance(double amount, String world);
	
	/**
	 * Simply take money from the account, which goes into the void.
	 * @param amount
	 * @return EconomyAction
	 */
	public abstract EconomyAction takeBalance(double amount);
	
	/**
	 * Simply take <b>digital</b> money from the account, in the world, which goes into the void.
	 * @param amount
	 * @return EconomyAction
	 */
	public abstract EconomyAction takeBalance(double amount, String world);
	
	/**
	 * Simply give <b>digital</b> money from the void into the account.
	 * @param amount
	 * @return EconomyAction
	 */
	public abstract EconomyAction giveBalance(double amount);
	
	/**
	 * Simply give <b>digital</b> money from the void into the account, in the world.
	 * @param amount
	 * @param world
	 * @return
	 */
	public abstract EconomyAction giveBalance(double amount, String world);
	
	/**
	 * 
	 * @param amount
	 * @param initiator
	 * <br>The Entity, which initiate the transaction.
	 * @param target
	 * <br>The Entity, which is the target of the moneytransaction
	 * @return
	 */
	public abstract EconomyAction deposit(double amount, EconomyEntity initiator, EconomyEntity target);
	
	/**
	 * 
	 * @param amount
	 * @param initiator
	 * <br>The Entity, which initiate the transaction.
	 * @param target
	 * <br>The Entity, which is the target of the moneytransaction
	 * @param world
	 * @return
	 */
	public abstract EconomyAction deposit(double amount, EconomyEntity initiator, EconomyEntity target, String world);
	
	/**
	 * 
	 * @param amount
	 * @param initiator
	 * <br>The Entity, which initiate the transaction.
	 * @param sender
	 * <br>The Entity, which is the sender of the money in the transaction
	 * @return
	 */
	public abstract EconomyAction withdraw(double amount, EconomyEntity initiator, EconomyEntity sender);
	
	/**
	 * 
	 * @param amount
	 * @param initiator
	 * <br>The Entity, which initiate the transaction.
	 * @param sender
	 * <br>The Entity, which is the sender of the money in the transtransaction
	 * @param world
	 * @return
	 */
	public abstract EconomyAction withdraw(double amount, EconomyEntity initiator, EconomyEntity sender, String world);	
	
	
	//------> Member Handling <---------
	
	/**
	 * Checks if the EconomyEntity is the owner.
	 * @param entityType
	 * @param uuid
	 * @return
	 */
	public abstract boolean isOwner(EconomyEntity.EconomyType entityType, UUID uuid);
	
	public abstract boolean isMember(EconomyEntity.EconomyType entityType, UUID uuid);
	
	public abstract boolean addMember(EconomyEntity entity, boolean canWithdraw);
	
	public abstract boolean removeMember(EconomyEntity entity);
}
