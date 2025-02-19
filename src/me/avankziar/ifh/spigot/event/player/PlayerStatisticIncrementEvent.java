package me.avankziar.ifh.spigot.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.checkerframework.checker.nullness.qual.NonNull;

import me.avankziar.ifh.general.statistic.StatisticType;
/**
 * Event which should be called, if a custom statistic will be incremented.
 * The Achievement plugin should be listen.
 */
public class PlayerStatisticIncrementEvent extends Event
{

	private static final HandlerList HANDLERS = new HandlerList();
	private Player player;
	private StatisticType statisticType;
	private long incrementValue;

	public PlayerStatisticIncrementEvent(@NonNull Player player, StatisticType statisticType, long incrementValue,
			boolean isAsync)
	{
		super(isAsync);
		this.player = player;
		this.statisticType = statisticType;
		this.incrementValue = incrementValue;
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

	public StatisticType getStatisticType() 
	{
		return statisticType;
	}

	public long getIncrementValue() 
	{
		return incrementValue;
	}
}