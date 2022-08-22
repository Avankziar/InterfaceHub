package main.java.me.avankziar.ifh.spigot.synchronization;

import java.util.UUID;

import org.bukkit.inventory.ItemStack;

public interface SendItem
{
	/**
	 * Send the Items to the specific player at the synchroKey "default".
	 * @param uuid
	 * @param itemStack
	 */
	void sendItem(UUID uuid, ItemStack...itemStack);
	
	/**
	 * Send the Items to the specific player.
	 * @param uuid
	 * @param synchroKey
	 * @param syncType
	 * @param itemStack
	 */
	void sendItem(UUID uuid, String synchroKey, ItemStack...itemStack);
	
	/**
	 * Send the Items to the specific players.
	 * @param uuid
	 * @param synchroKey
	 * @param itemStack
	 */
	void sendItem(UUID[] uuid, String synchroKey, ItemStack...itemStack);
	
	/**
	 * Send the Items to the specific players at the synchroKey "default".
	 * @param uuid
	 * @param itemStack
	 */
	void sendItem(UUID[] uuid, ItemStack...itemStack);
	
	/**
	 * Send the Items to all known players.
	 * @param synchroKey
	 * @param itemStack
	 */
	void sendItem(String synchroKey, ItemStack...itemStack);
	
	/**
	 * Send the Items to all known players at the synchroKey "default".
	 * @param itemStack
	 */
	void sendItem(ItemStack...itemStack);	
}