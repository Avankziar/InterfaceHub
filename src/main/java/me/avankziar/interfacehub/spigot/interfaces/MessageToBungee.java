package main.java.me.avankziar.interfacehub.spigot.interfaces;

import java.util.UUID;

import org.bukkit.entity.Player;

public interface MessageToBungee
{
	/**
	 * Send message to BungeeCord proxy to one player with this uuid.
	 * @param uuid
	 * @param message
	 */
	void sendMessage(UUID uuid, String message);
	
	/**
	 * Send message to BungeeCord proxy to one player.
	 * @param player
	 * @param message
	 */
	void sendMessage(Player player, String message);
	
	/**
	 * Send message to all Player in the BungeeCord proxy.
	 * @param message
	 */
	void sendMessage(String message);
}
