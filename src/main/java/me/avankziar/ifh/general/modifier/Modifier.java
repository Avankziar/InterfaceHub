package main.java.me.avankziar.ifh.general.modifier;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;

import javax.annotation.Nullable;

public interface Modifier
{
	default String getModificationName(String pluginname, String... name)
	{
		return pluginname.toLowerCase()+"-"+String.join("_", name);
	}
	
	default String getModificationReason(String... reason)
	{
		return String.join("_", reason);
	}
	
	/**
	 * Return true, if the modifier is already registered.
	 * @param modifierName
	 * @return
	 */
	public boolean isRegistered(String modificationName);
	
	/**
	 * Register a modifier. It defines how the modifier work. <br>
	 * @see ModificationType
	 * @param internName
	 * @param displayName
	 * @param type
	 * @param explanation
	 * @return true if registered. False if not.
	 */
	public boolean register(String internName, String displayName,
			ModificationType type,
			String...explanation);
	
	/**
	 * Return a modification with the specific internname.
	 * @return
	 */
	public main.java.me.avankziar.ifh.general.modifier.objects.Modification getRegisteredModification(String internName);
	
	/**
	 * Return a list of all registered modification.
	 * @return
	 */
	public ArrayList<main.java.me.avankziar.ifh.general.modifier.objects.Modification> getRegisteredModification();
	
	/**
	 * Return a list of all registered modifier with specific ModificationType.
	 * @param type
	 * @return
	 */
	public ArrayList<main.java.me.avankziar.ifh.general.modifier.objects.Modification> getRegisteredModification(ModificationType type);
		
	public void remove(@Nullable UUID uuid, @Nullable String modificationName, @Nullable String internReason);
	
	/**
	 * Remove all modifier of the uuid with the specific name and reason
	 * @param uuid
	 * @param modifierName
	 * @param internReason
	 */
	public void remove(UUID uuid, String modificationName, String internReason,
			@Nullable String server, @Nullable String world);
	
	public void remove(@Nullable String server, @Nullable String world);
	
	/**
	 * Return true if the player has one or more modifier of the specified name for a internReason and/or server and/or world.
	 * @param uuid
	 * @param modifierName
	 * @param internReason
	 * @param server
	 * @param world
	 * @return
	 */
	public boolean hasModifier(UUID uuid, String modificationName, @Nullable String internReason,
			@Nullable String server, @Nullable String world);
	
	/**
	 * Return the last known base value. Aka, the last value that another plugin specified as "value" in there getResult method.
	 * @param uuid
	 * @param baseValue
	 * @param modifierName
	 * @param server
	 * @param world
	 * @return
	 */
	public double getLastBaseValue(final UUID uuid, final String modificationName);
	
	/**
	 * Returns all additive values calculated together.
	 * @param uuid
	 * @param modifierName
	 * @param server
	 * @param world
	 * @return
	 */
	public double getSumValue(UUID uuid, String modifierName, @Nullable String server, @Nullable String world);
	
	/**
	 * Returns all multiplicative values calculated together.
	 * @param uuid
	 * @param modifierName
	 * @param server
	 * @param world
	 * @return
	 */
	public double getMulltiplyValue(UUID uuid, String modifierName, @Nullable String server, @Nullable String world);
	
	/**
	 * Return a LinkedHashMap.<br>
	 * The key is the modificationname and the value is all value under the modificationname totaled.<br>
	 * The map contains only global values from a player which is on this server online.
	 * @param uuid
	 * @param type
	 * @return
	 */
	public LinkedHashMap<String, Double> getPlayerGlobalModifier(UUID uuid, ModifierType type);
	
	/**
	 * Return a LinkedHashMap.<br>
	 * The key is the modificationname and the value is all value under the modificationname totaled.<br>
	 * The map contains only server values from a player which is on this server online.
	 * @param uuid
	 * @param type
	 * @return
	 */
	public LinkedHashMap<String, Double> getPlayerServerModifier(UUID uuid, ModifierType type);
	
	/**
	 * Return a LinkedHashMap.<br>
	 * The first key is the world and the second key is modificationname and the value is all value under the modificationname totaled.<br>
	 * The map contains only world values from a player which is on this server online.
	 * @param uuid
	 * @param type
	 * @return
	 */
	public LinkedHashMap<String, LinkedHashMap<String, Double>> getPlayerWorldModifier(UUID uuid, ModifierType type);
	
	/**
	 * Return a value, where all modifier of the player for the specific name is apply.<br>
	 * The formula for the calculation are:<br>
	 * x = (baseValue + SUM(additionValues))*(SUM(multiplicationValues))<br>
	 * or<br>
	 * x = (baseValue + SUM(additionValues))*(MUL(multiplicationValues))<br>
	 * It depends which MultiplicationCalculationType is used.
	 * @see MultiplicationCalculationType
	 * @param uuid
	 * @param baseValue
	 * @param modifierName
	 * @return
	 */	
	public double getResult(UUID uuid, double baseValue, String modifierName);	
	
	/**
	 * Return a value, where all modifier of the player for the specific name is apply.<br>
	 * If the server is null, it will be count as global factor.<br>
	 * The formula for the calculation are:<br>
	 * x = (baseValue + SUM(additionValues))*(SUM(multiplicationValues))<br>
	 * or<br>
	 * x = (baseValue + SUM(additionValues))*(MUL(multiplicationValues))<br>
	 * It depends which MultiplicationCalculationType is used.
	 * @see MultiplicationCalculationType
	 * @param uuid
	 * @param baseValue
	 * @param modifierName
	 * @param server
	 * @param world
	 * @return
	 */
	public double getResult(UUID uuid, double baseValue, String modifierName, @Nullable String server, @Nullable String world);
	
	/**
	 * Add a factor for the player, with the specific name and the specific reason.<br>
	 * The reason can be null, the name cant be null.<br>
	 * If the server is null, so it is a global factor.<br>
	 * If the world isnt null but the server is null, it is a global<br>
	 * If the duration is null, so it is a permanent factor.<br>
	 * value will be always defines as: y = 1 + (value/100). Summit as percentage.<br>
	 * A multiplication factor will be calculated after a addition factor.<br>
	 * @param uuid
	 * @param modifierName
	 * @param value
	 * @param internReason
	 * @param displayReason
	 * @param server
	 * @param world
	 * @param modifierType
	 * @param duration
	 * @return
	 */
	public void addFactor(UUID uuid, String modificationName,
			double value, String internReason, String displayReason,
			@Nullable String server, @Nullable String world,
			ModifierType modifierType, @Nullable Long duration);
	
	/**
	 * Update all onlineplayers modifier values.
	 */
	public void update();
	
	/**
	 * Updates the modifier values of the onlineplayer with the specific uuid.
	 * @param uuid
	 */
	public void update(UUID uuid);
}