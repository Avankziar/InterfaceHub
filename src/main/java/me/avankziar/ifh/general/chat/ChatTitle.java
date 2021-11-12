package main.java.me.avankziar.interfacehub.general.chat;

/**
 * The chattitle are pre- and suffix which most are placed before and after the playername.
 * They can have hover or click events, permissions etc.
 * @author Avankziar
 *
 */
public interface ChatTitle
{
	/**
	 * Return the pluginname, which provided this.<br>
	 * For example: SimpleChatChannels... etc.<br>
	 * @return String
	 */
	public String getProvider();
	
	/**
	 * Return true, if the ChatTitle a prefix is. False if the ChatTitle a suffix is.<br>
	 * Return null, if the ChatTitle dont exist.
	 * @param chatTitle
	 * @return Boolean<br>null
	 */
	public Boolean isPrefix(String chatTitle);
	
	/**
	 * Return the ingame inchat format of the ChatTitle.<br>
	 * Return null, if the ChatTitle dont exist.
	 * @param chatTitle
	 * @return String<br>null
	 */
	public String getInChatName(String chatTitle);
	
	/**
	 * Return the ingame inchat color code of the ChatTitle. It can be in '&x' and in hex '&#xxxxxx'.<br>
	 * Return null, if the ChatTitle dont exist.
	 * @param chatTitle
	 * @return String<br>null
	 */
	public String getInChatColor(String chatTitle);
	
	/**
	 * Return the value of the clickevent of the ChatTitle.<br>
	 * Return null, if the ChatTitle dont exist.
	 * @param chatTitle
	 * @return String<br>null
	 */
	public String getClickEvent(String chatTitle);
	
	/**
	 * Return the value of the hoverevent of the ChatTitle.<br>
	 * Return null, if the ChatTitle dont exist.
	 * @param chatTitle
	 * @return String<br>null
	 */
	public String getHoverEvent(String chatTitle);
	
	/**
	 * Return the permission of the ChatTitle.<br>
	 * Return null, if the ChatTitle dont exist.
	 * @param chatTitle
	 * @return String<br>null
	 */
	public String getPermission(String chatTitle);
	
	/**
	 * Return the weight of the ChatTitle.<br>
	 * Return null, if the ChatTitle dont exist.
	 * @param chatTitle
	 * @return Integer<br>null
	 */
	public Integer getWeight();
}
