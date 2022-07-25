package main.java.me.avankziar.ifh.spigot.administration;

import java.sql.Connection;

public interface Administration
{
	/**
	 * Return a String as ISO639_2b in a 3 character.
	 * <br>F.E. ENG-English, GER-German
	 * @return
	 */
	public String getLanguage();
	
	public String getSpigotServerName();
	
	public String getHost(String pathName);
	
	public int getPort(String pathName);
	
	public String getDatabase(String pathName);
	
	public String getUsername(String pathName);
	
	public String getPassword(String pathName);
	
	public boolean isAutoReconnect(String pathName);
	
	public boolean isVerifyServerCertificate(String pathName);
	
	public boolean useSSL(String pathName);
	
	public boolean isRequireSSL(String pathName);
}
