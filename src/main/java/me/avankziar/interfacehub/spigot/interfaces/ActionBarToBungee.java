package main.java.me.avankziar.interfacehub.spigot.interfaces;

import java.util.ArrayList;
import java.util.UUID;

import org.bukkit.Sound;

public interface ActionBarToBungee
{
	void sendActionBarMessage(UUID uuid, String actionbarmessage);
	
	void sendActionBarMessage(UUID uuid, String actionbarmessage, Sound sound);
	
	void sendActionBarMessage(UUID uuid, String actionbarmessage, String permission, boolean hasPermission);
	
	void sendActionBarMessage(UUID uuid, String actionbarmessage, Sound sound, String permission, boolean hasPermission);
	
	void sendActionBarMessage(ArrayList<UUID> uuid, String actionbarmessage);
	
	void sendActionBarMessage(ArrayList<UUID> uuid, String actionbarmessage, Sound sound);
	
	void sendActionBarMessage(ArrayList<UUID> uuid, String actionbarmessage, String permission, boolean hasPermission);
	
	void sendActionBarMessage(ArrayList<UUID> uuid, String actionbarmessage, Sound sound, String permission, boolean hasPermission);
	
	void sendActionBarMessage(String actionbarmessage);
	
	void sendActionBarMessage(String actionbarmessage, Sound sound);
	
	void sendActionBarMessage(String actionbarmessage, String permission, boolean hasPermission);
	
	void sendActionBarMessage(String actionbarmessage, Sound sound, String permission, boolean hasPermission);
}