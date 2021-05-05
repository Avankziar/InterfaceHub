package main.java.me.avankziar.interfacehub.spigot.economy.account;

import java.util.UUID;

public class EconomyEntity
{
	public enum EconomyType
	{
		SERVER, ENTITY, PLAYER
	}
	
	private EconomyType type;
	private UUID playerUUID;
	private String playerName;
	private UUID entityUUID;
	private String entityName;
	private UUID serverEntityUUID;
	private String serverEntityName;
	
	private final String SERVERPREFIX = "#";
	private final String ENTITYPREFIX = "!";
	
	public EconomyEntity(EconomyType type, UUID uuid, String name)
	{
		setType(type);
		if(type == EconomyType.SERVER)
		{
			setServerEntityUUID(uuid);
			setServerEntityName(SERVERPREFIX+name);
		} else if(type == EconomyType.PLAYER)
		{
			setPlayerUUID(uuid);
			setPlayerName(name);
		} else
		{
			setEntityUUID(uuid);
			setEntityName(ENTITYPREFIX+name);
		}
	}
	
	/*
	 * To use, if the server or entity account ready to init.
	 */
	public EconomyEntity generateUUID()
	{
		if(this.type == EconomyType.PLAYER)
		{
			return this;
		}
		if(this.type == EconomyType.SERVER)
		{
			setServerEntityUUID(UUID.randomUUID());
		} else
		{
			setEntityUUID(UUID.randomUUID());
		}
		return this;
	}
	
	public UUID getUUID()
	{
		if(this.type == EconomyType.SERVER)
		{
			return getServerEntityUUID();
		} else if(this.type == EconomyType.PLAYER)
		{
			return getPlayerUUID();
		} else
		{
			return getEntityUUID();
		}
	}
	
	public String getName()
	{
		if(this.type == EconomyType.SERVER)
		{
			return getServerEntityName();
		} else if(this.type == EconomyType.PLAYER)
		{
			return getPlayerName();
		} else
		{
			return getEntityName();
		}
	}
	
	public void setName(String name)
	{
		if(this.type == EconomyType.SERVER)
		{
			setServerEntityName(name);
		} else if(this.type == EconomyType.PLAYER)
		{
			setPlayerName(name);
		} else
		{
			setEntityName(name);
		}
	}

	public EconomyType getType()
	{
		return type;
	}

	private void setType(EconomyType type)
	{
		this.type = type;
	}

	private UUID getPlayerUUID()
	{
		return playerUUID;
	}

	private void setPlayerUUID(UUID playerUUID)
	{
		this.playerUUID = playerUUID;
	}

	private String getPlayerName()
	{
		return playerName;
	}

	private void setPlayerName(String playerName)
	{
		this.playerName = playerName;
	}

	private UUID getEntityUUID()
	{
		return entityUUID;
	}

	private void setEntityUUID(UUID entityUUID)
	{
		this.entityUUID = entityUUID;
	}

	private String getEntityName()
	{
		return entityName;
	}

	private void setEntityName(String entityName)
	{
		this.entityName = entityName;
	}

	private UUID getServerEntityUUID()
	{
		return serverEntityUUID;
	}

	private void setServerEntityUUID(UUID serverEntityUUID)
	{
		this.serverEntityUUID = serverEntityUUID;
	}

	private String getServerEntityName()
	{
		return serverEntityName;
	}

	private void setServerEntityName(String serverEntityName)
	{
		this.serverEntityName = serverEntityName;
	}
}
