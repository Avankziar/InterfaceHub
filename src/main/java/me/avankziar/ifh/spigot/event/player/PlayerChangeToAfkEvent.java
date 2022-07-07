package main.java.me.avankziar.ifh.spigot.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * Player Status changed to afk (away from keyboard).
 * Called, when a online player, which was active, has make for a while no activity. So the player is now afk set.
 * @author Avankziar
 */
public class PlayerChangeToAfkEvent extends Event
{
	private static final HandlerList HANDLERS = new HandlerList();
	private boolean isCancelled;
	private Player player;

	public PlayerChangeToAfkEvent(@NonNull Player player, boolean isAsync)
	{
		super(isAsync);
		setCancelled(false);
		this.player = player;
	}
	
	public HandlerList getHandlers() 
    {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() 
    {
        return HANDLERS;
    }

	public boolean isCancelled()
	{
		return isCancelled;
	}

	public void setCancelled(boolean isCancelled)
	{
		this.isCancelled = isCancelled;
	}
	
	public Player getPlayer()
	{
		return player;
	}
}