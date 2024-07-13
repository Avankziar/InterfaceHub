package me.avankziar.ifh.velocity.plugin.event;

import javax.annotation.Nonnull;

import me.avankziar.ifh.velocity.plugin.RegisteredServiceProvider;

public class ServiceUnregisterEvent extends ServiceEvent
{
	public ServiceUnregisterEvent(@Nonnull RegisteredServiceProvider<?> serviceProvider) 
	{
		super(serviceProvider);
	}
}