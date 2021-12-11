package main.java.me.avankziar.ifh.spigot.teleport;

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;

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
	
	/**
	 * Return true, if the player gives effects at a teleport through this interface.
	 * @return
	 */
	boolean isGiveEffects();
	
	/**
	 * Override all setted effects with the new ones.<br>
	 * If no potioneffect is set, it is intended to use the default effect from the providing plugin.
	 * @param active
	 * @param potionEffect
	 */
	void setGiveEffects(boolean active, PotionEffect... potionEffect);
	
	boolean teleport(Player player, String server, Location location);
	
	boolean teleport(Player player, String server, Location location, 
			ArrayList<String> preTeleportMessage);
	
	boolean teleport(Player player, String server, Location location, 
			ArrayList<String> preTeleportMessage, ArrayList<String> postTeleportMessage);
	
	boolean teleport(Player player, String server, Location location, 
			ArrayList<String> preTeleportMessage, ArrayList<String> postTeleportMessage,
			boolean createBack);
}