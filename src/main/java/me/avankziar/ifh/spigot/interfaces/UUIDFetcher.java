package main.java.me.avankziar.ifh.spigot.interfaces;

public interface UUIDFetcher
{
	String getPlayerUUIDFromName(String name);
	
	String getPlayerNameFromUUID(String uuid);
}