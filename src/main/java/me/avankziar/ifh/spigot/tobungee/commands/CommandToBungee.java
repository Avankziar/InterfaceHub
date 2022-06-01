package main.java.me.avankziar.ifh.spigot.tobungee.commands;

import java.util.UUID;

public interface CommandToBungee
{
	/**
	 * Execute a Command in Bungeecord as Console.
	 * Command without "/".
	 * @param command
	 */
	void executeAsConsole(String command);
	
	/**
	 * Execute a Command in Bungeecord as Console for all Player.
	 * Command without "/".
	 * @param command
	 */
	void executeAsConsoleForAllPlayers(String command);
	
	/**
	 * Execute a Command in Bungeecord as Console for all Player with player replacer.
	 * Command without "/".
	 * @param command
	 * @param playerReplacer
	 */
	void executeAsConsoleForAllPlayers(String command, String playerReplacer);
	
	/**
	 * Execute a Command in Bungeecord as Player for one Player.
	 * Command without "/".
	 * @param command
	 * @param playerUUID
	 */
	void executeAsPlayer(String command, UUID playerUUID);
	
	/**
	 * Execute a Command in Bungeecord as Player for all Player.
	 * Command without "/".
	 * @param command
	 */
	void executeAsPlayerForAllPlayers(String command);
	
	/**
	 * Execute a Command in Bungeecord as Player for all Player with player replacer.
	 * Command without "/".
	 * @param command
	 * @param playerReplacer
	 */
	void executeAsPlayerForAllPlayers(String command, String playerReplacer);
}
