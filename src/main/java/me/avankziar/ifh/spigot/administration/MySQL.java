package main.java.me.avankziar.ifh.spigot.administration;

import java.sql.Connection;

public interface MySQL
{
	/**
	 * Return a predefine MySQL connection.
	 * @param pathName
	 * @return
	 */
	public Connection getConnection(String pathName);
	
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
