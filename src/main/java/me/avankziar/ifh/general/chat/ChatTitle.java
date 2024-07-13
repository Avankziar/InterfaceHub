package me.avankziar.ifh.general.chat;

import java.util.ArrayList;
import java.util.UUID;

/**
 * The chattitle are pre- and suffix which most are placed before and after the playername.
 * They can have hover or click events, permissions etc.
 * @author Avankziar
 *
 */
public interface ChatTitle
{
	/**
	 * Return all active chattitles. First the Prefix, after the Suffix. Sorted within after weight
	 * @return ArrayList[String]
	 */
	public ArrayList<String> getChatTitle();
	
	/**
	 * Return all active chattitles of the player. First the Prefix, after the Suffix. Sorted within after weight
	 * <br>Only possible if the player is online.
	 * @param uuid
	 * @return
	 */
	public ArrayList<String> getChatTitle(UUID uuid);
	
	/**
	 * Register a chattitle.<br>
	 * @param uniquechattitle
	 * @param isPrefix
	 * @param inChatName
	 * @param inChatColorCode
	 * @param suggestCommand
	 * @param hover
	 * @param permission
	 * @param weight
	 * @param registerOnBungee
	 * @return
	 */
	public boolean registerChatTitle(String uniquechattitle, boolean isPrefix, String inChatName,
			String inChatColorCode, String suggestCommand, String hover, String permission, int weight,
			boolean registerOnBungee);
	
	/**
	 * Return true, if the ChatTitle a prefix is. False if the ChatTitle a suffix is.<br>
	 * Return null, if the ChatTitle dont exist.
	 * @param chatTitle
	 * @return Boolean<br>null
	 */
	public Boolean isPrefix(String uniquechattitle);
	
	/**
	 * Return the ingame inchat format of the ChatTitle.<br>
	 * Return null, if the ChatTitle dont exist.
	 * @param chatTitle
	 * @return String<br>null
	 */
	public String getInChatName(String uniquechattitle);
	
	/**
	 * Return the ingame inchat color code of the ChatTitle. It can be in '&x' and in hex '&#xxxxxx'.<br>
	 * Return null, if the ChatTitle dont exist.
	 * @param chatTitle
	 * @return String<br>null
	 */
	public String getInChatColor(String uniquechattitle);
	
	/**
	 * Return the value of the clickevent of the ChatTitle.<br>
	 * Return null, if the ChatTitle dont exist.
	 * @param chatTitle
	 * @return String<br>null
	 */
	public String getClickEvent(String uniquechattitle);
	
	/**
	 * Return the value of the hoverevent of the ChatTitle.<br>
	 * Return null, if the ChatTitle dont exist.
	 * @param chatTitle
	 * @return String<br>null
	 */
	public String getHoverEvent(String uniquechattitle);
	
	/**
	 * Return the permission of the ChatTitle.<br>
	 * Return null, if the ChatTitle dont exist.
	 * @param chatTitle
	 * @return String<br>null
	 */
	public String getPermission(String uniquechattitle);
	
	/**
	 * Return the weight of the ChatTitle.<br>
	 * Return null, if the ChatTitle dont exist.
	 * @param chatTitle
	 * @return Integer<br>null
	 */
	public Integer getWeight(String uniquechattitle);
}