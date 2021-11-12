package main.java.me.avankziar.ifh.spigot.serverrules;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.bukkit.OfflinePlayer;

public interface ServerRules
{
	/**
	 * Checks, if the player has accepted the server rules.
	 * @param player
	 * @return
	 */
	boolean hasAccepted(OfflinePlayer player);
	
	/**
	 * Return the time, in milliseconds from unix, when the player has accepted the Serverrule
	 * @param player
	 * @return
	 */
	long whenAccepted(OfflinePlayer player);
	
	/**
	 * Returns all ServerRules as LinkedHashMap. The key ist the number with the seperator.
	 * @return
	 */
	LinkedHashMap<String, ServerRule> getServerRules();
	
	/**
	 * Return a ServerRule Object.
	 * @param ruleNumber
	 * @param subRuleNumber
	 * @return
	 */
	ServerRule getServerRule(int ruleNumber, int... subRuleNumber);
	
	/**
	 * Return the name of this rule
	 * @param ruleNumber
	 * @param subRuleNumber
	 * @return
	 */
	default String getServerRuleName(int ruleNumber, int... subRuleNumber)
	{
		return getServerRule(ruleNumber, subRuleNumber).getRuleName();
	}
	
	/**
	 * Return the exakt line of the rule. If this line not exist, it returns a empty string.
	 * @param line
	 * @param ruleNumber
	 * @param subRuleNumber
	 * @return
	 */
	default String getServerRuleLine(int index, int ruleNumber, int... subRuleNumber)
	{
		return getServerRule(ruleNumber, subRuleNumber).getLines().get(index);
	}
	
	/**
	 * Return a arraylist of strings of the lines of the rule.
	 * @param ruleNumber
	 * @param subRuleNumber
	 * @return
	 */
	default ArrayList<String> getServerRuleLines(int ruleNumber, int... subRuleNumber)
	{
		return getServerRule(ruleNumber, subRuleNumber).getLines();
	}
}
