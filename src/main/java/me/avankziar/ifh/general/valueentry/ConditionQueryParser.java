package main.java.me.avankziar.ifh.general.valueentry;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;

import javax.annotation.Nullable;

public interface ConditionQueryParser
{
	/**
	 * Evaluates a string and returns a boolean.<br>
	 * F.e.:<br>
	 * - "true:==:false" return false<br>
	 * - "10:==:10" return true<br>
	 * - "11.0:==:5.0" return false<br>
	 * - "true:!=:false" return true<br>
	 * - "10:!=:10" return false<br>
	 * - "11.0:!=:5.0" return true<br>
	 * Possible Operatoren for booleans are "==" and "!=".<br>
	 * Possible Operatoren for integer, long, float and double are "==", "!=", ">", "<", ">=", "<=".<br>
	 * Possible Operatoren for Strings are "eq"(equals), "neq"(not equals), "eqic"(equalsIgnoreCase), "neqic"(not equalsIgnoreCase)
	 * "cont"(contains), "ncont"(not contains), "contic"(containsIgnoreCase), "ncontic"(not containsIgnoreCase)
	 * @param conditionQuery
	 * @return
	 */
	public boolean parseBaseConditionQuery(String conditionQuery);
	
	/**
	 * Parse a condition query and if it is true it return true.<br>
	 * F.e.:<br>
	 * (a && b || c)<br>
	 * (a && b && c)<br>
	 * (d || e) && f<br>
	 * All chars are replaced with variable if if exists.
	 * @param conditionQuery
	 * @param variables
	 * @return
	 */
	public Boolean parseSimpleConditionQuery(String conditionQuery, LinkedHashMap<String, Boolean> variables);
	
	/**
	 * The method to pull everything directly from a list. (For example, from a config file).<br> 
	 * It must be declared as follows(without Headings):<br><br>
	 * <b>ConditionQuery:</b><br>
	 * if:(a && b || c):abc_def.ddd<br>
	 * elseif:(a && b && c) || d:abc_def.eee<br>
	 * else:(d || e) && f):abc_def.fff<br>
	 * The last part is a output variable.<br><br>
	 * <b>Outputlist:</b><br>
	 * output:outputnamehere:cmd:/warp p<br>
	 * output:outputnamehere:spigotcmd:/warp p<br>
	 * output:outputnamehere:bungeecmd:/warp p<br>
	 * event:pluginname        >> Output as Event with the pluginname<br>
	 * <b>Variable:</b><br>
	 * xyz:true            /true;false<br>
	 * xyz:10:>:5          />;<;>=;!=;==<br>
	 * xyz:Evan:eq:Todd    /eq;eqic;neq<br>
	 * xyz:[var]:...:...<br>
	 * [var] are check in the ConditionEntry and if the conditionname are "fooo_fo", than if will be writen "[fooo_fo]".<br>
	 * Only ":" are NOT permitted.<br>
	 * @param uuid is the involved PlayerUUID
	 * @param uuidTwo is the second involved PlayerUUID.
	 * @param conditionQuery_Vars_Output_List
	 * @return the outputlist if reached, else null.
	 */
	public ArrayList<String> parseBranchedConditionQuery(
			@Nullable UUID uuid, @Nullable UUID uuidTwo,
			ArrayList<String> conditionQuery_Vars_Output_List);
	
	/**
	 * This method is used when the individual lists are available separately.<br> 
	 * It must be declared as follows:<br><br>
	 * <b>ConditionQuery:</b><br>
	 * if:(a && b || c):abc_def.ddd<br>
	 * elseif:(a && b && c) || d:abc_def.eee<br>
	 * else:(d || e) && f):abc_def.fff<br>
	 * The last part is a output variable.<br><br>
	 * <b>Outputlist:</b><br>
	 * cmd:/warp p<br>
	 * spigotcmd:/warp p<br>
	 * bungeecmd:/warp p<br>
	 * event:fooo_fooo (A specific and individual name is the best to go)<br>
	 * <b>Variable:</b><br>
	 * xyz:true            /true;false<br>
	 * xyz:10:>:5          />;<;>=;!=;==<br>
	 * xyz:Evan:eq:Todd    /eq;eqic;neq<br>
	 * xyz:var=...:...:...<br>
	 * [var] are check in the ConditionEntry and if the conditionname are "fooo_fo", than if will be writen "[fooo_fo]".<br>
	 * Only ":" are NOT permitted.<br>
	 * @param uuid
	 * @param uuidTwo
	 * @param conditionQueryList
	 * @param variables
	 * @param outputOptions
	 * @return The outputlist
	 */
	public ArrayList<String> parseBranchedConditionQuery(@Nullable UUID uuid, @Nullable UUID uuidTwo, 
			ArrayList<String> conditionQueryList,
			LinkedHashMap<String, String> variables,
			LinkedHashMap<String, ArrayList<String>> outputOptions,
			boolean asEvent, String pluginnameForPossibleEvent);
}