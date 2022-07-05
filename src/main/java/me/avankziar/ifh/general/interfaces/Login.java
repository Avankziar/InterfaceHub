package main.java.me.avankziar.ifh.general.interfaces;

import java.util.UUID;

public interface Login
{
	/**
	 * Return a formated String, when the last Login occured
	 */
	String getLastLogin(UUID uuid);
	
	/**
	 * Return the amount of reconnects since date x.
	 * If sinceDate == 0, so all reconnects are to return.
	 * @param uuid
	 * @param sinceDate
	 * @return
	 */
	int getReconnectAmount(UUID uuid, long sinceDate);
	
	/**
	 * The current amount of consistent daily logins.
	 * @param uuid
	 * @return
	 */
	int getCurrentConsistentDailyLogins(UUID uuid);
	
	/**
	 * The maximum reached amount of consistent daily logins.
	 * @param uuid
	 * @return
	 */
	int getMaxConsistentDailyLogins(UUID uuid);
	
	/**
	 * Return the boolean, if the player today already joined.
	 * @param uuid
	 * @return
	 */
	boolean hasTodayJoined(UUID uuid);
	
	/**
	 * Allows to add a login externally. No matter if one has really taken place.
	 * @param uuid
	 * @param time
	 */
	void addLogin(UUID uuid, long time);
	
	/**
	 * Removes a Login.
	 * @param uuid
	 * @param time
	 * @return
	 */
	boolean removeLogin(UUID uuid, long time);
}