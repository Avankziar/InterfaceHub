package me.avankziar.ifh.velocity.economy.currency;

public class Gradation
{	
	/**
	 * The plural from this gradation. F.e. "Dollars".
	 */
	private String plural;
	
	/**
	 * The singular from this gradation. F.e. "Dollar".
	 */
	private String singular;
	
	/**
	 * The symbol for this gradation. F.e. "$". for Dollar
	 */
	private String symbol;
	
	/**
	 * 1 Dollar are xxx at the Base?
	 * The Base were Cent so 100 Cent are 1 Dollar.
	 */
	private double valueToBaseGradation;
	
	public Gradation(){}
	
	public Gradation(String plural, String singular, String symbol, double valueToBaseGradation)
	{
		setPlural(plural);
		setSingular(singular);
		setSymbol(symbol);
		setValueToBaseGradation(valueToBaseGradation);
	}

	public String getPlural()
	{
		return plural;
	}

	public Gradation setPlural(String plural)
	{
		this.plural = plural;
		return this;
	}

	public String getSingular()
	{
		return singular;
	}

	public Gradation setSingular(String singular)
	{
		this.singular = singular;
		return this;
	}

	/**
	 * @return the symbol
	 */
	public String getSymbol()
	{
		return symbol;
	}

	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol)
	{
		this.symbol = symbol;
	}

	public double getValueToBaseGradation()
	{
		return valueToBaseGradation;
	}

	public Gradation setValueToBaseGradation(double valueToBaseGradation)
	{
		this.valueToBaseGradation = valueToBaseGradation;
		return this;
	}
	
	@Override
	public String toString()
	{
		return "Gradation{"+
				"singular="+this.singular+","+
				"plural="+this.plural+","+
				"symbol="+this.symbol+
				"valueToBaseGradation="+this.valueToBaseGradation+"}";
	}
}