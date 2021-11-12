package main.java.me.avankziar.interfacehub.bungee.plugin.event;

import javax.annotation.Nonnull;

import main.java.me.avankziar.interfacehub.bungee.plugin.RegisteredServiceProvider;

public class ServiceUnregisterEvent extends ServiceEvent
{
	  public ServiceUnregisterEvent(@Nonnull RegisteredServiceProvider<?> serviceProvider) {
	    super(serviceProvider);
	  }
}