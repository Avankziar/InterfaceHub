package me.avankziar.ifh.spigot.event.inventory;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.Inventory;

/**
 * Event which is called after the inventory was updated.<br>
 * It can therefore not be canceled.
 */
public class InventoryPostUpdateEvent extends Event
{
	private static final HandlerList HANDLERS = new HandlerList();
	private Inventory inventory;
	
	public InventoryPostUpdateEvent(boolean isAsync, Inventory inventory)
	{
		super(isAsync);
		setInventory(inventory);
	}
	
	public HandlerList getHandlers() 
    {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() 
    {
        return HANDLERS;
    }

	public Inventory getInventory()
	{
		return inventory;
	}

	public void setInventory(Inventory inventory)
	{
		this.inventory = inventory;
	}
}