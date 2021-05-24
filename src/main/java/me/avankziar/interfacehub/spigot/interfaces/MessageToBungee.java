package main.java.me.avankziar.interfacehub.spigot.interfaces;

import java.util.ArrayList;
import java.util.UUID;

public interface MessageToBungee
{	
	/**
	 * Send messages to BungeeCord proxy to one player with this uuid.
	 * @param uuid
	 * @param message
	 */
	void sendMessage(UUID uuid, String... message);
	
	/**
	 * Send messages to BungeeCord proxy to multiple player with the uuids.
	 * @param uuid
	 * @param message
	 */
	void sendMessage(ArrayList<UUID> uuid, String... message);
	
	/**
	 * Send messages to BungeeCord proxy to multiple player with the uuids, if the player has this permission.
	 * If hasPermission is false, is check if the player hasnt the Permission. True for normal check.
	 * @param uuid
	 * @param permission
	 * @param hasPermission
	 * @param message
	 */
	void sendMessage(ArrayList<UUID> uuid, String permission, boolean hasPermission, String... message);

	/**
	 * Send messages to all Player in the BungeeCord proxy.
	 * @param message
	 */
	void sendMessage(String... message);
	
	/**
	 * Send messages to all Player in the BungeeCord proxy, if the players has this permission.
	 * If hasPermission is false, is check if the player hasnt the Permission. True for normal check.
	 * @param permission
	 * @param hasPermission
	 * @param message
	 */
	void sendMessage(String permission, boolean hasPermission, String... message);
}
