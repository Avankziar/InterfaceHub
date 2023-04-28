package main.java.me.avankziar.ifh.general.modifier.objects;

import java.util.UUID;

import main.java.me.avankziar.ifh.general.modifier.ModifierType;

public class Modifier
{
	private UUID uuid;
	/**
	 * Name of the linked modification.
	 */
	private String modificationName;
	private ModifierType type;
	private double value;
	private String internReason;
	private String displayReason;
	private String server;
	private String world;
	/**
	 * If duration == -1, the modifer is permanent.
	 */
	private long duration;
	
	public Modifier(){}
	
	public Modifier(UUID uuid, String bonusMalusName, ModifierType type,
			double value, String internReason, String displayReason, String server, String world, long duration)
	{
		setUUID(uuid);
		setModificationName(bonusMalusName);
		setType(type);
		setValue(value);
		setInternReason(internReason);
		setDisplayReason(displayReason);
		setServer(server);
		setWorld(world);
		setDuration(duration);
	}

	public UUID getUUID()
	{
		return uuid;
	}

	public void setUUID(UUID uuid)
	{
		this.uuid = uuid;
	}

	public String getModificationName()
	{
		return modificationName;
	}

	public void setModificationName(String modificationName)
	{
		this.modificationName = modificationName;
	}

	public ModifierType getType()
	{
		return type;
	}

	public void setType(ModifierType type)
	{
		this.type = type;
	}

	public double getValue()
	{
		return value;
	}

	public void setValue(double value)
	{
		this.value = value;
	}

	public String getInternReason()
	{
		return internReason;
	}

	public void setInternReason(String internReason)
	{
		this.internReason = internReason;
	}

	public String getDisplayReason()
	{
		return displayReason;
	}

	public void setDisplayReason(String displayReason)
	{
		this.displayReason = displayReason;
	}

	public String getServer()
	{
		return server;
	}

	public void setServer(String server)
	{
		this.server = server;
	}

	public String getWorld()
	{
		return world;
	}

	public void setWorld(String world)
	{
		this.world = world;
	}

	public long getDuration()
	{
		return duration;
	}

	public void setDuration(long duration)
	{
		this.duration = duration;
	}
	
	public Modifier getModifier()
	{
		return this;
	}
}