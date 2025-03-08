package me.avankziar.ifh.bungee.event.player;

import me.avankziar.ifh.general.statistic.StatisticType;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Event;

public class PlayerStatisticIncrementEvent extends Event
{
	private ProxiedPlayer player;
	private StatisticType statisticType;
	private double incrementValue;
	
	public PlayerStatisticIncrementEvent(ProxiedPlayer player, StatisticType statisticType, double incrementValue)
	{
		this.player = player;
		this.statisticType = statisticType;
		this.incrementValue = incrementValue;
	}

	public ProxiedPlayer getPlayer()
	{
		return player;
	}

	public StatisticType getStatisticType()
	{
		return statisticType;
	}

	public double getIncrementValue()
	{
		return incrementValue;
	}
}