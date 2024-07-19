package me.avankziar.ifh.velocity.administration;

public interface Administration
{
	/**
	 * Return a String as ISO639_2b in a 3 character.
	 * <br>F.E. ENG-English, GER-German
	 * @return
	 */
	public String getLanguage();
	
	/**
	 * Return true, if the Mysql with specific path is active.
	 * @param pathName
	 * @return
	 */
	public boolean isMysqlPathActive(String pathName);
	
	/**
	 * Return a host. The pathName define which of the possible host are returned.
	 * @param pathName
	 * @return
	 */
	public String getHost(String pathName);
	
	/**
	 * Return a port. The pathName define which of the possible port are returned.
	 * @param pathName
	 * @return
	 */
	public int getPort(String pathName);
	
	/**
	 * Return a database. The pathName define which of the possible database are returned.
	 * @param pathName
	 * @return
	 */
	public String getDatabase(String pathName);
	
	/**
	 * Return a user. The pathName define which of the possible user are returned.
	 * @param pathName
	 * @return
	 */
	public String getUsername(String pathName);
	
	/**
	 * Return a password. The pathName define which of the possible password are returned.
	 * @param pathName
	 * @return
	 */
	public String getPassword(String pathName);
	
	/**
	 * Return is autoReconnect. The pathName define which of the possible is autoReconnect are returned.
	 * @param pathName
	 * @return
	 */
	public boolean isAutoReconnect(String pathName);
	
	/**
	 * Return is VerifyServerCertificate. The pathName define which of the possible isVerifyServerCertificate are returned.
	 * @param pathName
	 * @return
	 */
	public boolean isVerifyServerCertificate(String pathName);
	
	/**
	 * Return if use SSL. The pathName define which of the possible use SSL are returned.
	 * @param pathName
	 * @return
	 */
	public boolean useSSL(String pathName);
	
	/**
	 * Return a is RequireSSL. The pathName define which of the possible is RequireSSL are returned.
	 * @param pathName
	 * @return
	 */
	public boolean isRequireSSL(String pathName);
}
