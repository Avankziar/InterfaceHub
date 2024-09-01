package me.avankziar.ifh.spigot.sendable;

import java.util.UUID;

import org.bukkit.inventory.ItemStack;

public interface Parcel
{
	/**
	 * Send a parcel to the receiver.<br>
	 * Should be called async.
	 * @param receiver
	 * @param sender
	 * @param subject
	 * @param is
	 */
	public void sendParcel(UUID receiver, String sender, String subject, ItemStack... is);
	
	/**
	 * Send all players a parcel.<br>
	 * Will be processed async.
	 * @param sender
	 * @param subject
	 * @param is
	 */
	public void sendAllParcel(String sender, String subject, ItemStack... is);
}