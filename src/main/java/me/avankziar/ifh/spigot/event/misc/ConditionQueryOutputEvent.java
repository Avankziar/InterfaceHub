package main.java.me.avankziar.ifh.spigot.event.misc;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

import javax.annotation.Nullable;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ConditionQueryOutputEvent extends Event
{
	private static final HandlerList HANDLERS = new HandlerList();
	private UUID involvedUUID;
	private UUID involvedSecondUUID;
	private String targetPlugin;
	private List<String> outputList;
	
	public ConditionQueryOutputEvent(boolean isAsync, @Nullable UUID involvedUUID, @Nullable UUID involvedSecondUUID,
			String targetPlugin, List<String> outputList)
	{
		super(isAsync);
		this.involvedUUID = involvedUUID;
		this.involvedSecondUUID = involvedSecondUUID;
		this.targetPlugin = targetPlugin;
		this.outputList = Collections.unmodifiableList(outputList);
	}
	
	public HandlerList getHandlers() 
    {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() 
    {
        return HANDLERS;
    }

	public UUID getInvolvedUUID()
	{
		return involvedUUID;
	}
	
	public UUID getInvolvedSecondUUID()
	{
		return involvedSecondUUID;
	}

	public String getTargetPlugin()
	{
		return targetPlugin;
	}

	public List<String> getOutputList()
	{
		return outputList;
	}
}