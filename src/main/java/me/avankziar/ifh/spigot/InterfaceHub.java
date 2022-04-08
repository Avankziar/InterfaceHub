package main.java.me.avankziar.ifh.spigot;

import java.util.concurrent.Callable;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import main.java.me.avankziar.ifh.general.interfaces.PlayerTimes;
import main.java.me.avankziar.ifh.spigot.metrics.Metrics;

public class InterfaceHub extends JavaPlugin
{
	private static InterfaceHub plugin;
	public static Logger log;
	public static String pluginName = "InterfaceHub";
	
	public void onEnable()
	{
		plugin = this;
		log = getLogger();
		
		//https://patorjk.com/software/taag/#p=display&h=0&f=Big%20Money-ne&t=IFH
		log.info("  /$$$$$$ /$$$$$$$$ /$$   /$$ | API-Version: "+plugin.getDescription().getAPIVersion());
		log.info(" |_  $$_/| $$_____/| $$  | $$ | Author: "+plugin.getDescription().getAuthors().toString());
		log.info("   | $$  | $$      | $$  | $$ | Plugin Website: "+plugin.getDescription().getWebsite());
		log.info("   | $$  | $$$$$   | $$$$$$$$ | Depend Plugins: "+plugin.getDescription().getDepend().toString());
		log.info("   | $$  | $$__/   | $$__  $$ | SoftDepend Plugins: "+plugin.getDescription().getSoftDepend().toString());
		log.info("   | $$  | $$      | $$  | $$ | LoadBefore: "+plugin.getDescription().getLoadBefore().toString());
		log.info("  /$$$$$$| $$      | $$  | $$ | ");
		log.info(" |______/|__/      |__/  |__/ | ");
		
		setupBstats();
	}
	
	public void onDisable()
	{
		Bukkit.getScheduler().cancelTasks(this);
		HandlerList.unregisterAll(this);		
		log.info(pluginName + " is disabled!");
	}
	
	public static InterfaceHub getPlugin()
	{
		return plugin;
	}
	
	public void setupBstats()
	{
		int pluginId = 10912;
        Metrics metrics = new Metrics(this, pluginId);
        findCustomData(metrics);
	}
	
	private void findCustomData(Metrics metrics)
	{
		RegisteredServiceProvider<PlayerTimes> rspPTimes = Bukkit.getServer().getServicesManager().getRegistration(PlayerTimes.class);
		PlayerTimes ptimes = null;
        if (rspPTimes != null) {
            ptimes = rspPTimes.getProvider();
        }
        final String ptimesName = ptimes != null ? ptimes.getName() : "No PlayerTimes";
        metrics.addCustomChart(new Metrics.SimplePie("playertimes", new Callable<String>() 
        {
            @Override
            public String call() 
            {
                return ptimesName;
            }
        }));
	}
}