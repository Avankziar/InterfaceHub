package me.avankziar.ifh.spigot.event.player;

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
	private Player player;
	private long timeWhenChangeToAfk;

	public PlayerChangeToAfkEvent(@NonNull Player player, boolean isAsync)
	{
		super(isAsync);
		this.player = player;
		this.timeWhenChangeToAfk = System.currentTimeMillis();
	}
	
	public PlayerChangeToAfkEvent(@NonNull Player player, boolean isAsync, long timeWhenChangeToAfk)
	{
		super(isAsync);
		this.player = player;
		this.timeWhenChangeToAfk = timeWhenChangeToAfk;
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
	 * Time in millisec UNIX when change to afk.
	 * @return
	 */
	public long getTimeWhenChangeToAfk()
	{
		return timeWhenChangeToAfk;
	}
}