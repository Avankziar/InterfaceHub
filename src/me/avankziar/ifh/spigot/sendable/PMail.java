package me.avankziar.ifh.spigot.sendable;

import java.util.UUID;

public interface PMail
{
	/**
	 * Send a p-mail to the receiver.
	 * @param receiver
	 * @param sender
	 * @param subject
	 * @param message
	 */
	public void sendPMail(UUID receiver, String sender, String subject, String message);
	
	/**
	 * Send a p-mail to all players.<br>
	 * Will be processed async.
	 * @param sender
	 * @param subject
	 * @param message
	 */
	public void sendAllPMail(String sender, String subject, String message);
}