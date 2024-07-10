package main.java.me.avankziar.ifh.general.chat;

import java.util.LinkedHashMap;

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
	 * Return a net.md_5.bungee.api.chat.TextComponent, which was parsed through the default parser.
	 * @param rawMessage
	 * @return TextComponent
	 * @deprecated 1.21
	 */	
	@Deprecated //since MC 1.21
	public net.md_5.bungee.api.chat.TextComponent parseMessage(String rawMessage);
	
	/**
	 * Return a net.md_5.bungee.api.chat.TextComponent, which was parsed through the parser of the channel.
	 * If the channel dont exist it returns a empty TextComponent.<br>
	 * <b>Cannot be used on Velocity</b>
	 * @param rawMessage
	 * @return TextComponent
	 * @deprecated 1.21
	 */
	@Deprecated //since MC 1.21
	public net.md_5.bungee.api.chat.TextComponent parseMessage(String rawMessage, String channel);
	
	/**
	 * Return a net.md_5.bungee.api.chat.TextComponent, which was parsed through the default parser.<br>
	 * <b>Cannot be used on Velocity</b>
	 * @param rawMessage
	 * @return TextComponent
	 */	
	public net.md_5.bungee.api.chat.TextComponent parseMessageToMD5Bungee(String rawMessage);
	
	/**
	 * Return a net.md_5.bungee.api.chat.TextComponent, which was parsed through the parser of the channel.
	 * If the channel dont exist it returns a empty TextComponent.<br>
	 * <b>Cannot be used on Velocity</b>
	 * @param rawMessage
	 * @return TextComponent
	 */
	public net.md_5.bungee.api.chat.TextComponent parseMessageToMD5Bungee(String rawMessage, String channel);
	
	/**
	 * Return a  net.kyori.adventure.text.Component, which was parsed through the default parser.<br>
	 * <b>Use with caution on bungee</b>
	 * @param rawMessage
	 * @return TextComponent
	 */	
	public net.kyori.adventure.text.Component parseMessageToAdventure(String rawMessage);
	
	/**
	 * Return a  net.kyori.adventure.text.Component, which was parsed through the parser of the channel.
	 * If the channel dont exist it returns a empty TextComponent.<br>
	 * <b>Use with caution on bungee</b>
	 * @param rawMessage
	 * @return TextComponent
	 */
	public net.kyori.adventure.text.Component parseMessageToAdventure(String rawMessage, String channel);
}