package me.avankziar.ifh.bungee.plugin.event;

import javax.annotation.Nonnull;

import me.avankziar.ifh.bungee.plugin.RegisteredServiceProvider;
import net.md_5.bungee.api.plugin.Event;

public abstract class ServiceEvent extends Event
{
	private final RegisteredServiceProvider<?> provider;
	
	public ServiceEvent(@Nonnull RegisteredServiceProvider<?> provider) 
	{
		this.provider = provider;
	}
	
	@Nonnull
	public RegisteredServiceProvider<?> getProvider() 
	{
		return this.provider;
	}
}