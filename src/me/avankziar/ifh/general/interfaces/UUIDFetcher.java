package me.avankziar.ifh.general.interfaces;

import java.util.UUID;

public interface UUIDFetcher
{	
	UUID getPlayerUUIDFromName(String playername);
	
	String getPlayerNameFromUUID(UUID uuid);
	
	int totalChecksIn10Mins();
}