package main.java.me.avankziar.ifh.general.chat;

import java.util.List;

/**
 * The channels are digital seperations in the chat. They are reachable with entry symbols.
 * They have maybe a chatformat etc.
 * @author Avankziar
 *
 */
public interface Channel
{
	/**
	 * Return the pluginname, which provided this.<br>
	 * For example: SimpleChatChannels... etc.<br>
	 * @return String
	 */
	public String getProvider();
	
	/**
	 * Return the entry symbol of the channel. The parameter 'NULL' as String means, that this channel has no entry symbol.<br>
	 * Return null if the channel dont exist.
	 * @param channel
	 * @return String<br>null
	 */
	public String getSymbol(String channel);
	
	/**
	 * Return the ingame inchat format name.<br>
	 * Return null if the channel dont exist.
	 * @param channel
	 * @return String<br>null
	 */
	public String getInChatName(String channel);
	
	/**
	 * Return the ingame inchat color code for the general message.<br>
	 * Return null if the channel dont exist.
	 * @param channel
	 * @return String<br>null
	 */
	public String getInChatColor(String channel);
	
	/**
	 * Return the permission of the channel.<br>
	 * Return null if the channel dont exist.
	 * @param channel
	 * @return String<br>null
	 */
	public String getPermission(String channel);
	
	/**
	 * Return the chatformat with all there replacers.<br>
	 * Return null if the channel dont exist.
	 * @param channel
	 * @return String<br>null
	 */
	public String getChatFormat(String channel);
	
	/**
	 * Return all knowable chatformat replacers.<br>
	 * Return null if the channel dont exist.
	 * @return List of Strings<br>null
	 */
	public List<String> getChatFormatReplacer();
	
	/**
	 * Return true if this channel is set on serverlevel. Means only the message are recieved by player on the same server.<br>
	 * Return null if the channel dont exist.
	 * @param channel
	 * @return
	 */
	public Boolean isSpecificServer(String channel);
	
	/**
	 * Return true if this channel is set on worldlevel. Means only the message are recieved by player on the same world.<br>
	 * Return null if the channel dont exist.
	 * @param channel
	 * @return Boolean<br>null
	 */
	public Boolean isSpecificWorld(String channel);
	
	/**
	 * Return true if this channel is set on coordinatelevel. 
	 * Means only the message are recieved by player on the same server and world and are maximal xx blocks away.<br>
	 * Return null if the channel dont exist.
	 * @param channel
	 * @return Boolean<br>null
	 */
	public Boolean hasBlockRadius(String channel);
	
	/**
	 * Return the blockradius. 0 means is isnt active.<br>
	 * Return null if the channel dont exist.
	 * @param channel
	 * @return Integer<br>null
	 */
	public Integer getBlockRadius(String channel);
	
	//INFO:More from scc channels?
}
