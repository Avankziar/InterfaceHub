package main.java.me.avankziar.ifh.spigot.economy.currency;

public enum SIPrefix
{
	YOTTA("Y", 24),
	ZETTA("Z", 21),
	EXA("E", 18),
	PETA("P", 15),
	TERA("T", 12),
	GIGA("G", 9),
	MEGA("M", 6),
	KILO("k", 3),
	HECTO("h", 2),
	DECA("da", 1),
	DECI("d", -1),
	CENTI("c", -2),
	MILLI("m", -3),
	MICRO("μ", -6),
	NANO("n", -9),
	PICO("p", -12),
	FEMTO("f", -15),
	ATTO("a", -18),
	ZEPTO("z", -21),
	YOCTO("y", -24);
	
	SIPrefix(String symbol, int exponent)
	{
		this.symbol = symbol;
		this.exponent = exponent;
		this.decimal = Math.pow(10, exponent);
	}
	
	private final String symbol;
	private final int exponent;
	private final double decimal;
	
	public String getSymbol()
	{
		return this.symbol;
	}
	
	public int getExponent()
	{
		return this.exponent;
	}
	
	public double getDecimal()
	{
		return this.decimal;
	}
}
