package main.java.me.avankziar.ifh.general.chat;

import java.util.UUID;

/**
 * The ChatEditor is a function to keep players away from the actual chat,
 * that ingame chat input can be used for administrative things. 
 * @author Avankziar
 */
public interface ChatEditor
{
	/**
	 * Return the pluginname, which provided this.<br>
	 * For example: SimpleChatChannels... etc.<br>
	 * @return String
	 */
	public String getProvider();
	
	/**
	 * Add the playeruuid on the chateditorlist, withMessage == true, if a Message should be displayed. 
	 * Return true if he has added, false if he already added on the list or if the player is not online.
	 * @param uuid
	 * @param withMessage
	 * @return a boolean
	 */
	public boolean addOnEditor(UUID uuid, boolean withMessage);
	
	/**
	 * Remove the uuid from the chateditorlist, withMessage == true, if a Message should be displayed.
	 * Return true if was removed, return false if the player was on the list.
	 * @param uuid
	 * @param withMessage
	 * @return
	 */
	public boolean removeFromEditor(UUID uuid, boolean withMessage);
}
