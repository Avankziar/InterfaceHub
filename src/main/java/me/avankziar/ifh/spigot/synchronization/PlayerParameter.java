package main.java.me.avankziar.ifh.spigot.synchronization;

import org.bukkit.entity.Player;

public interface PlayerParameter
{
	void load(Player player);
	
	void load(Player player, String synchroKey);
	
	void load(Player player, SyncType syncType);
	
	void load(Player player, String synchroKey, SyncType syncType);
	
	void save(Player player);
	
	void save(Player player, String synchroKey);
	
	void save(Player player, SyncType syncType);
	
	void save(Player player, String synchroKey, SyncType syncType);
	
	void saveAll();
	
	void saveServer();
	
	void saveAndKick(Player player);
	
	void saveAndKickServer(String servername);
	
	void saveAndKickAll();
}
