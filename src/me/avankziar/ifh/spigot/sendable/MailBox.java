package me.avankziar.ifh.spigot.sendable;

import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import org.bukkit.inventory.ItemStack;

public interface MailBox
{
	/**
	 * Send the item raw to the mailbox of the player.<br>
	 * Only possible if the mailbox if on the same server.<br>
	 * Return all not placeable Items.<br>
	 * Better called Async.
	 * @param uuid
	 * @param isa
	 * @return
	 */
	public HashMap<Integer, ItemStack> sendItem(UUID uuid, ItemStack... isa);
	
	/**
	 * Send all Players the items async.<br>
	 * Only possible if the mailbox if on the same server.<br>
	 * Return all not placeable Items.<br>
	 * @param is
	 * @return
	 */
	public CompletableFuture<HashMap<UUID, HashMap<Integer, ItemStack>>> sendAllItem(ItemStack... is);
}