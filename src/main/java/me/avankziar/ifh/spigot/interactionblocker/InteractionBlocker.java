package main.java.me.avankziar.ifh.spigot.interactionblocker;

import org.bukkit.entity.Player;

public interface InteractionBlocker
{
	/**
	 * Block all Interaction for the player for the ticks amount.<br>
	 * 20 ticks = 1 second.<br> 
	 * But have in mind, that the implementing plugin look not every tick after the interactionblocker!
	 * @param player
	 * @param ticks
	 */
	void blockInteraction(Player player, long ticks);
	
	/**
	 * Block the specific Interaction for the player for the ticks amount.<br>
	 * 20 ticks = 1 second.<br> 
	 * But have in mind, that the implementing plugin look not every tick after the interactionblocker!
	 * @param player
	 * @param ticks
	 * @param interactionBlockerType
	 */
	void blockInteraction(Player player, long ticks, InteractionBlockerType interactionBlockerType);
	
	void deblockInteraction(Player player);
	
	void deblockInteraction(Player player, InteractionBlockerType interactionBlockerTyp);
}