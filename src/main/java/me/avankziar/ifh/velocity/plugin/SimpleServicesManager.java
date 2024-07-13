package me.avankziar.ifh.velocity.plugin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.velocitypowered.api.plugin.PluginContainer;

import me.avankziar.ifh.velocity.IFH;
import me.avankziar.ifh.velocity.plugin.event.ServiceRegisterEvent;
import me.avankziar.ifh.velocity.plugin.event.ServiceUnregisterEvent;

public class SimpleServicesManager implements ServicesManager
{
	private final Map<Class<?>, List<RegisteredServiceProvider<?>>> providers = new HashMap<>();
	  
	  public <T> void register(@Nonnull Class<T> service, @Nonnull T provider, @Nonnull PluginContainer plugin, @Nonnull ServicePriority priority) 
	  {
	    RegisteredServiceProvider<T> registeredProvider = null;
	    synchronized (this.providers) {
	      List<RegisteredServiceProvider<?>> registered = this.providers.get(service);
	      if (registered == null) {
	        registered = new ArrayList<>();
	        this.providers.put(service, registered);
	      } 
	      registeredProvider = new RegisteredServiceProvider<>(service, provider, priority, plugin);
		int position = Collections.binarySearch((List<RegisteredServiceProvider<?>>)registered, registeredProvider);
	      if (position < 0) {
	        registered.add(-(position + 1), registeredProvider);
	      } else {
	        registered.add(position, registeredProvider);
	      } 
	    }
	    IFH.getPlugin().getServer().getEventManager().fire(new ServiceRegisterEvent(registeredProvider)).thenAccept((event) -> {});
	  }
	  
	  public void unregisterAll(@Nonnull PluginContainer plugin) 
	  {
		  ArrayList<ServiceUnregisterEvent> unregisteredEvents = new ArrayList<>();
		  synchronized (this.providers) 
		  {
			  Iterator<Map.Entry<Class<?>, List<RegisteredServiceProvider<?>>>> it = this.providers.entrySet().iterator();
			  try {
				  while (it.hasNext()) 
				  {
					  Map.Entry<Class<?>, List<RegisteredServiceProvider<?>>> entry = it.next();
					  Iterator<RegisteredServiceProvider<?>> it2 = ((List<RegisteredServiceProvider<?>>)entry.getValue()).iterator();
					  try 
					  {
						  while (it2.hasNext()) 
						  {
							  RegisteredServiceProvider<?> registered = it2.next();
							  if (registered.getPlugin().equals(plugin)) 
							  {
								  it2.remove();
								  unregisteredEvents.add(new ServiceUnregisterEvent(registered));
							  } 
						  } 
					  } catch (NoSuchElementException noSuchElementException) {}
					  if (((List<?>)entry.getValue()).size() == 0)
						  it.remove(); 
				  } 
			  } catch (NoSuchElementException noSuchElementException) 
			  {}
		  } 
		  for (ServiceUnregisterEvent event : unregisteredEvents)
		  {
			  IFH.getPlugin().getServer().getEventManager().fire(event).thenAccept((e) -> {});
		  }
	  }
	  
	  public void unregister(@Nonnull Class<?> service, @Nonnull Object provider) 
	  {
	    ArrayList<ServiceUnregisterEvent> unregisteredEvents = new ArrayList<>();
	    synchronized (this.providers) {
	      Iterator<Map.Entry<Class<?>, List<RegisteredServiceProvider<?>>>> it = this.providers.entrySet().iterator();
	      try {
	        while (it.hasNext()) {
	          Map.Entry<Class<?>, List<RegisteredServiceProvider<?>>> entry = it.next();
	          if (entry.getKey() != service)
	            continue; 
	          Iterator<RegisteredServiceProvider<?>> it2 = ((List<RegisteredServiceProvider<?>>)entry.getValue()).iterator();
	          try {
	            while (it2.hasNext()) {
	              RegisteredServiceProvider<?> registered = it2.next();
	              if (registered.getProvider() == provider) {
	                it2.remove();
	                unregisteredEvents.add(new ServiceUnregisterEvent(registered));
	              } 
	            } 
	          } catch (NoSuchElementException noSuchElementException) {}
	          if (((List<?>)entry.getValue()).size() == 0)
	            it.remove(); 
	        } 
	      } catch (NoSuchElementException noSuchElementException) {}
	    } 
	    for (ServiceUnregisterEvent event : unregisteredEvents)
	    {
	    	IFH.getPlugin().getServer().getEventManager().fire(event).thenAccept((e) -> {});
	    }
	  }
	  
	  public void unregister(@Nonnull Object provider) {
	    ArrayList<ServiceUnregisterEvent> unregisteredEvents = new ArrayList<>();
	    synchronized (this.providers) {
	      Iterator<Map.Entry<Class<?>, List<RegisteredServiceProvider<?>>>> it = this.providers.entrySet().iterator();
	      try {
	        while (it.hasNext()) {
	          Map.Entry<Class<?>, List<RegisteredServiceProvider<?>>> entry = it.next();
	          Iterator<RegisteredServiceProvider<?>> it2 = ((List<RegisteredServiceProvider<?>>)entry.getValue()).iterator();
	          try {
	            while (it2.hasNext()) {
	              RegisteredServiceProvider<?> registered = it2.next();
	              if (registered.getProvider().equals(provider)) {
	                it2.remove();
	                unregisteredEvents.add(new ServiceUnregisterEvent(registered));
	              } 
	            } 
	          } catch (NoSuchElementException noSuchElementException) {}
	          if (((List<?>)entry.getValue()).size() == 0)
	            it.remove(); 
	        } 
	      } catch (NoSuchElementException noSuchElementException) {}
	    } 
	    for (ServiceUnregisterEvent event : unregisteredEvents)
	    {
	    	IFH.getPlugin().getServer().getEventManager().fire(event).thenAccept((e) -> {});
	    }
	  }
	  
	  
	@Nullable
	  public <T> T load(@Nonnull Class<T> service) 
	  {
	    synchronized (this.providers) {
	      List<RegisteredServiceProvider<?>> registered = this.providers.get(service);
	      if (registered == null)
	        return null; 
	      return service.cast(((RegisteredServiceProvider<?>)registered.get(0)).getProvider());
	    } 
	  }
	  
	@SuppressWarnings("unchecked")
	@Nullable
	  public <T> RegisteredServiceProvider<T> getRegistration(@Nonnull Class<T> service) {
	    synchronized (this.providers) {
	      List<RegisteredServiceProvider<?>> registered = this.providers.get(service);
	      if (registered == null || registered.isEmpty())
	      {
	    	  return null;
	      }
	      return (RegisteredServiceProvider<T>)registered.get(0);
	    } 
	  }
	  
	  @Nonnull
	  public List<RegisteredServiceProvider<?>> getRegistrations(@Nonnull PluginContainer plugin) {
	    ImmutableList.Builder<RegisteredServiceProvider<?>> ret = ImmutableList.builder();
	    synchronized (this.providers) {
	      for (List<RegisteredServiceProvider<?>> registered : this.providers.values()) {
	        for (RegisteredServiceProvider<?> provider : registered) {
	          if (provider.getPlugin().equals(plugin))
	            ret.add(provider); 
	        } 
	      } 
	    } 
	    return (List<RegisteredServiceProvider<?>>)ret.build();
	  }
	  
	  @SuppressWarnings("unchecked")
	@Nonnull
	  public <T> List<RegisteredServiceProvider<T>> getRegistrations(@Nonnull Class<T> service) 
	  {
	    ImmutableList.Builder<RegisteredServiceProvider<T>> ret;
	    synchronized (this.providers) {
	      List<RegisteredServiceProvider<?>> registered = this.providers.get(service);
	      if (registered == null)
	      {
	    	  return ImmutableList.of(); 
	      }
	       
	      ret = ImmutableList.builder();
	      for (RegisteredServiceProvider<?> provider : registered)
	      {
	    	  ret.add((RegisteredServiceProvider<T>) provider);
	      }
	    } 
	    return (List<RegisteredServiceProvider<T>>)ret.build();
	  }
	  
	  @Nonnull
	  public Set<Class<?>> getKnownServices() 
	  {
	    synchronized (this.providers) {
	      return (Set<Class<?>>)ImmutableSet.copyOf(this.providers.keySet());
	    } 
	  }
	  
	  public <T> boolean isProvidedFor(@Nonnull Class<T> service) 
	  {
	    synchronized (this.providers) {
	      return this.providers.containsKey(service);
	    } 
	  }
}