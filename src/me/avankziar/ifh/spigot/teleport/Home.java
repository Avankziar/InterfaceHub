package me.avankziar.ifh.spigot.teleport;

import java.util.List;
import java.util.UUID;

import javax.annotation.Nullable;

import org.bukkit.entity.Player;

import me.avankziar.ifh.spigot.position.ServerLocation;

public interface Home
{
	/**
	 * Return a List of Strings of all the homenames from the player who belongs to the uuid.<br>
	 * List can be empty.
	 * @param uuid
	 * @return
	 */
	public List<String> getHomes(UUID uuid);
	
	/**
	 * Return the ServerLocation of a home from the player who belongs to the uuid.<br>
	 * Can be null.
	 * @param uuid
	 * @param homename
	 * @return
	 */
	@Nullable
	public ServerLocation getLocation(UUID uuid, String homename);
	
	/**
	 * Send the player to the home of the player who belongs to the provided uuid.<br>
	 * Return false, if a error is show up or the player has no right to go, if for example<br>
	 * the internal security measures activated.<br>
	 * Boolean costsApplied can charge the player with money but ONLY if costs arise at all.
	 * @param player
	 * @param uuid
	 * @param homename
	 * @param ignoreInteralSecurityMeasures
	 * @param sendErrorMessageToPlayer
	 * @param costsApplied
	 * @return
	 */
	public boolean teleportToHome(Player player, UUID uuid, String homename,
			boolean ignoreInteralSecurityMeasures, boolean sendErrorMessageToPlayer, boolean costsApplied);
}