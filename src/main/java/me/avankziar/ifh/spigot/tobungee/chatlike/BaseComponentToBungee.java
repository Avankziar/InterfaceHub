package me.avankziar.ifh.spigot.tobungee.chatlike;

import java.util.ArrayList;
import java.util.UUID;

import org.bukkit.Sound;

import me.avankziar.ifh.general.assistance.ChatApiOld;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;

public interface BaseComponentToBungee
{
	/**
	 * Sends messages consisting of BaseComponents to BungeeCord. An SubArrayList is a separate message.
	 * <br>A <b>BaseComponent</b> can be also a <b>TextComponent</b>.
	 * <br>Only to this uuid.
	 * @param uuid
	 * @param message
	 */
	void sendMessage(UUID uuid, ArrayList<ArrayList<BaseComponent>> message);
	
	/**
	 * Sends messages consisting of BaseComponents to BungeeCord. An SubArrayList is a separate message.
	 * <br>A <b>BaseComponent</b> can be also a <b>TextComponent</b>.
	 * <br>Only to this uuid. The sound is sended back to the spigot server, where the player is located.
	 * <br>The sound is played at the player location with 3.0F and 0.5F.
	 * @param uuid
	 * @param sound
	 * @param message
	 */
	void sendMessage(UUID uuid, Sound sound, ArrayList<ArrayList<BaseComponent>> message);
	
	/**
	 * Sends messages consisting of BaseComponents to BungeeCord. An SubArrayList is a separate message.
	 * <br>A <b>BaseComponent</b> can be also a <b>TextComponent</b>.
	 * @param uuid
	 * @param message
	 */
	void sendMessage(ArrayList<UUID> uuid, ArrayList<ArrayList<BaseComponent>> message);
	
	/**
	 * Sends messages consisting of BaseComponents to BungeeCord. An SubArrayList is a separate message.
	 * <br>A <b>BaseComponent</b> can be also a <b>TextComponent</b>.
	 * <br>Only to the uuids in the list. The sound is sended back to the spigot server, where the players are located.
	 * <br>The sound is played at the player location with 3.0F and 0.5F.
	 * @param uuid
	 * @param sound
	 * @param message
	 */
	void sendMessage(ArrayList<UUID> uuid, Sound sound, ArrayList<ArrayList<BaseComponent>> message);
	
	/**
	 * Sends messages consisting of BaseComponents to BungeeCord. An SubArrayList is a separate message.
	 * <br>A <b>BaseComponent</b> can be also a <b>TextComponent</b>.
	 * <br>If hasPermission is false, will check if the player hasnt the Permission. True for normal check.
	 * @param uuid
	 * @param permission
	 * @param hasPermission
	 * @param message
	 */
	void sendMessage(ArrayList<UUID> uuid, String permission, boolean hasPermission, ArrayList<ArrayList<BaseComponent>> message);
	
	/**
	 * Sends messages consisting of BaseComponents to BungeeCord. An SubArrayList is a separate message.
	 * <br>A <b>BaseComponent</b> can be also a <b>TextComponent</b>.
	 * <br>If hasPermission is false, will check if the player hasnt the Permission. True for normal check.
	 * <br>Only to the uuids in the list. The sound is sended back to the spigot server, where the players are located.
	 * <br>The sound is played at the player location with 3.0F and 0.5F.
	 * @param uuid
	 * @param permission
	 * @param hasPermission
	 * @param sound
	 * @param message
	 */
	void sendMessage(ArrayList<UUID> uuid, String permission, boolean hasPermission, Sound sound, ArrayList<ArrayList<BaseComponent>> message);

	/**
	 * Sends messages consisting of BaseComponents to BungeeCord. An SubArrayList is a separate message.
	 * <br>A <b>BaseComponent</b> can be also a <b>TextComponent</b>.
	 * @param message
	 */
	void sendMessage(ArrayList<ArrayList<BaseComponent>> message);
	
	/**
	 * Sends messages consisting of BaseComponents to BungeeCord. An SubArrayList is a separate message.
	 * <br>A <b>BaseComponent</b> can be also a <b>TextComponent</b>.
	 * @param sound
	 * @param message
	 */
	void sendMessage(Sound sound, ArrayList<ArrayList<BaseComponent>> message);
	
	/**
	 * Sends messages consisting of BaseComponents to BungeeCord. An SubArrayList is a separate message.
	 * <br>A <b>BaseComponent</b> can be also a <b>TextComponent</b>.
	 * <br>If hasPermission is false, will check if the player hasnt the Permission. True for normal check.
	 * <br>The sound is played at the player location with 3.0F and 0.5F.
	 * @param permission
	 * @param hasPermission
	 * @param message
	 */
	void sendMessage(String permission, boolean hasPermission, ArrayList<ArrayList<BaseComponent>> message);
	
	/**
	 * Sends messages consisting of BaseComponents to BungeeCord. An SubArrayList is a separate message.
	 * <br>A <b>BaseComponent</b> can be also a <b>TextComponent</b>.
	 * <br>If hasPermission is false, will check if the player hasnt the Permission. True for normal check.
	 * <br>The sound is played at the player location with 3.0F and 0.5F.
	 * @param permission
	 * @param hasPermission
	 * @param sound
	 * @param message
	 */
	void sendMessage(String permission, boolean hasPermission, Sound sound, ArrayList<ArrayList<BaseComponent>> message);
	
	public class BaseComponentBuilder
	{
		private ArrayList<ArrayList<BaseComponent>> message = new ArrayList<>();
		
		public BaseComponentBuilder add(int index, String msg)
		{
			if(message.size() >= index+1)
			{
				ArrayList<BaseComponent> bc = message.get(index);
				bc.add(ChatApiOld.apiChat(msg, null, null, null, null));
				message.set(index, bc);
			} else
			{
				ArrayList<BaseComponent> bc = new ArrayList<>();
				bc.add(ChatApiOld.apiChat(msg, null, null, null, null));
				message.add(bc);
			}
			return this;
		}
		
		public BaseComponentBuilder add(int index, String msg,
				ClickEvent.Action click, String clicktext)
		{
			if(message.size() >= index+1)
			{
				ArrayList<BaseComponent> bc = message.get(index);
				bc.add(ChatApiOld.apiChat(msg, click, clicktext, null, null));
				message.set(index, bc);
			} else
			{
				ArrayList<BaseComponent> bc = new ArrayList<>();
				bc.add(ChatApiOld.apiChat(msg, click, clicktext, null, null));
				message.add(bc);
			}
			return this;
		}
		
		public BaseComponentBuilder add(int index, String msg,
				HoverEvent.Action hover, String... hovertext)
		{
			if(message.size() >= index+1)
			{
				ArrayList<BaseComponent> bc = message.get(index);
				String ht = "";
				for(int i = 0; i < hovertext.length; i++)
				{
					if(i+1 >= hovertext.length)
					{
						ht += hovertext[i];
					} else
					{
						ht += hovertext[i]+"~!~";
					}
				}
				bc.add(ChatApiOld.apiChat(msg, null, null, hover, ht));
				message.set(index, bc);
			} else
			{
				ArrayList<BaseComponent> bc = new ArrayList<>();
				String ht = "";
				for(int i = 0; i < hovertext.length; i++)
				{
					if(i+1 >= hovertext.length)
					{
						ht += hovertext[i];
					} else
					{
						ht += hovertext[i]+"~!~";
					}
				}
				bc.add(ChatApiOld.apiChat(msg, null, null, hover, ht));
				message.add(bc);
			}
			return this;
		}
		
		/**
		 * Add or set the message with the events in the array.
		 * @param index
		 * @param msg
		 * @param click
		 * @param clicktext
		 * @param hover
		 * @param hovertext
		 * @return object itself
		 */
		public BaseComponentBuilder add(int index, String msg,
				ClickEvent.Action click, String clicktext, 
				HoverEvent.Action hover, String... hovertext)
		{
			if(message.size() >= index+1)
			{
				ArrayList<BaseComponent> bc = message.get(index);
				String ht = "";
				for(int i = 0; i < hovertext.length; i++)
				{
					if(i+1 >= hovertext.length)
					{
						ht += hovertext[i];
					} else
					{
						ht += hovertext[i]+"~!~";
					}
				}
				bc.add(ChatApiOld.apiChat(msg, click, clicktext, hover, ht));
				message.set(index, bc);
			} else
			{
				ArrayList<BaseComponent> bc = new ArrayList<>();
				String ht = "";
				for(int i = 0; i < hovertext.length; i++)
				{
					if(i+1 >= hovertext.length)
					{
						ht += hovertext[i];
					} else
					{
						ht += hovertext[i]+"~!~";
					}
				}
				bc.add(ChatApiOld.apiChat(msg, click, clicktext, hover, ht));
				message.add(bc);
			}
			return this;
		}
		
		public ArrayList<ArrayList<BaseComponent>> build()
		{
			return this.message;
		}
	}
}
