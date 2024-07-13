package me.avankziar.ifh.spigot.interactionblocker;

public enum InteractionBlockerType
{
	CMD,
	BLOCK_BREAK,
	BLOCK_PLACE,
	BLOCK_INTERACT, //Means Chest/Furnace/ect. to open.
	ENTITY_INTERACT,
	ENTITY_KILL,
	INVENTORY, //To Drop something or to make change to the playerinventory
}
