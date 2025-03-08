package me.avankziar.ifh.velocity.event.player;

import java.util.Objects;

import com.velocitypowered.api.event.ResultedEvent;
import com.velocitypowered.api.event.ResultedEvent.GenericResult;
import com.velocitypowered.api.proxy.Player;

import me.avankziar.ifh.general.statistic.StatisticType;

public class PlayerStatisticIncrementEvent implements ResultedEvent<GenericResult>
{
	protected GenericResult result = GenericResult.allowed(); // Allowed by default
	private Player player;
	private StatisticType statisticType;
	private double incrementValue;
	
	public PlayerStatisticIncrementEvent(Player player, StatisticType statisticType, double incrementValue)
	{
		this.player = player;
		this.statisticType = statisticType;
		this.incrementValue = incrementValue;
	}
	
	@Override
	public void setResult(GenericResult result) 
	{
		this.result = Objects.requireNonNull(result);
	}

	@Override
	public GenericResult getResult()
	{
		return this.result;
	}

	public Player getPlayer()
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