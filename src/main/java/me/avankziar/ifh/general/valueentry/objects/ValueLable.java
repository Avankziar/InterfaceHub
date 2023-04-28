package main.java.me.avankziar.ifh.general.valueentry.objects;

import java.util.ArrayList;
import java.util.Arrays;

public class ValueLable
{

	private String internName;
	private String displayName;
	private ArrayList<String> explanation;	
	
	public ValueLable(){}
	
	public ValueLable(String internName, String displayName, String[] explanation)
	{
		setInternName(internName);
		setDisplayName(displayName);
		setExplanation(new ArrayList<>(Arrays.asList(explanation)));
	}

	public String getInternName()
	{
		return internName;
	}

	public void setInternName(String internName)
	{
		this.internName = internName;
	}

	public String getDisplayName()
	{
		return displayName;
	}

	public void setDisplayName(String displayName)
	{
		this.displayName = displayName;
	}

	public ArrayList<String> getExplanation()
	{
		return explanation;
	}

	public void setExplanation(ArrayList<String> explanation)
	{
		this.explanation = explanation;
	}

}
