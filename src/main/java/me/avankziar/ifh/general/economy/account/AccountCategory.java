package main.java.me.avankziar.ifh.general.economy.account;

public enum AccountCategory
{
	UNKNOW, //if no category is the right
	MAIN, //The main Account wallet or bank
	TAX, //The account of the player if he has to pay tax
	VOID, //The account of the player if he has to pay that goes into the void
	JOB,
	SHOP, //A
	RENT, //If the player has a rent to pay
	CITY, //Cityaccount, for diffrent things that happend in a city
	GUILD, //Guidaccount,
	PARTY, //A temporary account for groups like a rpg party.
	GROUP, //A permanent account for groups
	SAVING, //Means saving money for later
	SHAREDEPOSIT, //aktien in german
	DONATION, //Spendenkonto
}
