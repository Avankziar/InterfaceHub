package main.java.me.avankziar.ifh.spigot.interfaces;

import java.util.Map;
import java.util.UUID;

public interface ProxyOnlinePlayers
{
	/**
	 * @return a map of all online player on the proxy. The uuid as key and the value servername.
	 */
	Map<UUID, String> getProxyOnlinePlayers();
	
	/**
	 * get the boolean if the player is online on the proxy
	 * @param uuid
	 * @return
	 */
	boolean isProxyOnline(UUID uuid);
	
	/**
	 * get the servername, if the player is online on the proxy.
	 * If the player is not online, it will return null.
	 * @param uuid
	 * @return
	 */
	String getServer(UUID uuid);
}
