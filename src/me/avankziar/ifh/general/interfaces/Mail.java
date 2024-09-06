package me.avankziar.ifh.general.interfaces;

import java.util.ArrayList;
import java.util.UUID;

import org.jetbrains.annotations.ApiStatus.ScheduledForRemoval;

import net.md_5.bungee.api.chat.TextComponent;

/**
 * Mails are offline messages from player to player or console to player.
 * @author Avankziar
 *
 */
@Deprecated()
@ScheduledForRemoval(inVersion = "2-1-0")
public interface Mail
{
	/**
	 * Return the pluginname, which provided this.<br>
	 * For example: SimpleChatChannels... etc.<br>
	 * @return String
	 */
	public String getProvider();
	
	/**
	 * Return the last received mails. The amount of the mails are determine through the start and end index.
	 * The latest mail begin with 0.<br>
	 * If the amount is negative or if the index is out of bounds, it will return null.
	 * @param uuid
	 * @param startIndex
	 * @param endIndex
	 * @return ArrayList of Integer<br>null
	 */
	public ArrayList<Integer> getLastRecievedMails(UUID uuid, int startIndex, int endIndex);
	
	/**
	 * Return the last unreaded mails. The amount of the mails are determine through the start and end index.
	 * The latest mail begin with 0.<br>
	 * If the amount is negative or if the index is out of bounds, it will return null.
	 * @param uuid
	 * @param startIndex
	 * @param endIndex
	 * @return ArrayList of Integer<br>null
	 */
	public ArrayList<Integer> getUnreadedMails(UUID uuid, int startIndex, int endIndex);
	
	/**
	 * Send a mail from a player sender to a player receiver. Return true if the mail was successfull sended.<br>
	 * @param sender
	 * @param reciver
	 * @param subject
	 * @param rawMessage
	 * @return boolean
	 */
	public boolean sendMail(UUID sender, UUID reciver, String subject, String rawMessage);
	
	/**
	 * Send a mail from a console sender to a player receiver. Return true if the mail was successfull sended.<br>
	 * @param sender
	 * @param reciver
	 * @param subject
	 * @param rawMessage
	 * @return boolean
	 */
	public boolean sendMail(UUID reciver, String subject, String rawMessage);
	
	/**
	 * Return the sender uuid as String. If the sender was the console, it will be display as 'Console' and not as uuid.<br>
	 * Return null, if the mail not exist.
	 * @param id
	 * @return String<br>null
	 */
	public String getSender(int id);
	
	/**
	 * Return the receiver uuid as String.<br>
	 * Return null, if the mail not exist.
	 * @param id
	 * @return String<br>null
	 */
	public String getReciver(int id);
	
	/**
	 * Return all Carbon Copys as UUID. This are all player which has received the same mail.<br>
	 * Return null, if the mail not exist.
	 * @param id
	 * @return ArrayList of UUID
	 */
	public ArrayList<UUID> getCarbonCopys(int id);
	
	/**
	 * Return the date which the mail was sended.<br>
	 * Return null, if the mail not exist.
	 * @param id
	 * @return Long as UNIX timestamp<br>null
	 */
	public Long getSendedDate(int id);
	
	/**
	 * Return the date which the mail war readed from the receiver.<br>
	 * Return null, if the mail not exist.
	 * @param id<
	 * @return Long as UNIX timestamp<br>null
	 */
	public Long getReadedDate(int id);
	
	/**
	 * Return the subject of this mail.<br>
	 * Return null, if the mail not exist.
	 * @param id
	 * @return String<br>null
	 */
	public String getSubject(int id);
	
	/**
	 * Return the raw message of the mail.<br>
	 * Return null, if the mail not exist.
	 * @param id
	 * @return String<br>null
	 */
	public String getRawMessage(int id);
	
	/**
	 * Return the parsed message of the mail.<br>
	 * Return null, if the mail not exist.
	 * @param id
	 * @return TextComponent<br>null
	 */
	public TextComponent getParsedMessage(int id);
}
