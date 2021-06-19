package main.java.me.avankziar.interfacehub.bungee.plugin.event;

import javax.annotation.Nonnull;

import main.java.me.avankziar.interfacehub.bungee.plugin.RegisteredServiceProvider;

public abstract class ServiceEvent extends ServerEvent
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