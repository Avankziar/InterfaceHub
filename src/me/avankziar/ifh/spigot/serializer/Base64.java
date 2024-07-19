package me.avankziar.ifh.spigot.serializer;

public interface Base64
{
	public String toBase64(Object object);
    
    public Object fromBase64(String data);
    
    public String toBase64Array(Object[] objects);
    
    public Object[] fromBase64Array(String data);
}