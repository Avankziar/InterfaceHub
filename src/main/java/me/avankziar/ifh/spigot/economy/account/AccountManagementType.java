package main.java.me.avankziar.ifh.spigot.economy.account;

public enum AccountManagementType
{
	/**
	 * Make it possible that the player can withdraw from that account. Deposit can everyone.
	 */
	CAN_WITHDRAW,
	/**
	 * Make it possible that the player can see action and trendlog
	 */
	CAN_SEE_LOG,
	/**
	 * Make it possible that the player can see the balance of the account
	 */
	CAN_SEE_BALANCE,
	/**
	 * Make it possible, that the player can set the value (of the three above) for a other player at the account
	 */
	CAN_ADMINISTRATE_ACCOUNT;
}