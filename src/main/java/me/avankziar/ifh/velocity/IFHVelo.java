package main.java.me.avankziar.ifh.velocity;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.plugin.PluginDescription;
import com.velocitypowered.api.proxy.ProxyServer;

import main.java.me.avankziar.ifh.velocity.metric.Metrics;

@Plugin(id = "avankziar-interfacehub", name = "InterfaceHub", version = "2-0-0",
url = "https://www.spigotmc.org/resources/interfacehub.101648/", description = "A Vault-Like plugin. To let plugins communicate with plugins.",
authors = {"Avankziar"})
public class IFHVelo
{
	private static IFHVelo plugin;
    private final ProxyServer server;
    public Logger logger = null;
    public String pluginname = "InterfaceHub";
    private final Metrics.Factory metricsFactory;
    
    @Inject
    public IFHVelo(ProxyServer server, Logger logger, Metrics.Factory metricsFactory) 
    {
    	IFHVelo.plugin = this;
        this.server = server;
        this.logger = logger;
        this.metricsFactory = metricsFactory;
    }
    
    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) 
    {
    	PluginDescription pd = server.getPluginManager().getPlugin("avankziar-"+pluginname.toLowerCase()).get().getDescription();
        List<String> dependencies = new ArrayList<>();
        pd.getDependencies().stream().allMatch(x -> dependencies.add(x.toString()));
    	//https://patorjk.com/software/taag/#p=display&h=0&f=Big%20Money-ne&t=IFH
		logger.info("  /$$$$$$ /$$$$$$$$ /$$   /$$ | Id: "+pd.getId());
		logger.info(" |_  $$_/| $$_____/| $$  | $$ | Version: "+pd.getVersion().get());
		logger.info("   | $$  | $$      | $$  | $$ | Author: ["+String.join(", ", pd.getAuthors())+"]");
		logger.info("   | $$  | $$$$$   | $$$$$$$$ | Dependencies Plugins: ["+String.join(", ", dependencies)+"]");
		logger.info("   | $$  | $$__/   | $$__  $$ | Plugin Website:"+pd.getUrl().toString());
		logger.info("   | $$  | $$      | $$  | $$ | Description: "+(pd.getDescription().isPresent() ? pd.getDescription().get() : "/"));
		logger.info("  /$$$$$$| $$      | $$  | $$ | ");
		logger.info(" |______/|__/      |__/  |__/ | ");
        setupBstats();
    }
    
    public static IFHVelo getPlugin()
    {
    	return IFHVelo.plugin;
    }
    
    public ProxyServer getServer()
    {
    	return server;
    }
    
    public Logger getLogger()
    {
    	return logger;
    }
    
    public void setupBstats()
	{
    	int pluginId = 22446;
        metricsFactory.make(this, pluginId);
	}
}