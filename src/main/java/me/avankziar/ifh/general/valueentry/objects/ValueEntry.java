package main.java.me.avankziar.ifh.general.valueentry.objects;

import java.util.UUID;

import main.java.me.avankziar.ifh.general.valueentry.ValueType;

public class ValueEntry
{
	private UUID uuid;
	private String valueLableName;
	private String value;
	private ValueType type;
	private String internReason;
	private String displayReason;
	private String server;
	private String world;
	private long duration;

	public ValueEntry() {}
	
	public ValueEntry(UUID uuid, String valueLableName,
			String value, ValueType type,
			String internReason, String displayReason, String server, String world, long duration)
	{
		setUUID(uuid);
		setValueLableName(valueLableName);
		setValue(value);
		setType(type);
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

	public String getValueLableName()
	{
		return valueLableName;
	}

	public void setValueLableName(String valueLableName)
	{
		this.valueLableName = valueLableName;
	}

	public String getValue()
	{
		return value;
	}

	public void setValue(String value)
	{
		this.value = value;
	}

	public ValueType getType()
	{
		return type;
	}

	public void setType(ValueType type)
	{
		this.type = type;
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
}