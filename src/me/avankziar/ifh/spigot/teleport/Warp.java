package me.avankziar.ifh.spigot.teleport;

import java.util.List;
import java.util.UUID;

import javax.annotation.Nullable;

import org.bukkit.entity.Player;

import me.avankziar.ifh.spigot.position.ServerLocation;

public interface Warp
{
	/**
	 * Return a List of String of the warp names
	 * @param owner
	 * @return
	 */
	public List<String> getWarps(@Nullable UUID owner);
	
	/**
	 * Return the serverlocation of the Warp, if warp exist.
	 * @param warpname
	 * @return
	 */
	@Nullable
	public ServerLocation getLocation(String warpname);
	
	/**
	 * Return a boolean if the warp is hidden.
	 * @param warpname
	 * @return
	 */
	@Nullable
	public boolean isHidden(String warpname);
	
	/**
	 * Return the owner if one exist.<br>
	 * Or null if the owner not exist or if the warp not exists.
	 * @param warpname
	 * @return
	 */
	@Nullable
	public UUID getOwner(String warpname);
	
	/**
	 * Return the permission of the warp.
	 * @param warpname
	 * @return
	 */
	@Nullable
	public String getPermission(String warpname);
	
	/**
	 * Return the password of the warp.
	 * @param warpname
	 * @return
	 */
	@Nullable
	public String getPassword(String warpname);
	
	/**
	 * Return a List of player which are members of the warp.
	 * @param warpname
	 * @return
	 */
	public List<UUID> getMembers(String warpname);
	
	/**
	 * Return the price of the warp, if a player would teleport to it.
	 * @param warpname
	 * @return
	 */
	@Nullable
	public double getPrice(String warpname);
	
	/**
	 * Return the Blacklist of player of the warp.
	 * @param warpname
	 * @return
	 */
	public List<UUID> getBlacklist(String warpname);
	
	/**
	 * Return the category of the warp.
	 * @param warpname
	 * @return
	 */
	@Nullable
	public String getCategory(String warpname);
	
	/**
	 * Return the portalaccess of the warp.<br>
	 * Possible Value are: ONLY, IRRELEVANT, FORBIDDEN
	 * @param warpname
	 * @return
	 */
	@Nullable
	public String getPortalAccess(String warpname);
	
	/**
	 * Return how the command should be executing.<br>
	 * Possible Value are: PLAYER, CONSOLE
	 * @param warpname
	 * @return
	 */
	@Nullable
	public String getPostTeleportExecuterCommand(String warpname);
	
	/**
	 * Return the Command to execute after the teleport to the warp.
	 * @param warpname
	 * @return
	 */
	@Nullable
	public String getPostTeleportExecutingCommand(String warpname);
	
	/**
	 * Send the player to the warp.<br>
	 * Return false, if a error is show up or the player has no right to go, if for example<br>
	 * the internal security measures activated.<br>
	 * Boolean costsApplied can charge the player with money but ONLY if costs arise at all.
	 * @param player
	 * @param warpname
	 * @param ignoreInteralSecurityMeasures
	 * @param sendErrorMessageToPlayer
	 * @param costsApplied
	 * @return
	 */
	public boolean teleportToWarp(Player player, String warpname,
			boolean ignoreInteralSecurityMeasures, boolean sendErrorMessageToPlayer, boolean costsApplied);
}