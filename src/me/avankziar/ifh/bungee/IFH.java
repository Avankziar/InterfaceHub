package me.avankziar.ifh.bungee;

import java.util.logging.Logger;

import me.avankziar.ifh.bungee.metric.Metrics;
import me.avankziar.ifh.bungee.plugin.SimpleServicesManager;
import net.md_5.bungee.api.plugin.Plugin;

public class IFH extends Plugin
{
	private static IFH plugin;
	private Logger logger;
	private SimpleServicesManager ssm;

	public void onEnable()
	{
		plugin = this;
		logger = plugin.getProxy().getLogger();
		
		//https://patorjk.com/software/taag/#p=display&h=0&f=Big%20Money-ne&t=IFH
		logger.info("  /$$$$$$ /$$$$$$$$ /$$   /$$ | API-Version: "+plugin.getDescription().getVersion());
		logger.info(" |_  $$_/| $$_____/| $$  | $$ | Author: "+plugin.getDescription().getAuthor());
		logger.info("   | $$  | $$      | $$  | $$ | Plugin Website: ");
		logger.info("   | $$  | $$$$$   | $$$$$$$$ | Depend Plugins: "+plugin.getDescription().getDepends().toString());
		logger.info("   | $$  | $$__/   | $$__  $$ | SoftDepend Plugins: "+plugin.getDescription().getSoftDepends().toString());
		logger.info("   | $$  | $$      | $$  | $$ | ");
		logger.info("  /$$$$$$| $$      | $$  | $$ | ");
		logger.info(" |______/|__/      |__/  |__/ | ");
		
		ssm = new SimpleServicesManager();
		setupBstats();
	}
	
	public static IFH getPlugin()
	{
		return plugin;
	}
	
	public Logger getLogger()
	{
		return logger;
	}
	
	public SimpleServicesManager getServicesManager()
	{
		return ssm;
	}
	
	public void setupBstats()
	{
		int pluginId = 22445;
        new Metrics(this, pluginId);
	}
}
