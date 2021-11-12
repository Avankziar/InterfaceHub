package main.java.me.avankziar.ifh.spigot.interfaces;

import org.bukkit.OfflinePlayer;

public interface PlayerTimes
{
	/*
	 * Is the PlayerTimes as such enabled.
	 */
	boolean isEnabled();
	
	/*
	 * Return true if the plugin creates a player's playtime log per day.
	 */
	boolean supportDailyLog();
	
	/*
	 * The name of the plugin, which has implemented this interface.
	 */
	String getName();
	
	/*
	 * The authors of the plugin, which has implemented this interface.
	 */
	String getAuthors();
	
	/*
	 * The Version number of the plugin, which has implemented this interface.
	 */
	String getVersion();
	
	/*
	 * Return true, if the player is known by the plugin. And/or has a account in the databasesystem of the plugin.
	 */
	boolean hasAccount(OfflinePlayer player);
	
	/*
	 * Return true, if a account have successful created.
	 */
	boolean createAccount(OfflinePlayer player);
	
	/*
	 * Return true, if a account have been deleted.
	 */
	boolean deleteAccount(OfflinePlayer player);
	
	/*
	 * Return true, if the player is active/aka non-afk.
	 */
	boolean isActive(OfflinePlayer player);
	
	/*
	 * Return true if the player has made a new Activity, and set to be active.
	 */
	boolean setActive(OfflinePlayer player);
		
	/*
	 * Return true if the player set to be inactive.
	 */
	boolean setInactive(OfflinePlayer player);
	
	/*
	 * Return true, if the player is online. This methode is ideal for a system with Cross-server mysql, where it is stored whether players are online.
	 */
	boolean isOnline(OfflinePlayer player);
	
	/*
	 * Return true if the player set to be on- or offline.
	 */
	boolean setOnline(OfflinePlayer player, boolean online);
		
	/*
	 * Return true if the plugin tracks the player's entire playing time.
	 */
	boolean isTotalTimeEnabled();
	
	/*
	 * Return the total playing time of the player in milliseconds.
	 */
	long getTotalTime(OfflinePlayer player);
	
	/*
	 * Return the total playing time of the player's last x days.
	 */
	long getTotalTime(OfflinePlayer player, int days);
	
	/*
	 * Return true if the time (in milliseconds) has been successfully added to the total time.
	 */
	boolean addTotalTime(OfflinePlayer player, long time);
	
	/*
	 * Return true if the time has been successfully added to the total time.
	 * The integer is converted into the respective milliseconds. For example, 1 year is 1000*60*60*24*365 milliseconds.
	 */
	boolean addTotalTime(OfflinePlayer player, int years, int weeks, int days, int hours, int minutes, int seconds);
	
	/*
	 * Return true if the player total time is set.
	 */
	boolean setTotalTime(OfflinePlayer player, long time);
	
	/*
	 * Return true if the plugin tracks the player's active playing time.
	 */
	boolean isActiveTimeEnabled();
	
	/*
	 * Return the active playing time of the player in milliseconds.
	 */
	long getActiveTime(OfflinePlayer player);
	
	/*
	 * Return the active playing time of the player's last x days.
	 */
	long getActiveTime(OfflinePlayer player, int days);
	
	/*
	 * Return true if the time (in milliseconds) has been successfully added to the active time.
	 */
	boolean addActiveTime(OfflinePlayer player, long time);
	
	/*
	 * Return true if the time has been successfully added to the active time.
	 * The integer is converted into the respective milliseconds. For example, 1 year is 1000*60*60*24*365 milliseconds.
	 */
	boolean addActiveTime(OfflinePlayer player, int years, int weeks, int days, int hours, int minutes, int seconds);
	
	/*
	 * Return true if the player active time is set.
	 */
	boolean setActiveTime(OfflinePlayer player, long time);
	
	/*
	 * Return true if the plugin tracks the player's inactive playing time.
	 */
	boolean isInactiveTimeEnabled();
	
	/*
	 * Return the inactive playing time of the player in milliseconds.
	 */
	long getInactiveTime(OfflinePlayer player);
	
	/*
	 * Return the inactive playing time of the player's last x days.
	 */
	long getInactiveTime(OfflinePlayer player, int days);	
	
	/*
	 * Return true if the time (in milliseconds) has been successfully added to the inactive time.
	 */
	boolean addInactiveTime(OfflinePlayer player, long time);
	
	/*
	 * Return true if the time has been successfully added to the inactive time.
	 * The integer is converted into the respective milliseconds. For example, 1 year is 1000*60*60*24*365 milliseconds.
	 */
	boolean addInactiveTime(OfflinePlayer player, int years, int weeks, int days, int hours, int minutes, int seconds);
	
	/*
	 * Return true if the player inactive time is set.
	 */
	boolean setInactiveTime(OfflinePlayer player, long time);
	
	/*
	 * Return true if the player is actual in vacation
	 */
	boolean isVacacation(OfflinePlayer player);
	
	/*
	 * Return true if the vacationend time (in milliseconds) has been set.
	 */
	boolean setVacation(OfflinePlayer player, long vacationEnd);
	
	/*
	 * Return true if the vacation time has been set.
	 * Meant, for example, that the player is on vacation until the year 2021, month 6 (June), 17th day, 16:30:45.
	 */
	boolean setVacation(OfflinePlayer player, int year, int month, int day, int hour, int minute, int second);
	
	/*
	 * Return the time, when the vacation of the player ends.
	 */
	long getVacation(OfflinePlayer player);
	
	/*
	 * Return the last activity in milliseconds from the Player.
	 */
	long getLastActivity(OfflinePlayer player);
	
	/*
	 * Return true if the player last active is set.
	 */
	boolean setLastActivity(OfflinePlayer player, long time);
}