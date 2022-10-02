package main.java.me.avankziar.ifh.spigot.shop;

import java.util.UUID;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import main.java.me.avankziar.ifh.spigot.position.ServerLocation;

/**
 * The interface of a normal shop.
 * @author Avankziar
 *
 */
public interface SignShop
{
	public boolean isOwner(int shopID, UUID uuid);
	
	public boolean isMember(int shopID, UUID uuid);
	
	public boolean isBlackListed(int shopID, UUID uuid);
	
	public UUID getOwner(int shopID);
	
	public String getShopName(int shopID);
	
	public int getAccountID(int shopID);
	
	public long getCreationDateTime(int shopID);
	
	public ServerLocation getLocation(int shopID);
	
	public Material getMaterial(int shopID);
	
	public String getDisplayName(int shopID);
	
	public ItemStack getItemStack(int shopID);
	
	public boolean canBuy(int shopID);
	
	public Double getBuy(int shopID);
	
	public boolean canSell(int shopID);
	
	public Double getSell(int shopID);
	
	/**
	 * Return the amount of Items, which cannot distribute in the storage of the shop
	 * @param shopID
	 * @param itemStack
	 * @param amountOfItems
	 * @return
	 */
	public long putIntoStorage(int shopID, ItemStack itemStack, long amountOfItems);
	
	/**
	 * Return all Items, which came of the storage of the shop.<br>
	 * Can be not all items, what was wanted.
	 * @param shopID
	 * @param amountOfItems
	 * @return
	 */
	public ItemStack[] getOutOfStorage(int shopID, long amountOfItems);
}