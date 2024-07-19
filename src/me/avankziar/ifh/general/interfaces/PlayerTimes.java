package me.avankziar.ifh.general.interfaces;

import java.util.UUID;

public interface PlayerTimes
{
	final static long SEC = 1000L;
	final static long MIN = SEC*60;
	final static long HOUR = MIN*60;
	final static long DAY = HOUR*24;
	final static long WEEK = DAY*7;
	final static long YEAR = DAY*365;
	/*
	 * Is the PlayerTimes as such enabled.
	 */
	boolean isEnabled();
	
	/*
	 * Return true if the plugin creates a player's playtime log per day.
	 */
	boolean supportDailyLog();
	
	/*
	 * Return true, if the player is known by the plugin. And/or has a account in the databasesystem of the plugin.
	 */
	boolean hasAccount(UUID uuid);
	
	/*
	 * Return true, if a account have successful created.
	 */
	boolean createAccount(UUID uuid, String playername);
	
	/*
	 * Return true, if a account have been deleted.
	 */
	boolean deleteAccount(UUID uuid);
	
	/*
	 * Return true, if the player is active/aka non-afk.
	 */
	boolean isActive(UUID uuid);
	
	/*
	 * Return true if the player has made a new Activity, and set to be active.
	 */
	boolean setActive(UUID uuid);
		
	/*
	 * Return true if the player set to be inactive.
	 */
	boolean setInactive(UUID uuid);
	
	/*
	 * Return true, if the player is online. This methode is ideal for a system with Cross-server mysql, where it is stored whether players are online.
	 */
	boolean isOnline(UUID uuid);
	
	/*
	 * Return true if the player set to be on- or offline.
	 */
	boolean setOnline(UUID uuid, boolean online);
		
	/*
	 * Return true if the plugin tracks the player's entire playing time.
	 */
	boolean isTotalTimeEnabled();
	
	/*
	 * Return the total playing time of the player in milliseconds.
	 */
	long getTotalTime(UUID uuid);
	
	/*
	 * Return the total playing time of the player's last x days.
	 */
	long getTotalTime(UUID uuid, int days);
	
	/*
	 * Return true if the time (in milliseconds) has been successfully added to the total time.
	 */
	boolean addTotalTime(UUID uuid, long... time);
	
	/*
	 * Return true if the player total time is set.
	 */
	boolean setTotalTime(UUID uuid, long time);
	
	/*
	 * Return true if the plugin tracks the player's active playing time.
	 */
	boolean isActiveTimeEnabled();
	
	/*
	 * Return the active playing time of the player in milliseconds.
	 */
	long getActiveTime(UUID uuid);
	
	/*
	 * Return the active playing time of the player's last x days.
	 */
	long getActiveTime(UUID uuid, int days);
	
	/*
	 * Return true if the time (in milliseconds) has been successfully added to the active time.
	 */
	boolean addActiveTime(UUID uuid, long... time);
	
	/*
	 * Return true if the player active time is set.
	 */
	boolean setActiveTime(UUID uuid, long time);
	
	/*
	 * Return true if the plugin tracks the player's inactive playing time.
	 */
	boolean isInactiveTimeEnabled();
	
	/*
	 * Return the inactive playing time of the player in milliseconds.
	 */
	long getInactiveTime(UUID uuid);
	
	/*
	 * Return the inactive playing time of the player's last x days.
	 */
	long getInactiveTime(UUID uuid, int days);	
	
	/*
	 * Return true if the time (in milliseconds) has been successfully added to the inactive time.
	 */
	boolean addInactiveTime(UUID uuid, long... time);
	
	/*
	 * Return true if the player inactive time is set.
	 */
	boolean setInactiveTime(UUID uuid, long time);
	
	/*
	 * Return true if the player is actual in vacation
	 */
	boolean isVacacation(UUID uuid);
	
	/*
	 * Return true if the vacationend time (in milliseconds) has been set.
	 */
	boolean setVacation(UUID uuid, long vacationEnd);
	
	/*
	 * Return true if the vacation time has been set.
	 * Meant, for example, that the player is on vacation until the year 2021, month 6 (June), 17th day, 16:30:45.
	 */
	boolean setVacation(UUID uuid, int year, int month, int day, int hour, int minute, int second);
	
	/*
	 * Return the time, when the vacation of the player ends.
	 */
	long getVacation(UUID uuid);
	
	/*
	 * Return the last activity in milliseconds from the Player.
	 */
	long getLastActivity(UUID uuid);
	
	/*
	 * Return true if the player last active is set.
	 */
	boolean setLastActivity(UUID uuid, long time);
	
	String formatDate(long time);
	
	String formatDate(long time, boolean useYears, boolean useMonths, boolean useDays, boolean useHours, boolean useMinutes, boolean useSeconds);
	
	String formatTimePeriod(long time);
	
	String formatTimePeriod(long time, boolean useYears, boolean useDays, boolean useHours, boolean useMinutes, boolean useSeconds);
}