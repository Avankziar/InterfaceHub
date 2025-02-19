package me.avankziar.ifh.spigot.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * Player Status changed to not afk (not away from keyboard). Mean the player is now active.
 * Called, when a online player, which was afk, has make a activity. So the player is now active.
 * @author Avankziar
 */
public class PlayerChangeToNotAfkEvent extends Event
{
	private static final HandlerList HANDLERS = new HandlerList();
	private Player player;
	private long timeWhenChangeToNotAfk;

	public PlayerChangeToNotAfkEvent(@NonNull Player player, boolean isAsync)
	{
		super(isAsync);
		this.player = player;
		this.timeWhenChangeToNotAfk = System.currentTimeMillis();
	}
	
	public PlayerChangeToNotAfkEvent(@NonNull Player player, boolean isAsync, long timeWhenChangeToNotAfk)
	{
		super(isAsync);
		this.player = player;
		this.timeWhenChangeToNotAfk = timeWhenChangeToNotAfk;
	}
	
	public HandlerList getHandlers() 
    {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() 
    {
        return HANDLERS;
    }
	
	public Player getPlayer()
	{
		return player;
	}
	
	/**
	 * Time in millisec UNIX when change to not afk.
	 * @return
	 */
	public long getTimeWhenChangeToNotAfk()
	{
		return timeWhenChangeToNotAfk;
	}
}