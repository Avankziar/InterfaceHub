package main.java.me.avankziar.interfacehub.bungee;

import java.util.logging.Logger;

import main.java.me.avankziar.interfacehub.bungee.plugin.SimpleServicesManager;
import net.md_5.bungee.api.plugin.Plugin;

public class InterfaceHub extends Plugin
{
	public static InterfaceHub plugin;
	public static Logger log;
	private SimpleServicesManager ssm;

	public void onEnable()
	{
		plugin = this;
		log = getLogger();
		
		//https://patorjk.com/software/taag/#p=display&h=0&f=Big%20Money-ne&t=IFH
		log.info("  /$$$$$$ /$$$$$$$$ /$$   /$$ | API-Version: "+plugin.getDescription().getVersion());
		log.info(" |_  $$_/| $$_____/| $$  | $$ | Author: "+plugin.getDescription().getAuthor());
		log.info("   | $$  | $$      | $$  | $$ | Plugin Website: ");
		log.info("   | $$  | $$$$$   | $$$$$$$$ | Depend Plugins: "+plugin.getDescription().getDepends().toString());
		log.info("   | $$  | $$__/   | $$__  $$ | SoftDepend Plugins: "+plugin.getDescription().getSoftDepends().toString());
		log.info("   | $$  | $$      | $$  | $$ | ");
		log.info("  /$$$$$$| $$      | $$  | $$ | ");
		log.info(" |______/|__/      |__/  |__/ | ");
		
		ssm = new SimpleServicesManager();
	}
	

	public SimpleServicesManager getServicesManager()
	{
		return ssm;
	}
}
