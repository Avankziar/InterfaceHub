package main.java.me.avankziar.ifh.spigot.shop;

import java.util.UUID;

import org.bukkit.inventory.ItemStack;

public interface Shop
{
	public boolean isOwner(int shopID, UUID uuid);
	
	public boolean isMember(int shopID, UUID uuid);
	
	public boolean isBlackListed(int shopID, UUID uuid);
	
	public ItemStack getItemStack(int shopID);
	
	public void putIntoStorage(int shopID, ItemStack itemStack, long amountOfItems);
	
	public ItemStack[] getOutOfStorage(int shopID, long amountOfItems);
}