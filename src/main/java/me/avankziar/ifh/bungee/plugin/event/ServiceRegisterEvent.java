package me.avankziar.ifh.bungee.plugin.event;

import javax.annotation.Nonnull;

import me.avankziar.ifh.bungee.plugin.RegisteredServiceProvider;

public class ServiceRegisterEvent extends ServiceEvent
{
	public ServiceRegisterEvent(@Nonnull RegisteredServiceProvider<?> registeredProvider)
	{
	    super(registeredProvider);
	}
}