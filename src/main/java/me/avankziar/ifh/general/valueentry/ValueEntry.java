package main.java.me.avankziar.ifh.general.valueentry;

import java.util.ArrayList;
import java.util.UUID;

import javax.annotation.Nullable;

public interface ValueEntry
{
	default String getValueEntryName(String pluginname, String... name)
	{
		return pluginname.toLowerCase()+"-"+String.join("_", name);
	}
	
	default String getValueEntryReason(String... reason)
	{
		return String.join("_", reason);
	}
	
	/**
	 * Return true if the valueentry is registered.
	 * @param valueLableName
	 * @return
	 */
	public boolean isRegistered(String valueLableName);
	
	/**
	 * Register a valuelable.
	 * @param internName
	 * @param displayName
	 * @param valueEntryExplanation
	 * @return
	 */
	public boolean register(String internName, String displayName,
			String...explanation);
	
	/**
	 * Return a list of all registered valueentry.
	 * @return
	 */
	public ArrayList<main.java.me.avankziar.ifh.general.valueentry.objects.ValueLable> getRegisteredValueLable(String valueLableName);
	
	/**
	 * Return a list of all registered valueentry.
	 * @return
	 */
	public ArrayList<main.java.me.avankziar.ifh.general.valueentry.objects.ValueLable> getRegisteredValueLable();
	
	
	public void remove(@Nullable UUID uuid, @Nullable String valueEntryName, @Nullable String internReason, 
			@Nullable String server, @Nullable String world);
	
	/**
	 * Return a boolean, if the player has a entry for a valueentry at a specific server and/or world and a specific reason.
	 * @param uuid
	 * @param valueEntryName
	 * @param internreason
	 * @param server
	 * @param world
	 * @return
	 */
	public boolean hasValueEntry(UUID uuid, @Nullable String valueEntryName, @Nullable String internreason, 
			@Nullable String server, @Nullable String world);
	
	/**
	 * Return the valueentryentrys for a specific server and/or world.<br>
	 * Beware it can be:<br>
	 * Boolean as "true" or "false" or "0" and "1".<br>
	 * Numbers as int, long, float, double<br>
	 * Text as String.<br>
	 * If no valueentry exist, it return null.
	 * @param uuid
	 * @param valueEntryName
	 * @param valueType
	 * @param server
	 * @param world
	 * @return null if not exist
	 */
	public Object getValueEntry(UUID uuid, String valueEntryName, ValueType type, @Nullable String server, @Nullable String world);
	
	/**
	 * Add a entry for a valueentry with a specific reason.<br>
	 * If duration is null or <= 0, so is a permanent, above 0 is temporary.<br>
	 * The duration are always add to the System.currentMillis() in the hasValueEntry() methode.
	 * @param uuid
	 * @param valueEntryName
	 * @param value
	 * @param type
	 * @param internReason
	 * @param displayReason
	 * @param server
	 * @param world
	 * @param duration
	 * @return true if valueentry is added. False if is already added. Use modify methode.
	 */
	public boolean addValueEntry(UUID uuid, String valueLableName,
			String value, ValueType type,
			String internReason, String displayReason,
			@Nullable String server, @Nullable String world,
			Long duration);
	
	/**
	 * 
	 * @param uuid
	 * @param valueLableName
	 * @param value
	 * @param type
	 * @param internReason
	 * @param displayReason
	 * @param server
	 * @param world
	 * @param duration
	 * @return true if valueentry is modify. False if valueentry not exist for the player
	 */
	public boolean modifyValueEntry(UUID uuid, String valueLableName,
			String value, ValueType type,
			@Nullable String internReason, @Nullable String displayReason,
			@Nullable String server, @Nullable String world,
			Long duration);
}