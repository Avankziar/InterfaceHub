package main.java.me.avankziar.interfacehub.spigot.interfaces;

import java.util.ArrayList;
import java.util.UUID;

import org.bukkit.Sound;

import net.md_5.bungee.api.chat.BaseComponent;

public interface BaseComponentToBungee
{
	/**
	 * Sends messages consisting of BaseComponents to BungeeCord. An SubArrayList is a separate message.
	 * <br>A <b>BaseComponent</b> can be also a <b>TextComponent</b>.
	 * <br>Only to this uuid.
	 * @param uuid
	 * @param message
	 */
	void sendMessage(UUID uuid, ArrayList<ArrayList<BaseComponent>> message);
	
	/**
	 * Sends messages consisting of BaseComponents to BungeeCord. An SubArrayList is a separate message.
	 * <br>A <b>BaseComponent</b> can be also a <b>TextComponent</b>.
	 * <br>Only to this uuid. The sound is sended back to the spigot server, where the player is located.
	 * <br>The sound is played at the player location with 3.0F and 0.5F.
	 * @param uuid
	 * @param sound
	 * @param message
	 */
	void sendMessage(UUID uuid, Sound sound, ArrayList<ArrayList<BaseComponent>> message);
	
	/**
	 * Sends messages consisting of BaseComponents to BungeeCord. An SubArrayList is a separate message.
	 * <br>A <b>BaseComponent</b> can be also a <b>TextComponent</b>.
	 * @param uuid
	 * @param message
	 */
	void sendMessage(ArrayList<UUID> uuid, ArrayList<ArrayList<BaseComponent>> message);
	
	/**
	 * Sends messages consisting of BaseComponents to BungeeCord. An SubArrayList is a separate message.
	 * <br>A <b>BaseComponent</b> can be also a <b>TextComponent</b>.
	 * <br>Only to the uuids in the list. The sound is sended back to the spigot server, where the players are located.
	 * <br>The sound is played at the player location with 3.0F and 0.5F.
	 * @param uuid
	 * @param sound
	 * @param message
	 */
	void sendMessage(ArrayList<UUID> uuid, Sound sound, ArrayList<ArrayList<BaseComponent>> message);
	
	/**
	 * Sends messages consisting of BaseComponents to BungeeCord. An SubArrayList is a separate message.
	 * <br>A <b>BaseComponent</b> can be also a <b>TextComponent</b>.
	 * <br>If hasPermission is false, will check if the player hasnt the Permission. True for normal check.
	 * @param uuid
	 * @param permission
	 * @param hasPermission
	 * @param message
	 */
	void sendMessage(ArrayList<UUID> uuid, String permission, boolean hasPermission, ArrayList<ArrayList<BaseComponent>> message);
	
	/**
	 * Sends messages consisting of BaseComponents to BungeeCord. An SubArrayList is a separate message.
	 * <br>A <b>BaseComponent</b> can be also a <b>TextComponent</b>.
	 * <br>If hasPermission is false, will check if the player hasnt the Permission. True for normal check.
	 * <br>Only to the uuids in the list. The sound is sended back to the spigot server, where the players are located.
	 * <br>The sound is played at the player location with 3.0F and 0.5F.
	 * @param uuid
	 * @param permission
	 * @param hasPermission
	 * @param sound
	 * @param message
	 */
	void sendMessage(ArrayList<UUID> uuid, String permission, boolean hasPermission, Sound sound, ArrayList<ArrayList<BaseComponent>> message);

	/**
	 * Sends messages consisting of BaseComponents to BungeeCord. An SubArrayList is a separate message.
	 * <br>A <b>BaseComponent</b> can be also a <b>TextComponent</b>.
	 * @param message
	 */
	void sendMessage(ArrayList<ArrayList<BaseComponent>> message);
	
	/**
	 * Sends messages consisting of BaseComponents to BungeeCord. An SubArrayList is a separate message.
	 * <br>A <b>BaseComponent</b> can be also a <b>TextComponent</b>.
	 * @param sound
	 * @param message
	 */
	void sendMessage(Sound sound, ArrayList<ArrayList<BaseComponent>> message);
	
	/**
	 * Sends messages consisting of BaseComponents to BungeeCord. An SubArrayList is a separate message.
	 * <br>A <b>BaseComponent</b> can be also a <b>TextComponent</b>.
	 * <br>If hasPermission is false, will check if the player hasnt the Permission. True for normal check.
	 * <br>The sound is played at the player location with 3.0F and 0.5F.
	 * @param permission
	 * @param hasPermission
	 * @param message
	 */
	void sendMessage(String permission, boolean hasPermission, ArrayList<ArrayList<BaseComponent>> message);
	
	/**
	 * Sends messages consisting of BaseComponents to BungeeCord. An SubArrayList is a separate message.
	 * <br>A <b>BaseComponent</b> can be also a <b>TextComponent</b>.
	 * <br>If hasPermission is false, will check if the player hasnt the Permission. True for normal check.
	 * <br>The sound is played at the player location with 3.0F and 0.5F.
	 * @param permission
	 * @param hasPermission
	 * @param sound
	 * @param message
	 */
	void sendMessage(String permission, boolean hasPermission, Sound sound, ArrayList<ArrayList<BaseComponent>> message);
}
