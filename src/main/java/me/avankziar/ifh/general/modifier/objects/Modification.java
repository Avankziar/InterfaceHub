package main.java.me.avankziar.ifh.general.modifier.objects;

import java.util.ArrayList;
import java.util.Arrays;

import main.java.me.avankziar.ifh.general.modifier.ModificationType;

public class Modification
{
	/**
	 * The intern name for the modification.
	 */
	private String internName;
	/**
	 * The displayname of the modification.
	 */
	private String displayName;
	private ModificationType type;
	/**
	 * A list of text for a ingame description. It explains the modification.
	 */
	private ArrayList<String> explanation;
	
	public Modification(){}
	
	public Modification(String internName, String displayName,
			ModificationType type, String[] explanation)
	{
		setInternName(internName);
		setDisplayName(displayName);
		setType(type);
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

	public ModificationType getType()
	{
		return type;
	}

	public void setType(ModificationType type)
	{
		this.type = type;
	}

	public ArrayList<String> getExplanation()
	{
		return explanation;
	}

	public void setExplanation(ArrayList<String> explanation)
	{
		this.explanation = explanation;
	}
	
	public Modification getModification()
	{
		return this;
	}
}