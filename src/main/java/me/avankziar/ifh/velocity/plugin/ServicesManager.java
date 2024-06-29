package main.java.me.avankziar.ifh.velocity.plugin;

import java.util.Collection;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.velocitypowered.api.plugin.Plugin;

public interface ServicesManager
{
	<T> void register(@Nonnull Class<T> paramClass, @Nonnull T paramT, @Nonnull Plugin paramPlugin, @Nonnull ServicePriority paramServicePriority);
	  
	void unregisterAll(@Nonnull Plugin paramPlugin);
	  
	void unregister(@Nonnull Class<?> paramClass, @Nonnull Object paramObject);
	
	void unregister(@Nonnull Object paramObject);
	 
	@Nullable
	<T> T load(@Nonnull Class<T> paramClass);
	  
	@Nullable
	<T> RegisteredServiceProvider<T> getRegistration(@Nonnull Class<T> paramClass);
	  
	@Nonnull
	List<RegisteredServiceProvider<?>> getRegistrations(@Nonnull Plugin paramPlugin);
	  
	@Nonnull
	<T> Collection<RegisteredServiceProvider<T>> getRegistrations(@Nonnull Class<T> paramClass);
	  
	@Nonnull
	Collection<Class<?>> getKnownServices();
	  
	<T> boolean isProvidedFor(@Nonnull Class<T> paramClass);
}
