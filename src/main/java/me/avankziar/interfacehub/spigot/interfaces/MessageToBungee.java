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
	 * Send messages to BungeeCord proxy to multiple player with this uuid.
	 * @param uuid
	 * @param message
	 */
	void sendMessage(ArrayList<UUID> uuid, String... message);

	
	/**
	 * Send messages to all Player in the BungeeCord proxy.
	 * @param message
	 */
	void sendMessage(String... message);
}
