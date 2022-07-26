package main.java.me.avankziar.ifh.spigot.permission;

import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import org.bukkit.entity.Player;

public interface Permission
{
	public boolean hasPermission(Player player, String permission);
	
	public CompletableFuture<Boolean> hasPermission(UUID uuid, String permission);
	
	public long expireIn(Player player, String permission);
	
	public long expireIn(UUID uuid, String permission);
	
	public void addPermissionAtPlayer(UUID uuid, String permission, Long duration, Map<String, String> additionalContext);
	
	public void removePermissionAtPlayer(UUID uuid, String permission);
	
	public boolean isInGroup(Player player, String group);
	
	public boolean hasPermission(String group, String permission);
	
	public ArrayList<String> getGroups();
	
	public long expireIn(String group, String permission);
	
	public void addPermissionAtGroup(String group, String permission, Long duration, Map<String, String> additionalContext);
	
	public void removePermissionAtGroup(String group, String permission);
}