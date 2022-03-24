package main.java.me.avankziar.ifh.spigot.teleport;

import java.util.ArrayList;

import org.bukkit.entity.Player;

public interface Teleport
{
	/**
	 * Return true, if a back location is save, if the player teleport through this interface.<br>
	 * If the back is saved, may also depend on internal plugin mechanics.
	 * @return
	 */
	boolean isBackAsDefaultActive();
	
	/**
	 * Set true, if a back loaction should be safed.
	 * @param active
	 */
	void setBackAsDefault(boolean active);
	
	boolean teleport(Player player, String server, String worldname, double x, double y, double z, float yaw, float pitch);
	
	boolean teleport(Player player, String server, String worldname, double x, double y, double z, float yaw, float pitch,
			ArrayList<String> preTeleportMessage);
	
	boolean teleport(Player player, String server, String worldname, double x, double y, double z, float yaw, float pitch,
			ArrayList<String> preTeleportMessage, ArrayList<String> postTeleportMessage);
	
	boolean teleport(Player player, String server, String worldname, double x, double y, double z, float yaw, float pitch,
			ArrayList<String> preTeleportMessage, ArrayList<String> postTeleportMessage, String errormessage);
	
	boolean teleport(Player player, String server, String worldname, double x, double y, double z, float yaw, float pitch, 
			ArrayList<String> preTeleportMessage, ArrayList<String> postTeleportMessage, String errormessage,
			boolean createBack);
}