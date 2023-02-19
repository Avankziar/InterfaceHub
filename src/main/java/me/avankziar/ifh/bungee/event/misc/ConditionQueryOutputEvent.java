package main.java.me.avankziar.ifh.bungee.event.misc;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

import javax.annotation.Nullable;

import net.md_5.bungee.api.plugin.Event;

public class ConditionQueryOutputEvent extends Event
{
	private UUID involvedUUID;
	private UUID involvedSecondUUID;
	private String targetPlugin;
	private List<String> outputList;
	
	public ConditionQueryOutputEvent(@Nullable UUID involvedUUID, @Nullable UUID involvedSecondUUID, 
			String targetPlugin, List<String> outputList)
	{
		this.involvedUUID = involvedUUID;
		this.involvedSecondUUID = involvedSecondUUID;
		this.targetPlugin = targetPlugin;
		this.outputList = Collections.unmodifiableList(outputList);
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