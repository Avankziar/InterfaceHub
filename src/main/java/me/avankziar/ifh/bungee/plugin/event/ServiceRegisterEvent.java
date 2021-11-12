package main.java.me.avankziar.ifh.bungee.plugin.event;

import javax.annotation.Nonnull;

import main.java.me.avankziar.ifh.bungee.plugin.RegisteredServiceProvider;

public class ServiceRegisterEvent extends ServiceEvent
{
	public ServiceRegisterEvent(@Nonnull RegisteredServiceProvider<?> registeredProvider)
	{
	    super(registeredProvider);
	}
}