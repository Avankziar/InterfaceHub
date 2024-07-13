package me.avankziar.ifh.velocity.plugin.event;

import javax.annotation.Nonnull;

import me.avankziar.ifh.velocity.plugin.RegisteredServiceProvider;

public class ServiceRegisterEvent extends ServiceEvent
{
	public ServiceRegisterEvent(@Nonnull RegisteredServiceProvider<?> registeredProvider)
	{
	    super(registeredProvider);
	}
}