package main.java.me.avankziar.ifh.spigot.synchronization;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface AddItemToInventory
{
	void addItem(Player player, String synchroKey, SyncType syncType, ItemStack...itemStack);
	
	void addItem(String synchroKey, SyncType syncType, ItemStack...itemStack);
	
	void addItemOnline(String synchroKey, SyncType syncType, ItemStack...itemStack);
	
	void addItemOnline(String synchroKey, SyncType syncType, String permission, ItemStack...itemStack);
	
	void addItemOffline(String synchroKey, SyncType syncType, ItemStack...itemStack);
	
	//----
	
	void addItemEnderchest(Player player, String synchroKey, SyncType syncType, ItemStack...itemStack);
	
	void addItemEnderchest(String synchroKey, SyncType syncType, ItemStack...itemStack);
	
	void addItemEnderchestOnline(String synchroKey, SyncType syncType, ItemStack...itemStack);
	
	void addItemEnderchestOnline(String synchroKey, SyncType syncType, String permission, ItemStack...itemStack);
	
	void addItemEnderchestOffline(String synchroKey, SyncType syncType, ItemStack...itemStack);
}
