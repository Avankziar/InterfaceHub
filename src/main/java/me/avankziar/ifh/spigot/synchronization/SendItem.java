package main.java.me.avankziar.ifh.spigot.synchronization;

import java.util.UUID;

import org.bukkit.inventory.ItemStack;

public interface SendItem
{
	/**
	 * Send the Items to the specific player.<br>
	 * SynchroKey is "default".<br>
	 * Reason is "/".
	 * @param uuid
	 * @param itemStack
	 */
	void sendItem(UUID receiver, String sender, ItemStack...itemStack);
	
	/**
	 * Send the Items to the specific player.<br>
	 * Reason is "/".
	 * @param uuid
	 * @param synchroKey
	 * @param syncType
	 * @param itemStack
	 */
	void sendItem(UUID receiver, String sender, String synchroKey, ItemStack...itemStack);
	
	/**
	 * Send the Items to the specific player.
	 * @param uuid
	 * @param synchroKey
	 * @param syncType
	 * @param itemStack
	 */
	void sendItem(UUID receiver, String sender, String synchroKey, String reason, ItemStack...itemStack);
	
	/**
	 * Send the Items to the specific players.<br>
	 * SynchroKey is "default".<br>
	 * Reason is "/".
	 * @param uuid
	 * @param itemStack
	 */
	void sendItem(UUID[] uuid, String sender, ItemStack...itemStack);
	
	/**
	 * Send the Items to the specific players.<br>
	 * Reason is "/".
	 * @param uuid
	 * @param synchroKey
	 * @param itemStack
	 */
	void sendItem(UUID[] uuid, String sender, String synchroKey, ItemStack...itemStack);
	
	/**
	 * Send the Items to the specific players.
	 * @param uuid
	 * @param synchroKey
	 * @param itemStack
	 */
	void sendItem(UUID[] uuid, String sender, String synchroKey, String reason, ItemStack...itemStack);
	
	/**
	 * Send the Items to all known players.<br>
	 * SynchroKey is "default".<br>
	 * Reason is "/".
	 * @param itemStack
	 */
	void sendItem(String sender, ItemStack...itemStack);	
	
	/**
	 * Send the Items to all known players.<br>
	 * Reason is "/".
	 * @param synchroKey
	 * @param itemStack
	 */
	void sendItem(String sender, String synchroKey, ItemStack...itemStack);
	
	/**
	 * Send the Items to all known players.
	 * @param synchroKey
	 * @param itemStack
	 */
	void sendItem(String sender, String synchroKey, String reason, ItemStack...itemStack);
}