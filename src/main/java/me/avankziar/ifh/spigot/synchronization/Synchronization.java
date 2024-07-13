package me.avankziar.ifh.spigot.synchronization;

import org.bukkit.World;

public interface Synchronization
{
	/**
	 * Return the synchrokey of the spigot server.
	 * @return
	 */
	String getSynchroKey();
	
	/**
	 * Return the SynchroKey for the world.<br>
	 * If the World is null or the world not exist on the server, it returns the server synchrokey.
	 * @param world
	 * @return
	 */
	String getSynchroKey(World world);
}