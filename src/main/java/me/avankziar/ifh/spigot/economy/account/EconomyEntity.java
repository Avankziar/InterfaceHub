package main.java.me.avankziar.ifh.spigot.economy.account;

import java.util.UUID;

public class EconomyEntity
{
	public enum EconomyType
	{
		SERVER, ENTITY, PLAYER
	}
	
	private EconomyType type;
	private UUID uuid;
	private String name;
	
	public EconomyEntity(EconomyType type, UUID uuid, String name)
	{
		setType(type);
		setUUID(uuid);
		setName(name);
	}
	
	@Override
	public String toString()
	{
		String s = "EconomyEntity{Type="+this.type.toString()+",uuid="+this.uuid+",name="+this.name+"}";
		return s;
	}
	
	public static EconomyEntity fromString(String data)
	{
		String[] first = data.split("{");
		String[] second = first[1].split(",");
		String type = second[0].split("=")[1];
		String uuid = second[1].split("=")[1];
		String name = second[2].split("=")[1];
		return new EconomyEntity(EconomyType.valueOf(type), UUID.fromString(uuid), name);
	}
	
	/*
	 * To use, if the server or entity account ready to init.
	 */
	public EconomyEntity generateUUID()
	{
		if(this.type == EconomyType.PLAYER)
		{
			return this;
		} else
		{
			setUUID(UUID.randomUUID());
		}
		return this;
	}
	
	public UUID getUUID()
	{
		return this.uuid;
	}
	
	public EconomyEntity setUUID(UUID uuid)
	{
		this.uuid = uuid;
		return this;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public EconomyEntity setName(String name)
	{
		this.name = name;
		return this;
	}

	public EconomyType getType()
	{
		return type;
	}

	private EconomyEntity setType(EconomyType type)
	{
		this.type = type;
		return this;
	}
}
