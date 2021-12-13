package main.java.me.avankziar.ifh.general.interfaces;

public interface UUIDFetcher
{
	String getPlayerUUIDFromName(String name);
	
	String getPlayerNameFromUUID(String uuid);
}