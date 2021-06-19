package main.java.me.avankziar.interfacehub.general.chat;

import java.util.LinkedHashMap;
import java.util.UUID;

import net.md_5.bungee.api.chat.TextComponent;

/**
 * The chat interface covers all the general things from in-game chat.<br>
 * More specific things like ChatTitle (pre- and suffix) and Channels have to be fetched in the respective interfaces.<br>
 * Here you only get the identifier name as a string.
 * @author Avankziar
 */
public interface Chat
{
	/**
	 * Return the pluginname, which provided this.<br>
	 * For example: SimpleChatChannels... etc.<br>
	 * @return String
	 */
	public String getProvider();
	
	/**
	 * Return true, if roleplaynames are supported.
	 * @return boolean
	 */
	public boolean supportRolePlayNames();
	
	/**
	 * Return the roleplayname. If this is not supported, returns null.
	 * @return String<br>null
	 */
	public String getRolePlayName();
	
	/**
	 * Return true if chat channels are supported.
	 * @return boolean
	 */
	public boolean supportChannels();
	
	/**
	 * Return a string array with the names of the active channels in the proviing plugins.<br>
	 * Other settings of the channels must be determind by the Channels interface.<br>
	 * Return null, if no channel exists.
	 * @return String[]<br>null
	 */
	public String[] getAllChannels();
	
	/**
	 * Return all channels of the player.<br>
	 * Other settings of the channels must be determind by the Channels interface.<br>
	 * Return null, if the player has no active
	 * @param uuid
	 * @return String[]<br>null
	 */
	public String[] getChannels(UUID uuid);
	
	/**
	 * Return all <b>active</b> channels of the player.<br>
	 * Other settings of the channels must be determind by the Channels interface.<br>
	 * Return null, if the player has no active
	 * @param playername
	 * @return String[]<br>null
	 */
	public String[] getActiveChannels(UUID uuid);
	
	/**
	 * Return true, if chattitles are supported.
	 * @return boolean
	 */
	public boolean supportChatTitles();
	
	/**
	 * Return a string array with the names of the active chattitle in the providing plugin.<br>
	 * Return null, if no chattitle exists.
	 * @return String[]<br>null
	 */	
	public String[] getAllChatTitles();
	
	/**
	 * Return all chattitlenames from the player. For example: <b>Admin</b>, <b>Moderator</b> etc.<br>
	 * Return null, if the player isnt exist or if he has no chattitle.
	 * @param uuid
	 * @return String[]<br>null
	 */
	public String[] getChatTitles(UUID uuid);
	
	/**
	 * Return true, if emojis are supported.
	 * @return boolean
	 */
	public boolean supportEmojis();
	
	/**
	 * Return all active Emojis.
	 * The key parameter is the yamlconfiguration path.
	 * The actual emoji is the value parameter.<br>
	 * If emojis arent supported, it returns a empty LinkedHashMap.
	 * @return LinkedHashMap<String, String>
	 */
	public LinkedHashMap<String, String> getAllEmojis();
	
	/**
	 * Return a TextComponent, which was parsed through the default parser.
	 * @param rawMessage
	 * @return TextComponent
	 */	
	public TextComponent parseMessage(String rawMessage);
	
	/**
	 * Return a TextComponent, which was parsed through the parser of the channel.
	 * If the channel dont exist it returns a empty TextComponent.
	 * @param rawMessage
	 * @return TextComponent
	 */
	public TextComponent parseMessage(String rawMessage, String channel);
}
