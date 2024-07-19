package me.avankziar.ifh.spigot.tobungee.displaychatlike;

import java.util.ArrayList;
import java.util.UUID;

import org.bukkit.Sound;

public interface TitleMessageToBungee
{
	/**
	 * 
	 * @param uuid
	 * @param title
	 * @param subtitle
	 */
	void sendTitleMessage(UUID uuid, String title, String subtitle);
	
	void sendTitleMessage(UUID uuid, String title, String subtitle, int fadeIn, int stay, int fadeout);
	
	void sendTitleMessage(UUID uuid, String title, String subtitle, Sound sound);
	
	void sendTitleMessage(UUID uuid, String title, String subtitle, int fadeIn, int stay, int fadeout, Sound sound);
	
	void sendTitleMessage(UUID uuid, String title, String subtitle, String permission, boolean hasPermission);
	
	void sendTitleMessage(UUID uuid, String title, String subtitle, int fadeIn, int stay, int fadeout, String permission, boolean hasPermission);
	
	void sendTitleMessage(UUID uuid, String title, String subtitle, Sound sound, String permission, boolean hasPermission);
	
	void sendTitleMessage(UUID uuid, String title, String subtitle, int fadeIn, int stay, int fadeout, Sound sound, String permission, boolean hasPermission);
	
	void sendTitleMessage(ArrayList<UUID> uuid, String title, String subtitle);
	
	void sendTitleMessage(ArrayList<UUID> uuid, String title, String subtitle, int fadeIn, int stay, int fadeout);
	
	void sendTitleMessage(ArrayList<UUID> uuid, String title, String subtitle, Sound sound);
	
	void sendTitleMessage(ArrayList<UUID> uuid, String title, String subtitle, int fadeIn, int stay, int fadeout, Sound sound);
	
	void sendTitleMessage(ArrayList<UUID> uuid, String title, String subtitle, String permission, boolean hasPermission);
	
	void sendTitleMessage(ArrayList<UUID> uuid, String title, String subtitle, int fadeIn, int stay, int fadeout, String permission, boolean hasPermission);
	
	void sendTitleMessage(ArrayList<UUID> uuid, String title, String subtitle, Sound sound, String permission, boolean hasPermission);
	
	void sendTitleMessage(ArrayList<UUID> uuid, String title, String subtitle, int fadeIn, int stay, int fadeout, Sound sound, String permission, boolean hasPermission);
	
	void sendTitleMessage(String title, String subtitle);
	
	void sendTitleMessage(String title, String subtitle, int fadeIn, int stay, int fadeout);
	
	void sendTitleMessage(String title, String subtitle, Sound sound);
	
	void sendTitleMessage(String title, String subtitle, int fadeIn, int stay, int fadeout, Sound sound);
	
	void sendTitleMessage(String title, String subtitle, String permission, boolean hasPermission);
	
	void sendTitleMessage(String title, String subtitle, int fadeIn, int stay, int fadeout, String permission, boolean hasPermission);
	
	void sendTitleMessage(String title, String subtitle, Sound sound, String permission, boolean hasPermission);
	
	void sendTitleMessage(String title, String subtitle, int fadeIn, int stay, int fadeout, Sound sound, String permission, boolean hasPermission);
}