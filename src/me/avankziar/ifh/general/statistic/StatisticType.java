package me.avankziar.ifh.general.statistic;

import java.util.HashSet;

import org.bukkit.Statistic;

public class StatisticType 
{
	private static HashSet<StatisticType> statisticTypes = new HashSet<>();
	
	public static final StatisticType DAMAGE_DEALT = registerStatisticType("DAMAGE_DEALT");
	public static final StatisticType DAMAGE_TAKEN = registerStatisticType("DAMAGE_TAKEN");
	public static final StatisticType DEATHS = registerStatisticType("DEATHS");
	public static final StatisticType MOB_KILLS = registerStatisticType("MOB_KILLS");
	public static final StatisticType PLAYER_KILLS = registerStatisticType("PLAYER_KILLS");
	public static final StatisticType FISH_CAUGHT = registerStatisticType("FISH_CAUGHT");
	public static final StatisticType ANIMALS_BRED = registerStatisticType("ANIMALS_BRED");
    //public static final StatisticType LEAVE_GAME See LOGIN
	public static final StatisticType JUMP = registerStatisticType("JUMP");
	public static final StatisticType DROP_COUNT = registerStatisticType("DROP_COUNT");
	public static final StatisticType DROP = registerStatisticType("DROP");
	public static final StatisticType PICKUP = registerStatisticType("PICKUP");
    //public static final StatisticType TOTAL_WORLD_TIME, //Only a Single Player thing
    //public static final StatisticType WALK_ON_WATER_ONE_CM Not reachable, will be WALK_ONE_CM
	//public static final StatisticType FALL_ONE_CM Not reachable
    //public static final StatisticType WALK_UNDER_WATER_ONE_CM Not reachable, will be WALK_ONE_CM
	public static final StatisticType MINE_BLOCK = registerStatisticType("MINE_BLOCK");
	public static final StatisticType USE_ITEM = registerStatisticType("USE_ITEM");
    public static final StatisticType BREAK_ITEM = registerStatisticType("BREAK_ITEM");
    public static final StatisticType CRAFT_ITEM = registerStatisticType("CRAFT_ITEM");
    public static final StatisticType KILL_ENTITY = registerStatisticType("KILL_ENTITY");
    public static final StatisticType ENTITY_KILLED_BY = registerStatisticType("ENTITY_KILLED_BY");
    //public static final StatisticType TIME_SINCE_DEATH
    public static final StatisticType TALKED_TO_VILLAGER = registerStatisticType("TALKED_TO_VILLAGER");
    public static final StatisticType TRADED_WITH_VILLAGER = registerStatisticType("TRADED_WITH_VILLAGER");
    public static final StatisticType CAKE_SLICES_EATEN = registerStatisticType("CAKE_SLICES_EATEN");
    public static final StatisticType CAULDRON_FILLED = registerStatisticType("CAULDRON_FILLED");
    public static final StatisticType CAULDRON_USED = registerStatisticType("CAULDRON_USED");
    public static final StatisticType ARMOR_CLEANED = registerStatisticType("ARMOR_CLEANED");
    public static final StatisticType BANNER_CLEANED = registerStatisticType("BANNER_CLEANED");
    public static final StatisticType BREWINGSTAND_INTERACTION = registerStatisticType("BREWINGSTAND_INTERACTION");
    public static final StatisticType BEACON_INTERACTION = registerStatisticType("BEACON_INTERACTION");
    public static final StatisticType DROPPER_INSPECTED = registerStatisticType("DROPPER_INSPECTED");
    public static final StatisticType HOPPER_INSPECTED = registerStatisticType("HOPPER_INSPECTED");
    public static final StatisticType DISPENSER_INSPECTED = registerStatisticType("DISPENSER_INSPECTED");
    public static final StatisticType NOTEBLOCK_PLAYED = registerStatisticType("NOTEBLOCK_PLAYED");
    public static final StatisticType NOTEBLOCK_TUNED = registerStatisticType("NOTEBLOCK_TUNED");
    public static final StatisticType FLOWER_POTTED = registerStatisticType("FLOWER_POTTED");
    public static final StatisticType TRAPPED_CHEST_TRIGGERED = registerStatisticType("TRAPPED_CHEST_TRIGGERED");
    public static final StatisticType ENDERCHEST_OPENED = registerStatisticType("ENDERCHEST_OPENED");
    public static final StatisticType ITEM_ENCHANTED = registerStatisticType("ITEM_ENCHANTED");
    public static final StatisticType RECORD_PLAYED = registerStatisticType("RECORD_PLAYED");
    public static final StatisticType FURNACE_INTERACTION = registerStatisticType("FURNACE_INTERACTION");
    public static final StatisticType CRAFTING_TABLE_INTERACTION = registerStatisticType("CRAFTING_TABLE_INTERACTION");
    public static final StatisticType CHEST_OPENED = registerStatisticType("CHEST_OPENED");
    public static final StatisticType SLEEP_IN_BED = registerStatisticType("SLEEP_IN_BED");
    public static final StatisticType SHULKER_BOX_OPENED = registerStatisticType("SHULKER_BOX_OPENED");
    //public static final StatisticType TIME_SINCE_REST
    public static final StatisticType DAMAGE_DEALT_ABSORBED = registerStatisticType("DAMAGE_DEALT_ABSORBED");
    public static final StatisticType DAMAGE_DEALT_RESISTED = registerStatisticType("DAMAGE_DEALT_RESISTED");
    public static final StatisticType DAMAGE_BLOCKED_BY_SHIELD = registerStatisticType("DAMAGE_BLOCKED_BY_SHIELD");
    public static final StatisticType DAMAGE_ABSORBED = registerStatisticType("DAMAGE_ABSORBED");
    public static final StatisticType DAMAGE_RESISTED = registerStatisticType("DAMAGE_RESISTED");
    public static final StatisticType CLEAN_SHULKER_BOX = registerStatisticType("CLEAN_SHULKER_BOX");
    public static final StatisticType OPEN_BARREL = registerStatisticType("OPEN_BARREL");
    public static final StatisticType INTERACT_WITH_BLAST_FURNACE = registerStatisticType("INTERACT_WITH_BLAST_FURNACE");
    public static final StatisticType INTERACT_WITH_SMOKER = registerStatisticType("INTERACT_WITH_SMOKER");
    public static final StatisticType INTERACT_WITH_LECTERN = registerStatisticType("INTERACT_WITH_LECTERN");
    public static final StatisticType INTERACT_WITH_CAMPFIRE = registerStatisticType("INTERACT_WITH_CAMPFIRE");
    public static final StatisticType INTERACT_WITH_CARTOGRAPHY_TABLE = registerStatisticType("INTERACT_WITH_CARTOGRAPHY_TABLE");
    public static final StatisticType INTERACT_WITH_LOOM = registerStatisticType("INTERACT_WITH_LOOM");
    public static final StatisticType INTERACT_WITH_STONECUTTER = registerStatisticType("INTERACT_WITH_STONECUTTER");
    public static final StatisticType BELL_RING = registerStatisticType("BELL_RING");
    public static final StatisticType RAID_TRIGGER = registerStatisticType("RAID_TRIGGER");
    public static final StatisticType RAID_WIN = registerStatisticType("RAID_WIN");
    public static final StatisticType INTERACT_WITH_ANVIL = registerStatisticType("INTERACT_WITH_ANVIL");
    public static final StatisticType INTERACT_WITH_GRINDSTONE = registerStatisticType("TARGET_HIT");
    public static final StatisticType TARGET_HIT = registerStatisticType("TARGET_HIT");
    public static final StatisticType INTERACT_WITH_SMITHING_TABLE = registerStatisticType("INTERACT_WITH_SMITHING_TABLE");
    
    //Must be counted by PlayerMoveEvent
    public static final StatisticType WALK_ONE_CM = registerStatisticType("WALK_ONE_CM");
    public static final StatisticType MINECART_ONE_CM = registerStatisticType("MINECART_ONE_CM");
	public static final StatisticType BOAT_ONE_CM = registerStatisticType("BOAT_ONE_CM");
	public static final StatisticType PIG_ONE_CM = registerStatisticType("PIG_ONE_CM");
	public static final StatisticType HORSE_ONE_CM = registerStatisticType("HORSE_ONE_CM");
	public static final StatisticType SPRINT_ONE_CM = registerStatisticType("SPRINT_ONE_CM");
	public static final StatisticType CROUCH_ONE_CM = registerStatisticType("CROUCH_ONE_CM");
	public static final StatisticType AVIATE_ONE_CM = registerStatisticType("AVIATE_ONE_CM");
    public static final StatisticType SNEAK_TIME = registerStatisticType("SNEAK_TIME");
	public static final StatisticType CLIMB_ONE_CM = registerStatisticType("CLIMB_ONE_CM");
	public static final StatisticType FLY_ONE_CM = registerStatisticType("FLY_ONE_CM");
    public static final StatisticType SWIM_ONE_CM = registerStatisticType("SWIM_ONE_CM");
    public static final StatisticType STRIDER_ONE_CM = registerStatisticType("STRIDER_ONE_CM");
    
    //Custom StatisticTypes which are not included in Bukkit Statistic.
    public static final StatisticType LOGIN = registerStatisticType("LOGIN");
    public static final StatisticType VOTE = registerStatisticType("VOTE");
    public static final StatisticType AFK_ONE_MINUTE = registerStatisticType("AFK_ONE_MINUTE");
    public static final StatisticType PLAY_ONE_MINUTE = registerStatisticType("PLAY_ONE_MINUTE");
    public static final StatisticType TOTAL_ONLINE_ONE_MINUTE = registerStatisticType("TOTAL_ONLINE_ONE_MINUTE");
    public static final StatisticType CRAWLING_ONE_CM = registerStatisticType("CRAWLING_ONE_CM");
	
	private String uniquename;
	private StatisticType(String uniquename)
	{
		this.uniquename = uniquename;
	}
	
	public static StatisticType registerStatisticType(String uniquename)
	{
		StatisticType st = new StatisticType(uniquename);
		return statisticTypes.add(st) ? st : null;
	}
	
	public static StatisticType valueOf(String name)
	{
		for(StatisticType st : statisticTypes)
		{
			if(st.toString().equals(name))
			{
				return st;
			}
		}
		return null;
	}
	
	public String toString()
	{
		return this.uniquename;
	}
	
	public static StatisticType getStatisticType(Statistic statistic)
	{
		switch(statistic)
		{
		case LEAVE_GAME:
		case TOTAL_WORLD_TIME:
		case WALK_ON_WATER_ONE_CM:
		case WALK_UNDER_WATER_ONE_CM:
		case TIME_SINCE_DEATH:
		case TIME_SINCE_REST:
			return null;
		default:
			return StatisticType.valueOf(statistic.toString());
		}
	}
}