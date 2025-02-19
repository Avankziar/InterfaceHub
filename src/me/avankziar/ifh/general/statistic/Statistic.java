package me.avankziar.ifh.general.statistic;

import java.util.UUID;

public interface Statistic
{
	public Long getStatistic(UUID uuid, StatisticType statisticType);
	
	public boolean addStatistic(UUID uuid, StatisticType statisticType, long value);
}