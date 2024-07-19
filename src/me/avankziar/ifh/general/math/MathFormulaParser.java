package me.avankziar.ifh.general.math;

import java.util.HashMap;
import java.util.Map.Entry;

import me.avankziar.ifh.general.math.javaluator.DoubleEvaluator;
import me.avankziar.ifh.general.math.javaluator.StaticVariableSet;

public class MathFormulaParser
{
	public double parse(String formula)
	{
		return new DoubleEvaluator().evaluate(formula);
	}
	
	public double parse(String formula, HashMap<String, Double> variables)
	{
		StaticVariableSet<Double> vars = new StaticVariableSet<Double>();
		for(Entry<String, Double> v : variables.entrySet())
		{
			vars.set(v.getKey(), v.getValue());
		}
		return new DoubleEvaluator().evaluate(formula, vars);
	}
}
