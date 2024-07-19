package me.avankziar.ifh.bungee.plugin.event;

import javax.annotation.Nonnull;

import me.avankziar.ifh.bungee.plugin.RegisteredServiceProvider;

public class ServiceUnregisterEvent extends ServiceEvent
{
	  public ServiceUnregisterEvent(@Nonnull RegisteredServiceProvider<?> serviceProvider) {
	    super(serviceProvider);
	  }
}