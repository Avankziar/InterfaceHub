package main.java.me.avankziar.ifh.velocity.event.misc;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Nullable;

import com.velocitypowered.api.event.ResultedEvent;
import com.velocitypowered.api.event.ResultedEvent.GenericResult;

public class ConditionQueryOutputEvent implements ResultedEvent<GenericResult>
{
	protected GenericResult result = GenericResult.allowed(); // Allowed by default
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

	@Override
	public void setResult(GenericResult result) 
	{
		this.result = Objects.requireNonNull(result);
	}

	@Override
	public GenericResult getResult()
	{
		return this.result;
	}
}