package me.avankziar.ifh.general.statistic;

import java.util.UUID;

import javax.annotation.Nullable;

public interface Statistic
{
	/**
	 * Return the value of the statistictype.<br>
	 * null if the player has no entry in this statistictype.
	 * @param uuid
	 * @param statisticType
	 * @return
	 */
	public Double getStatistic(UUID uuid, StatisticType statisticType);
	
	/**
	 * Return the value of the statistictype and the material or entitytype as string.<br>
	 * null if the player has no entry in this statistictype.
	 * @param uuid
	 * @param statisticType
	 * @param materialOrEntityType
	 * @return
	 */
	public Double getStatistic(UUID uuid, StatisticType statisticType, String materialOrEntityType);
	
	/**
	 * Add the value to the statistictype and/or materialOrEntityType.
	 * @param uuid
	 * @param statisticType
	 * @param materialOrEntityType
	 * @param value
	 */
	public void addStatisticValue(UUID uuid, StatisticType statisticType, @Nullable String materialOrEntityType, double value);
}