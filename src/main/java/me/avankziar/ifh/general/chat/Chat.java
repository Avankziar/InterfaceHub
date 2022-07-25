package main.java.me.avankziar.ifh.general.chat;

import java.util.LinkedHashMap;

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
	 * Return true, if roleplaynames are supported.
	 * @return boolean
	 */
	public boolean supportRolePlayNames();
	
	/**
	 * Return true if chat channels are supported.
	 * @return boolean
	 */
	public boolean supportChannels();
	
	/**
	 * Return true, if chattitles are supported.
	 * @return boolean
	 */
	public boolean supportChatTitles();
	
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