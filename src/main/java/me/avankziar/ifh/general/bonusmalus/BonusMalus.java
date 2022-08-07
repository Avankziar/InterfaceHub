package main.java.me.avankziar.ifh.general.bonusmalus;

import java.util.ArrayList;
import java.util.UUID;

public interface BonusMalus
{
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
	 * @see BonusMalusType
	 * @see MultiplicationCalculationType
	 * @param bonusMalusName
	 * @param bonusMalustype
	 * @param multiplicationCalculationType
	 * @return
	 */
	public boolean register(String bonusMalusName, String displayBonusMalusName,
			BonusMalusType bonusMalustype, MultiplicationCalculationType multiplicationCalculationType);
	
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
	 * Return the MultiplicationCalculationType of the registered bonus/malus.
	 * @param bonusMalusType
	 * @return
	 */
	public MultiplicationCalculationType getRegisteredMultiplicationCalculationType(String bonusMalusName);
	
	/**
	 * Remove all bonus/malus of the uuid
	 * @param uuid
	 */
	public void remove(UUID uuid);
	
	/**
	 * Remove all bonus/malus of the uuid with the specific reason
	 * @param uuid
	 * @param reason
	 */
	public void remove(UUID uuid, String reason);
	
	/**
	 * Remove all bonus/malus of the uuid with the specific name and reason
	 * @param uuid
	 * @param bonusMalusName
	 * @param reason
	 */
	public void remove(UUID uuid, String bonusMalusName, String reason);
	
	/**
	 * Remove all bonus/malus with a specific reason.
	 * @param reason
	 */
	public void remove(String reason);
	
	/**
	 * Remove all bonus/malus with a name and a reason
	 * @param bonusMalusName
	 * @param reason
	 */
	public void remove(String bonusMalusName, String reason);
	
	/**
	 * Return true if the player has one or more boni/mali of the specified name.
	 * @param uuid
	 * @param bonusMalusName
	 * @return
	 */
	public boolean hasBonusMalus(UUID uuid, String bonusMalusName);
	
	/**
	 * Return a value, where all bonus and malus of the player for the specific name is apply.<br>
	 * The formula for the calculation are:<br>
	 * x = (baseValue + SUM(additionValues))*(1 + SUM(multiplicationValues))<br>
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
	 * x = (baseValue + SUM(additionValues))*(1 + SUM(multiplicationValues))<br>
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
	 * @param reason
	 * @param server
	 * @param duration
	 * @return
	 */
	public void addAdditionFactor(UUID uuid, String bonusMalusName,
			double value, String reason,
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
	 * @param reason
	 * @param server
	 * @param world
	 * @param duration
	 * @return
	 */
	public void addMultiplicationFactor(UUID uuid, String bonusMalusName,
			double value, String reason,
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