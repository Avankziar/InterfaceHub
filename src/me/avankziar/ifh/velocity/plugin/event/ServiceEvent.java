package me.avankziar.ifh.velocity.plugin.event;

import java.util.Objects;

import javax.annotation.Nonnull;

import com.velocitypowered.api.event.ResultedEvent;
import com.velocitypowered.api.event.ResultedEvent.GenericResult;

import me.avankziar.ifh.velocity.plugin.RegisteredServiceProvider;

public abstract class ServiceEvent implements ResultedEvent<GenericResult>
{
	private final RegisteredServiceProvider<?> provider;
	protected GenericResult result = GenericResult.allowed(); // Allowed by default
	
	public ServiceEvent(@Nonnull RegisteredServiceProvider<?> provider) 
	{
		this.provider = provider;
	}
	
	@Nonnull
	public RegisteredServiceProvider<?> getProvider() 
	{
		return this.provider;
	}

	@Override
	public void setResult(GenericResult result) 
	{
		this.result = Objects.requireNonNull(result);
	}
	
	@Override
	public GenericResult getResult()
	{
		return result;
	}
}