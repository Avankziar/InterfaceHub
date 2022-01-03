package main.java.me.avankziar.ifh.spigot.economy.account;

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
	protected EconomyCurrency accountCurrency;
	/**
	 * The owner of this account. The owner can always withdraw from the account.
	 */
	protected EconomyEntity owner;
	/**
	 * The balance of this account as double. Use the "convert" methode to convert to ItemStack or Experience
	 */
	protected double balance;
	
	protected String server;
	
	protected String world;
	
	/**
	 * Constructor of the account.
	 */
	public Account(String accountName, AccountType type, AccountCategory category, EconomyCurrency accountCurrency,
			EconomyEntity owner, double balance)
	{
		this.id = 0;
		setAccountName(accountName);
		this.type = type;
		this.accountCurrency = accountCurrency;
		setOwner(owner);
		setBalance(balance);
		setServer(null);
		setWorld(null);
	}
	
	public Account(int id, String accountName, AccountType type, AccountCategory category, EconomyCurrency accountCurrency,
			EconomyEntity owner, double balance)
	{
		this.id = id;
		setAccountName(accountName);
		this.type = type;
		this.accountCurrency = accountCurrency;
		setOwner(owner);
		setBalance(balance);
		setServer(null);
		setWorld(null);
	}
	
	public Account(String accountName, AccountType type, AccountCategory category, EconomyCurrency accountCurrency,
			EconomyEntity owner, double balance, String server, String world)
	{
		this.id = 0;
		setAccountName(accountName);
		this.type = type;
		this.accountCurrency = accountCurrency;
		setOwner(owner);
		setBalance(balance);
		setServer(server);
		setWorld(world);
	}
	
	public Account(int id, String accountName, AccountType type, AccountCategory category, EconomyCurrency accountCurrency,
			EconomyEntity owner, double balance, String server, String world)
	{
		this.id = id;
		setAccountName(accountName);
		this.type = type;
		this.accountCurrency = accountCurrency;
		setOwner(owner);
		setBalance(balance);
		setServer(server);
		setWorld(world);
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

	public String getServer()
	{
		return server;
	}

	public void setServer(String server)
	{
		this.server = server;
	}

	public String getWorld()
	{
		return world;
	}

	public void setWorld(String world)
	{
		this.world = world;
	}
}
