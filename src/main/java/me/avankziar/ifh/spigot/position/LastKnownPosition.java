package main.java.me.avankziar.ifh.spigot.position;

import java.util.UUID;

public interface LastKnownPosition
{
	//BTM sended the backlocation
	ServerLocation getLastKnownPosition(UUID uuid);
}
