package main.java.me.avankziar.ifh.spigot.economy.account;

import main.java.me.avankziar.ifh.general.economy.account.AccountCategory;
import main.java.me.avankziar.ifh.general.economy.account.AccountType;
import main.java.me.avankziar.ifh.general.economy.account.EconomyEntity;
import main.java.me.avankziar.ifh.spigot.economy.currency.EconomyCurrency;
/**
 * The Account class. This represents all accounts, from normal player/entity/server accounts, to bank accounts.<br>
 * For a explanation to implements this,
 * <br> look at <a href="#{@link}">{@link https://www.spigotmc.org/resources/authors/avankziar.332028/}</a>
 * @author Avankziar
 */
public class Account
{
	/**
	 * The id of the Account from the mysql autoincrement.
	 */
	protected int id;
	/**
	 * The name of this account.
	 */
	protected String accountName;
	/**
	 * The accounttype define which type of account this is. A wallet or a typical bankaccount.
	 */
	protected final AccountType type;
	/**
	 * The Category of the account. F.E. 'main' for main account of a player, 'tax' for a separate tax account for a player.
	 */
	protected AccountCategory category;
	/**
	 * The currency of this account.
	 */
	protected EconomyCurrency currency;
	/**
	 * The owner of this account. The owner can always withdraw from the account.
	 */
	protected EconomyEntity owner;
	/**
	 * The balance of this account as double. Use the "convert" methode to convert to ItemStack or Experience
	 */
	protected double balance;
	
	/**
	 * Boolean which define, if the account is not open/create from the player manually.
	 * F.E. is this an idea, that players can not delete these accounts.
	 */
	protected boolean predefinedAccount;
	
	/**
	 * Constructor of the account.
	 */
	public Account(String accountName, AccountType type, AccountCategory category, EconomyCurrency currency,
			EconomyEntity owner, double balance, boolean predefinedAccount)
	{
		this.id = 0;
		setAccountName(accountName);
		this.type = type;
		setCategory(category);
		this.currency = currency;
		setOwner(owner);
		setBalance(balance);
		this.predefinedAccount = predefinedAccount;
	}
	
	public Account(int id, String accountName, AccountType type, AccountCategory category, EconomyCurrency currency,
			EconomyEntity owner, double balance, boolean predefinedAccount)
	{
		this.id = id;
		setAccountName(accountName);
		this.type = type;
		setCategory(category);
		this.currency = currency;
		setOwner(owner);
		setBalance(balance);
		this.predefinedAccount = predefinedAccount;
	}
	
	public int getID()
	{
		return id;
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
	public Account setAccountName(String accountName)
	{
		this.accountName = accountName;
		return this;
	}

	public AccountCategory getCategory()
	{
		return category;
	}

	public void setCategory(AccountCategory category)
	{
		this.category = category;
	}

	/**
	 * @return the economycurrency of this account.
	 */
	public EconomyCurrency getCurrency()
	{
		return currency;
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
	 * @param owner
	 * @return the account
	 */
	public Account setOwner(EconomyEntity owner)
	{
		this.owner = owner;
		return this;
	}
	
	/**
	 * 
	 * @return AccountType
	 */
	public AccountType getType()
	{
		return type;
	}
	
	public double getBalance()
	{
		return this.balance;
	}
	
	public Account setBalance(double balance)
	{
		this.balance = balance;
		return this;
	}

	public boolean isPredefinedAccount()
	{
		return predefinedAccount;
	}
}
