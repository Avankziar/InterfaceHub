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
	 * Make it possible that the player can recieves Account balance changes through notifications
	 */
	CAN_RECEIVES_NOTIFICATIONS,
	/**
	 *  Make it possible that the player can set this account a Default account for him self in the account specific category.
	 */
	CAN_SET_AS_DEFAULT_ACCOUNT,
	/**
	 * Make it possible, that the player can set the value (all other AccountManagement types except the setting of the ownership)
	 * for a other player or himself, at the account.
	 */
	CAN_ADMINISTRATE_ACCOUNT,
	/**
	 * Make it possible, to set a new owner. All account management rights of the previous owner will be overwritten to the new owner.
	 */
	CAN_SET_OWNERSHIP;
}