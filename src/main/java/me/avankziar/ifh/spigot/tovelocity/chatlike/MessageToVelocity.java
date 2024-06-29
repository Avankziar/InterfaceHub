package main.java.me.avankziar.ifh.spigot.tovelocity.chatlike;

import java.util.ArrayList;
import java.util.UUID;

import org.bukkit.Sound;

/**
 * All String message can be color code with the old system like &1 or &#00FF00, and the new kyori adventure Minimessage
 * @author User
 *
 */
public interface MessageToVelocity
{
	/**
	 * Send messages to Velocity proxy to one player with this uuid.
	 * @param uuid
	 * @param message
	 */
	void sendMessage(UUID uuid, String... message);
	
	/**
	 * Send messages and sound through Velocity proxy to the spigot server, to one player with this uuid.
	 * <br>The sound is played at the player location with 3.0F and 0.5F.
	 * @param uuid
	 * @param sound
	 * @param message
	 */
	void sendMessage(UUID uuid, Sound sound, String... message);
	
	/**
	 * Send messages to Velocity proxy to multiple player with the uuids.
	 * @param uuid
	 * @param message
	 */
	void sendMessage(ArrayList<UUID> uuid, String... message);
	
	/**
	 * Send messages and sound through Velocity proxy to the spigot server of the multiple player with the uuids.
	 * <br>The sound is played at the player location with 3.0F and 0.5F.
	 * @param uuid
	 * @param sound
	 * @param message
	 */
	void sendMessage(ArrayList<UUID> uuid, Sound sound, String... message);
	
	/**
	 * Send messages to Velocity proxy to multiple player with the uuids, if the player has this permission.
	 * <br>If hasPermission is false, will check if the player hasnt the Permission. True for normal check.
	 * @param uuid
	 * @param permission
	 * @param hasPermission
	 * @param message
	 */
	void sendMessage(ArrayList<UUID> uuid, String permission, boolean hasPermission, String... message);
	
	/**
	 * Send messages and sound through Velocity proxy to the spigot server of the multiple player with the uuids,
	 * if the player has this permission.
	 * <br>If hasPermission is false, will check if the player hasnt the Permission. True for normal check.
	 * <br>The sound is played at the player location with 3.0F and 0.5F.
	 * @param uuid
	 * @param permission
	 * @param hasPermission
	 * @param sound
	 * @param message
	 */
	void sendMessage(ArrayList<UUID> uuid, String permission, boolean hasPermission, Sound sound, String... message);

	/**
	 * Send messages to all Player in the Velocity proxy.
	 * @param message
	 */
	void sendMessage(String... message);
	
	/**
	 * Send messages and sound through Velocity proxy to the spigot server to all players.
	 * @param sound
	 * @param message
	 */
	void sendMessage(Sound sound, String... message);
	
	/**
	 * Send messages to all Player in the Velocity proxy, if the players has this permission.
	 * <br>If hasPermission is false, will check if the player hasnt the Permission. True for normal check.
	 * <br>The sound is played at the player location with 3.0F and 0.5F.
	 * @param permission
	 * @param hasPermission
	 * @param message
	 */
	void sendMessage(String permission, boolean hasPermission, String... message);
	
	/**
	 * Send messages and sound to all Player through Velocity proxy, if the players has this permission.
	 * <br>If hasPermission is false, will check if the player hasnt the Permission. True for normal check.
	 * <br>The sound is played at the player location with 3.0F and 0.5F.
	 * @param permission
	 * @param hasPermission
	 * @param sound
	 * @param message
	 */
	void sendMessage(String permission, boolean hasPermission, Sound sound, String... message);
}
