package main.java.me.avankziar.ifh.general.bonusmalus;

/**
 * Defines how the calucaltion in the multiplication part is set.<br>
 * If ADDITION: x = (baseValue + SUM(additionValues))*(1 + SUM(multiplicationValues))<br>
 * If MULTIPLICATION: x = (baseValue + SUM(additionValues))*(MUL(multiplicationValues))<br>
 */
public enum MultiplicationCalculationType
{
	ADDITION, MULTIPLICATION;
}