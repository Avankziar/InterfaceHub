package me.avankziar.ifh.general.chat;

import java.util.ArrayList;
import java.util.UUID;

/**
 * The channels are digital seperations in the chat. They are reachable with entry symbols.
 * They have maybe a chatformat etc.
 * @author Avankziar
 *
 */
public interface Channel
{
	/**
	 * Return a list of the uniquename of the channels.
	 * @return ArrayList[String]
	 */
	public ArrayList<String> getChannels();
	
	/**
	 * Return all channels of the player.<br>
	 * Other settings of the channels must be determind by the Channels interface.<br>
	 * Return null, if the player is not existent.
	 * @param uuid
	 * @return ArrayList[String]<br>null
	 */
	public ArrayList<String> getChannels(UUID uuid);
	
	/**
	 * Return all <b>active</b> channels of the player.<br>
	 * Other settings of the channels must be determind by the Channels interface.<br>
	 * Return null, if the player is not existent.
	 * @param playername
	 * @return ArrayList[String]<br>null
	 */
	public ArrayList<String> getActiveChannels(UUID uuid);
	
	/**
	 * Registered a channel.
	 * <br>Return true if the channel was registered. False if not.
	 * <br>Beware to register the channel on the system, where you want it to use. So if it should be used over the proxy
	 * so register it there!
	 * @param uniqueChannelName
	 * @param symbol
	 * @param inChatName
	 * @param inChatColorMessage
	 * @param permission
	 * @param joinPart
	 * @param chatFormat
	 * @param useSpecificServer
	 * @param useSpecificWorld
	 * @param useBlockRadius
	 * @param minimumTimeBetweenMessages
	 * @param minimumTimeBetweenSameMessage
	 * @param percentOfSimiliarityOrLess
	 * @param timeColor
	 * @param playernameCustomColor
	 * @param mentionSound
	 * @param useColor
	 * @param useItemReplacer
	 * @param useBookReplacer
	 * @param useRunCommandReplacer
	 * @param useSuggestCommandReplacer
	 * @param useWebsiteReplacer
	 * @param useEmojiReplacer
	 * @param usePositionReplacer
	 * @return
	 */
	public boolean registerChannel(
			String uniqueChannelName, String symbol, String inChatName, String inChatColorMessage,
			String permission, String joinPart, String chatFormat,
			boolean useSpecificServer, boolean useSpecificWorld, int useBlockRadius, 
			long minimumTimeBetweenMessages, long minimumTimeBetweenSameMessage, double percentOfSimiliarityOrLess,
			String timeColor, String playernameCustomColor,
			String seperatorBetweenPrefix, String seperatorBetweenSuffix,
			String mentionSound,
			boolean useColor, boolean useItemReplacer, boolean useBookReplacer,
			boolean useRunCommandReplacer, boolean useSuggestCommandReplacer, boolean useWebsiteReplacer,
			boolean useEmojiReplacer, boolean useMentionReplacer, boolean usePositionReplacer,
			boolean registerOnBungee);
	
	/**
	 * Registered a channel. The smaller version.
	 * <br>Return true if the channel was registered. False if not.
	 * @param uniqueChannelName
	 * @param symbol
	 * @param inChatName
	 * @param inChatColorMessage
	 * @param permission
	 * @param joinPart
	 * @param chatFormat
	 * @param timeColor
	 * @param playernameCustomColor
	 * @param mentionSound
	 * @param useColor
	 * @param useItemReplacer
	 * @param useBookReplacer
	 * @param useRunCommandReplacer
	 * @param useSuggestCommandReplacer
	 * @param useWebsiteReplacer
	 * @param useEmojiReplacer
	 * @param usePositionReplacer
	 * @param registerOnBungee
	 * @return
	 */
	public boolean registerChannel(
			String uniqueChannelName, String symbol, String inChatName, String inChatColorMessage,
			String permission, String joinPart, String chatFormat,
			String timeColor, String playernameCustomColor,
			String mentionSound,
			boolean useColor, boolean useItemReplacer, boolean useBookReplacer,
			boolean useRunCommandReplacer, boolean useSuggestCommandReplacer, boolean useWebsiteReplacer,
			boolean useEmojiReplacer, boolean useMentionReplacer, boolean usePositionReplacer,
			boolean registerOnBungee);
	
	/**
	 * Return the entry symbol of the channel. The parameter 'NULL' as String means, that this channel has no entry symbol.<br>
	 * @param channel
	 * @return String<br>null if channel not exist
	 */
	public String getSymbol(String uniqueChannelName);
	
	/**
	 * Return the ingame inchat format name.<br>
	 * @param channel
	 * @return String<br>null if channel not exist
	 */
	public String getInChatName(String uniqueChannelName);
	
	/**
	 * Return the ingame inchat color code for the general message.<br>
	 * @param channel
	 * @return String<br>null if channel not exist || InChatColor not set
	 */
	public String getInChatColor(String uniqueChannelName);
	
	/**
	 * Return the permission of the channel.<br>
	 * @param channel
	 * @return String<br>null if channel not exist
	 */
	public String getPermission(String uniqueChannelName);
	
	/**
	 * Return the chatformat with all there replacers.<br>
	 * @param channel
	 * @return String<br>null if channel not exist
	 */
	public String getChatFormat(String uniqueChannelName);
	
	/**
	 * Return true if this channel is set on serverlevel. Means only the message are recieved by player on the same server.<br>
	 * @param channel
	 * @return
	 */
	public Boolean isSpecificServer(String uniqueChannelName);
	
	/**
	 * Return true if this channel is set on worldlevel. Means only the message are recieved by player on the same world.<br>
	 * @param channel
	 * @return Boolean<br>null if channel not exist
	 */
	public Boolean isSpecificWorld(String uniqueChannelName);
	
	/**
	 * Return true if this channel is set on coordinatelevel. 
	 * Means only the message are recieved by player on the same server and world and are maximal xx blocks away.<br>
	 * @param channel
	 * @return Boolean<br>null if channel not exist
	 */
	public Boolean hasBlockRadius(String uniqueChannelName);
	
	/**
	 * Return the blockradius. 0 means is isnt active.<br>
	 * @param channel
	 * @return Integer<br>null if channel not exist
	 */
	public Integer getBlockRadius(String uniqueChannelName);
	
	/**
	 * Return the used sound for the mentioning.
	 * @param sound
	 * @return
	 */
	public String getMentionSound(String uniqueChannelName);
	
	/**
	 * Return true, if the channel supported colored writing.
	 * @param uniqueChannelName
	 * @return
	 */
	public boolean isUsedColor(String uniqueChannelName);
	
	/**
	 * Return true, if in the channel itemreplacer can be used.
	 * @param uniqueChannelName
	 * @return
	 */
	public boolean isUsedItemReplacer(String uniqueChannelName);
	
	/**
	 * Return true, if in the channel bookreplacer can be used.
	 * @param uniqueChannelName
	 * @return
	 */
	public boolean isUsedBookReplacer(String uniqueChannelName);
	
	/**
	 * Return true, if in the channel runcommandreplacer can be used.
	 * @param uniqueChannelName
	 * @return
	 */
	public boolean isUsedRunCommandReplacer(String uniqueChannelName);
	
	/**
	 * Return true, if in the channel suggestcommandreplacer can be used.
	 * @param uniqueChannelName
	 * @return
	 */
	public boolean isUsedSuggestCommandReplacer(String uniqueChannelName);
	
	/**
	 * Return true, if in the channel websitereplacer can be used.
	 * @param uniqueChannelName
	 * @return
	 */
	public boolean isUsedWebsiteReplacer(String uniqueChannelName);
	
	/**
	 * Return true, if in the channel emojireplacer can be used.
	 * @param uniqueChannelName
	 * @return
	 */
	public boolean isUsedEmojiReplacer(String uniqueChannelName);
	
	/**
	 * Return true, if in the channel mentionreplacer can be used.
	 * @param uniqueChannelName
	 * @return
	 */
	public boolean isUsedMentionReplacer(String uniqueChannelName);
	
	/**
	 * Return true, if in the channel positionreplacer can be used.
	 * @param uniqueChannelName
	 * @return
	 */
	public boolean isUsedPositionReplacer(String uniqueChannelName);
}