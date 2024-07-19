package me.avankziar.ifh.spigot.interfaces;

import java.util.ArrayList;
import java.util.UUID;

import org.bukkit.entity.Player;

public interface Vanish
{
	ArrayList<UUID> getInvisiblePlayers();
	
	ArrayList<UUID> getAllInvisiblePlayers();
	
	boolean isInvisible(Player player);
	
	boolean isInvisibleOffline(UUID uuid);
	
	void hidePlayer(Player player);
	
	void showPlayer(Player player);
	
	boolean canSee(Player viewer, Player viewed);
}