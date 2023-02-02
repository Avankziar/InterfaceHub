package main.java.me.avankziar.ifh.general.bonusmalus;

import java.util.ArrayList;
import java.util.UUID;

public interface BonusMalus
{
	default String getBonusMalusName(String pluginname, String... name)
	{
		return pluginname.toLowerCase()+"-"+String.join("_", name);
	}
	
	default String getBonusMalusReason(String... reason)
	{
		return String.join("_", reason);
	}
	
	/**
	 * Return true, if the bonus/malus is already registered.
	 * @param bonusMalusName
	 * @return
	 */
	public boolean isRegistered(String bonusMalusName);
	
	/**
	 * Register a bonus/malus. It defines how the bonus/malus work. <br>
	 * isBooleanBonusMalus definies if the bonus/malus to be understood as boolean.
	 * @see BonusMalusType
	 * @see MultiplicationCalculationType
	 * @param bonusMalusName
	 * @param displayBonusMalusName
	 * @param isBooleanBonusMalus
	 * @param bonusMalustype
	 * @param multiplicationCalculationType
	 * @param bonusMalusExplanation
	 * @return
	 */
	public boolean register(String bonusMalusName, String displayBonusMalusName,
			BonusMalusType bonusMalustype,
			String...bonusMalusExplanation);
	
	/**
	 * Return a list of all registered boni/mali.
	 * @return
	 */
	public ArrayList<String> getRegistered();
	
	/**
	 * Return a list of all registered boni/mali with specific BonusMalusType.
	 * @param type
	 * @return
	 */
	public ArrayList<String> getRegistered(BonusMalusType type);
	
	/**
	 * Return the displayname of the registered bonus/malus.
	 * @param bonusMalusName
	 * @return
	 */
	public String getRegisteredDisplayName(String bonusMalusName);
	
	/**
	 * Return the BonusMalusType of the registered bonus/malus.
	 * @param bonusMalusName
	 * @return
	 */
	public BonusMalusType getRegisteredBonusMalusType(String bonusMalusName);
	
	/**
	 * Return a String array for explanation for the bonus/malus.
	 * @param bonusMalusName
	 * @return
	 */
	public String[] getRegisteredExplanation(String bonusMalusName);
	
	/**
	 * Remove all bonus/malus of the uuid
	 * @param uuid
	 */
	public void remove(UUID uuid);
	
	/**
	 * Remove all bonus/malus of the uuid with the specific reason
	 * @param uuid
	 * @param internReason
	 */
	public void remove(UUID uuid, String internReason);
	
	/**
	 * Remove all bonus/malus of the uuid with the specific name and reason
	 * @param uuid
	 * @param bonusMalusName
	 * @param internReason
	 */
	public void remove(UUID uuid, String bonusMalusName, String internReason);
	
	/**
	 * Remove all bonus/malus with a specific reason.
	 * @param internReason
	 */
	public void remove(String internReason);
	
	/**
	 * Remove all bonus/malus with a name and a reason
	 * @param bonusMalusName
	 * @param internReason
	 */
	public void remove(String bonusMalusName, String internReason);
	
	/**
	 * Return true if the player has one or more boni/mali of the specified name.
	 * @param uuid
	 * @param bonusMalusName
	 * @return
	 */
	public boolean hasBonusMalus(UUID uuid, String bonusMalusName);
	
	/**
	 * Return true if the player has one or more boni/mali of the specified name for a server and/or world.
	 * @param uuid
	 * @param bonusMalusName
	 * @param server
	 * @param world
	 * @return
	 */
	public boolean hasBonusMalus(UUID uuid, String bonusMalusName, String server, String world);
	
	/**
	 * Return true if the player has one or more boni/mali of the specified name for a internReason and/or server and/or world.
	 * @param uuid
	 * @param bonusMalusName
	 * @param internReason
	 * @param server
	 * @param world
	 * @return
	 */
	public boolean hasBonusMalus(UUID uuid, String bonusMalusName, String internReason, String server, String world);
	
	/**
	 * Return the last known base value. Aka, the last value that another plugin specified as "value" in ther getResult method.
	 * @param uuid
	 * @param baseValue
	 * @param bonusMalusName
	 * @param server
	 * @param world
	 * @return
	 */
	public double getLastBaseValue(final UUID uuid, final double baseValue, final String bonusMalusName, String server, String world);
	
	/**
	 * Returns all additive values calculated together.
	 * @param uuid
	 * @param bonusMalusName
	 * @param server
	 * @param world
	 * @return
	 */
	public double getSumValue(UUID uuid, String bonusMalusName, String server, String world);
	
	/**
	 * Returns all multiplicative values calculated together.
	 * @param uuid
	 * @param bonusMalusName
	 * @param server
	 * @param world
	 * @return
	 */
	public double getMulltiplyValue(UUID uuid, String bonusMalusName, String server, String world);
	
	/**
	 * Return a value, where all bonus and malus of the player for the specific name is apply.<br>
	 * The formula for the calculation are:<br>
	 * x = (baseValue + SUM(additionValues))*(SUM(multiplicationValues))<br>
	 * or<br>
	 * x = (baseValue + SUM(additionValues))*(MUL(multiplicationValues))<br>
	 * It depends which MultiplicationCalculationType is used.
	 * @see MultiplicationCalculationType
	 * @param uuid
	 * @param baseValue
	 * @param bonusMalusName
	 * @return
	 */	
	public double getResult(UUID uuid, double baseValue, String bonusMalusName);	
	
	/**
	 * Return a value, where all bonus and malus of the player for the specific name is apply.<br>
	 * If the server is null, it will be count as global factor.<br>
	 * The formula for the calculation are:<br>
	 * x = (baseValue + SUM(additionValues))*(SUM(multiplicationValues))<br>
	 * or<br>
	 * x = (baseValue + SUM(additionValues))*(MUL(multiplicationValues))<br>
	 * It depends which MultiplicationCalculationType is used.
	 * @see MultiplicationCalculationType
	 * @param uuid
	 * @param baseValue
	 * @param bonusMalusName
	 * @param server
	 * @param world
	 * @return
	 */
	public double getResult(UUID uuid, double baseValue, String bonusMalusName, String server, String world);
	
	/**
	 * Add a additional factor for the player, with the specific name and the specific reason.<br>
	 * The reason can be null, the name cant be null.<br>
	 * If the server is null, so it is a global factor.<br>
	 * If the world isnt null but the server is null, it is a global<br>
	 * If the duration is null, so it is a permanent factor.<br>
	 * A addition factor will be calculated before a multiplication factor.<br>
	 * @param uuid
	 * @param bonusMalusName
	 * @param value
	 * @param internReason
	 * @param displayReason
	 * @param server
	 * @param duration
	 * @return
	 */
	public void addAdditionFactor(UUID uuid, String bonusMalusName,
			double value, String internReason, String displayReason,
			String server, String world,
			Long duration);
	
	/**
	 * Add a multiplication factor for the player, with the specific name and the specific reason.<br>
	 * The reason can be null, the name cant be null.<br>
	 * If the server is null, so it is a global factor.<br>
	 * If the world isnt null but the server is null, it is a global<br>
	 * If the duration is null, so it is a permanent factor.<br>
	 * value will be always defines as: y = 1 + (value/100). Summit as percentage.<br>
	 * A multiplication factor will be calculated after a addition factor.<br>
	 * @param uuid
	 * @param bonusMalusName
	 * @param valueAsPercent
	 * @param internReason
	 * @param displayReason
	 * @param server
	 * @param world
	 * @param duration
	 * @return
	 */
	public void addMultiplicationFactor(UUID uuid, String bonusMalusName,
			double value, String internReason, String displayReason,
			String server, String world,
			Long duration);
	
	/**
	 * Update all onlineplayers bonus/malus values.
	 */
	public void update();
	
	/**
	 * Updates the bonus/malus values of the onlineplayer with the specific uuid.
	 * @param uuid
	 */
	public void update(UUID uuid);
}