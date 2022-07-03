package main.java.me.avankziar.ifh.spigot.position;

public class ServerLocation
{
	private String servername;
	private String worldname;
	private double x;
	private double y;
	private double z;
	private float yaw;
	private float pitch;
	
	public ServerLocation(String servername, String worldName, double x, double y, double z, float yaw, float pitch)
	{
		setServername(servername);
		setWorldname(worldName);
		setX(x);
		setY(y);
		setZ(z);
		setYaw(yaw);
		setPitch(pitch);
	}
	
	public ServerLocation(String servername, String worldName, double x, double y, double z)
	{
		setServername(servername);
		setWorldname(worldName);
		setX(x);
		setY(y);
		setZ(z);
		setYaw(0.0F);
		setPitch(0.0F);
	}
	
	@Override
	public String toString()
	{
		return servername+";"+worldname+"; "
				+String.valueOf(x)+" : "+String.valueOf(y)+" : "+String.valueOf(z)+" : "
				+String.valueOf(yaw)+" : "+String.valueOf(pitch);
	}

	public String getServername()
	{
		return servername;
	}

	public void setServername(String server)
	{
		this.servername = server;
	}

	public String getWorldname()
	{
		return worldname;
	}

	public void setWorldname(String worldname)
	{
		this.worldname = worldname;
	}

	public double getX()
	{
		return x;
	}

	public void setX(double x)
	{
		this.x = x;
	}

	public double getY()
	{
		return y;
	}

	public void setY(double y)
	{
		this.y = y;
	}

	public double getZ()
	{
		return z;
	}

	public void setZ(double z)
	{
		this.z = z;
	}

	public float getYaw()
	{
		return yaw;
	}

	public void setYaw(float yaw)
	{
		this.yaw = yaw;
	}

	public float getPitch()
	{
		return pitch;
	}

	public void setPitch(float pitch)
	{
		this.pitch = pitch;
	}

}