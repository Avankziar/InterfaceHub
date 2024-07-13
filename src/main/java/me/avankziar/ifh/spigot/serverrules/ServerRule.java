package me.avankziar.ifh.spigot.serverrules;

import java.util.ArrayList;

public class ServerRule
{
	private String number;
	private String ruleName;
	private ArrayList<String> lines;
	
	public ServerRule(String number, String ruleName, ArrayList<String> lines)
	{
		setNumber(number);
		setRuleName(ruleName);
		if(lines == null || lines.isEmpty())
		{
			setLines(new ArrayList<String>());
		} else
		{
			setLines(lines);
		}
	}

	public String getNumber()
	{
		return number;
	}

	public void setNumber(String number)
	{
		this.number = number;
	}

	public String getRuleName()
	{
		return ruleName;
	}

	public void setRuleName(String ruleName)
	{
		this.ruleName = ruleName;
	}

	public ArrayList<String> getLines()
	{
		return lines;
	}

	public void setLines(ArrayList<String> lines)
	{
		this.lines = lines;
	}

}
