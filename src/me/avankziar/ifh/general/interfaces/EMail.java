package me.avankziar.ifh.general.interfaces;

import java.util.UUID;

public interface EMail
{
	/**
	 * Send a e-mail to the receiver.<br>
	 * Better called async.
	 * @param receiver
	 * @param sender
	 * @param subject
	 * @param message
	 */
	public void sendEMail(UUID receiver, String sender, String subject, String message);
	
	/**
	 * Send all player a e-mail.<br>
	 * Total process is called async.
	 * @param sender
	 * @param subject
	 * @param message
	 */
	public void sendAllEMail(String sender, String subject, String message);
}