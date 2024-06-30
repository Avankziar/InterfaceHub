package main.java.me.avankziar.ifh.velocity.plugin;

import javax.annotation.Nonnull;

import com.velocitypowered.api.plugin.PluginContainer;

public class RegisteredServiceProvider<T> implements Comparable<RegisteredServiceProvider<?>>
{

	 private Class<T> service;
	  
	  private PluginContainer plugin;
	  
	  private T provider;
	  
	  private ServicePriority priority;
	  
	  public RegisteredServiceProvider(@Nonnull Class<T> service, @Nonnull T provider, @Nonnull ServicePriority priority,
			  @Nonnull PluginContainer plugin) {
	    this.service = service;
	    this.plugin = plugin;
	    this.provider = provider;
	    this.priority = priority;
	  }
	  
	  @Nonnull
	  public Class<T> getService() {
	    return this.service;
	  }
	  
	  @Nonnull
	  public PluginContainer getPlugin() {
	    return this.plugin;
	  }
	  
	  @Nonnull
	  public T getProvider() {
	    return this.provider;
	  }
	  
	  @Nonnull
	  public ServicePriority getPriority() {
	    return this.priority;
	  }
	  
	  public int compareTo(@Nonnull RegisteredServiceProvider<?> other) 
	  {
	    if (this.priority.ordinal() == other.getPriority().ordinal())
	      return 0; 
	    return (this.priority.ordinal() < other.getPriority().ordinal()) ? 1 : -1;
	  }
}