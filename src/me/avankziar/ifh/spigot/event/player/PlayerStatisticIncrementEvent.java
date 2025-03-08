package me.avankziar.ifh.spigot.event.player;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
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
	private Material material;
	private EntityType entityType;
	private double incrementValue;

	public PlayerStatisticIncrementEvent(@NonNull Player player, StatisticType statisticType, Material material, double incrementValue,
			boolean isAsync)
	{
		super(isAsync);
		this.player = player;
		this.statisticType = statisticType;
		this.material = material;
		this.entityType = null;
		this.incrementValue = incrementValue;
	}
	
	public PlayerStatisticIncrementEvent(@NonNull Player player, StatisticType statisticType, EntityType entityType, double incrementValue,
			boolean isAsync)
	{
		super(isAsync);
		this.player = player;
		this.statisticType = statisticType;
		this.material = null;
		this.entityType = entityType;
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
	
	public Material getMaterial()
	{
		return material;
	}
	
	public EntityType getEntityType()
	{
		return entityType;
	}

	public double getIncrementValue() 
	{
		return incrementValue;
	}
}