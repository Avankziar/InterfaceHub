package main.java.me.avankziar.ifh.general.condition;

import java.util.ArrayList;
import java.util.UUID;

public interface Condition
{
	default String getConditionName(String pluginname, String... name)
	{
		return pluginname.toLowerCase()+"-"+String.join("_", name);
	}
	
	default String getConditionReason(String... reason)
	{
		return String.join("_", reason);
	}
	
	/**
	 * Return true if the condition is registered.
	 * @param conditionName
	 * @return
	 */
	public boolean isRegistered(String conditionName);
	
	/**
	 * Register a condition.
	 * @param conditionName
	 * @param displayconditionName
	 * @param conditionExplanation
	 * @return
	 */
	public boolean register(String conditionName, String displayconditionName,
			String...conditionExplanation);
	
	/**
	 * Return a list of all registered condition.
	 * @return
	 */
	public ArrayList<String> getRegistered();
	
	/**
	 * Return the displayname of the condition.
	 * @param conditionName
	 * @return
	 */
	public String getRegisteredDisplayName(String conditionName);
	
	/**
	 * Return the explanation of the condition if it exist.
	 * @param conditionName
	 * @return
	 */
	public String[] getRegisteredExplanation(String conditionName);
	
	public void remove(UUID uuid);
	
	public void remove(UUID uuid, String reason);
	
	public void remove(UUID uuid, String conditionName, String internReason);
	
	public void remove(String internReason);
	
	public void remove(String conditionName, String internReason);
	
	/**
	 * Return a boolean, if the player has a entry for a condition.
	 * @param uuid
	 * @param conditionName
	 * @return
	 */
	public boolean hasConditionEntry(UUID uuid, String conditionName);
	
	/**
	 * Return a boolean, if the player has a entry for a condition for a specific reason.
	 * @param uuid
	 * @param conditionName
	 * @param internreason
	 * @return
	 */
	public boolean hasConditionEntry(UUID uuid, String conditionName, String internreason);
	
	/**
	 * Return a boolean, if the player has a entry for a condition at a specific server and/or world.
	 * @param uuid
	 * @param conditionName
	 * @param server
	 * @param world
	 * @return
	 */
	public boolean hasConditionEntry(UUID uuid, String conditionName, String server, String world);
	
	/**
	 * Return a boolean, if the player has a entry for a condition at a specific server and/or world and a specific reason.
	 * @param uuid
	 * @param conditionName
	 * @param internreason
	 * @param server
	 * @param world
	 * @return
	 */
	public boolean hasConditionEntry(UUID uuid, String conditionName, String internreason, String server, String world);
	
	/**
	 * Return the conditionentry.<br>
	 * Beware it can be:<br>
	 * Boolean as "true" or "false" or "0" and "1".<br>
	 * Numbers as int, long, float, double<br>
	 * Text as String.<br>
	 * If no conditionEntry exist, it return null.
	 * @param uuid
	 * @param conditionName
	 * @return
	 */
	public String getConditionEntry(UUID uuid, String conditionName);
	
	/**
	 * Return the conditionentry for a specific server and/or world.<br>
	 * Beware it can be:<br>
	 * Boolean as "true" or "false" or "0" and "1".<br>
	 * Numbers as int, long, float, double<br>
	 * Text as String.<br>
	 * If no conditionEntry exist, it return null.
	 * @param uuid
	 * @param conditionName
	 * @param server
	 * @param world
	 * @return
	 */
	public String getConditionEntry(UUID uuid, String conditionName, String server, String world);
	
	/**
	 * Add a entry for a condition with a specific reason.<br>
	 * If duration is null or <= 0, so is a permanent, above 0 is temporary.<br>
	 * The duration are always add to the System.currentMillis() in the hasCondition() methode.
	 * @param uuid
	 * @param conditionName
	 * @param internReason
	 * @param displayReason
	 * @param server
	 * @param world
	 * @param duration
	 */
	public void addConditionEntry(UUID uuid, String conditionName,
			String value,
			String internReason, String displayReason,
			String server, String world,
			Long duration);
}