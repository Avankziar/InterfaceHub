package main.java.me.avankziar.interfacehub.spigot.economy.currency;

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
	 * 1 Dollar are xxx at the Base?
	 * The Base were Cent so 100 Cent are 1 Dollar.
	 */
	private double valueToBaseGradation;
	
	public Gradation(){}
	
	public Gradation(String plural, String singular, double valueToBaseGradation)
	{
		setPlural(plural);
		setSingular(singular);
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
				"singular='"+this.singular+"',"+
				"plural='"+this.plural+"',"+
				"valueToBaseGradation='"+this.valueToBaseGradation+"'}";
	}
}