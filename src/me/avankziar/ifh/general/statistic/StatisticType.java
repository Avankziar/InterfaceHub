package me.avankziar.ifh.general.statistic;

import java.util.HashSet;

import org.bukkit.Statistic;

public class StatisticType 
{
	public static final StatisticType DAMAGE_DEALT = new StatisticType("DAMAGE_DEALT");
	public static final StatisticType DAMAGE_TAKEN = new StatisticType("DAMAGE_TAKEN");
	public static final StatisticType DEATHS = new StatisticType("DEATHS");
	public static final StatisticType MOB_KILLS = new StatisticType("MOB_KILLS");
	public static final StatisticType PLAYER_KILLS = new StatisticType("PLAYER_KILLS");
	public static final StatisticType FISH_CAUGHT = new StatisticType("FISH_CAUGHT");
	public static final StatisticType ANIMALS_BRED = new StatisticType("ANIMALS_BRED");
    //public static final StatisticType LEAVE_GAME See LOGIN
	public static final StatisticType JUMP = new StatisticType("JUMP");
	public static final StatisticType DROP_COUNT = new StatisticType("DROP_COUNT");
	public static final StatisticType DROP = new StatisticType("DROP");
	public static final StatisticType PICKUP = new StatisticType("PICKUP");
    //public static final StatisticType TOTAL_WORLD_TIME, //Only a Single Player thing
    //public static final StatisticType WALK_ON_WATER_ONE_CM Not reachable, will be WALK_ONE_CM
	//public static final StatisticType FALL_ONE_CM Not reachable
    //public static final StatisticType WALK_UNDER_WATER_ONE_CM Not reachable, will be WALK_ONE_CM
	public static final StatisticType MINE_BLOCK = new StatisticType("MINE_BLOCK");
	public static final StatisticType USE_ITEM = new StatisticType("USE_ITEM");
    public static final StatisticType BREAK_ITEM = new StatisticType("BREAK_ITEM");
    public static final StatisticType CRAFT_ITEM = new StatisticType("CRAFT_ITEM");
    public static final StatisticType KILL_ENTITY = new StatisticType("KILL_ENTITY");
    public static final StatisticType ENTITY_KILLED_BY = new StatisticType("ENTITY_KILLED_BY");
    //public static final StatisticType TIME_SINCE_DEATH
    public static final StatisticType TALKED_TO_VILLAGER = new StatisticType("TALKED_TO_VILLAGER");
    public static final StatisticType TRADED_WITH_VILLAGER = new StatisticType("TRADED_WITH_VILLAGER");
    public static final StatisticType CAKE_SLICES_EATEN = new StatisticType("CAKE_SLICES_EATEN");
    public static final StatisticType CAULDRON_FILLED = new StatisticType("CAULDRON_FILLED");
    public static final StatisticType CAULDRON_USED = new StatisticType("CAULDRON_USED");
    public static final StatisticType ARMOR_CLEANED = new StatisticType("ARMOR_CLEANED");
    public static final StatisticType BANNER_CLEANED = new StatisticType("BANNER_CLEANED");
    public static final StatisticType BREWINGSTAND_INTERACTION = new StatisticType("BREWINGSTAND_INTERACTION");
    public static final StatisticType BEACON_INTERACTION = new StatisticType("BEACON_INTERACTION");
    public static final StatisticType DROPPER_INSPECTED = new StatisticType("DROPPER_INSPECTED");
    public static final StatisticType HOPPER_INSPECTED = new StatisticType("HOPPER_INSPECTED");
    public static final StatisticType DISPENSER_INSPECTED = new StatisticType("DISPENSER_INSPECTED");
    public static final StatisticType NOTEBLOCK_PLAYED = new StatisticType("NOTEBLOCK_PLAYED");
    public static final StatisticType NOTEBLOCK_TUNED = new StatisticType("NOTEBLOCK_TUNED");
    public static final StatisticType FLOWER_POTTED = new StatisticType("FLOWER_POTTED");
    public static final StatisticType TRAPPED_CHEST_TRIGGERED = new StatisticType("TRAPPED_CHEST_TRIGGERED");
    public static final StatisticType ENDERCHEST_OPENED = new StatisticType("ENDERCHEST_OPENED");
    public static final StatisticType ITEM_ENCHANTED = new StatisticType("ITEM_ENCHANTED");
    public static final StatisticType RECORD_PLAYED = new StatisticType("RECORD_PLAYED");
    public static final StatisticType FURNACE_INTERACTION = new StatisticType("FURNACE_INTERACTION");
    public static final StatisticType CRAFTING_TABLE_INTERACTION = new StatisticType("CRAFTING_TABLE_INTERACTION");
    public static final StatisticType CHEST_OPENED = new StatisticType("CHEST_OPENED");
    public static final StatisticType SLEEP_IN_BED = new StatisticType("SLEEP_IN_BED");
    public static final StatisticType SHULKER_BOX_OPENED = new StatisticType("SHULKER_BOX_OPENED");
    //public static final StatisticType TIME_SINCE_REST
    public static final StatisticType DAMAGE_DEALT_ABSORBED = new StatisticType("DAMAGE_DEALT_ABSORBED");
    public static final StatisticType DAMAGE_DEALT_RESISTED = new StatisticType("DAMAGE_DEALT_RESISTED");
    public static final StatisticType DAMAGE_BLOCKED_BY_SHIELD = new StatisticType("DAMAGE_BLOCKED_BY_SHIELD");
    public static final StatisticType DAMAGE_ABSORBED = new StatisticType("DAMAGE_ABSORBED");
    public static final StatisticType DAMAGE_RESISTED = new StatisticType("DAMAGE_RESISTED");
    public static final StatisticType CLEAN_SHULKER_BOX = new StatisticType("CLEAN_SHULKER_BOX");
    public static final StatisticType OPEN_BARREL = new StatisticType("OPEN_BARREL");
    public static final StatisticType INTERACT_WITH_BLAST_FURNACE = new StatisticType("INTERACT_WITH_BLAST_FURNACE");
    public static final StatisticType INTERACT_WITH_SMOKER = new StatisticType("INTERACT_WITH_SMOKER");
    public static final StatisticType INTERACT_WITH_LECTERN = new StatisticType("INTERACT_WITH_LECTERN");
    public static final StatisticType INTERACT_WITH_CAMPFIRE = new StatisticType("INTERACT_WITH_CAMPFIRE");
    public static final StatisticType INTERACT_WITH_CARTOGRAPHY_TABLE = new StatisticType("INTERACT_WITH_CARTOGRAPHY_TABLE");
    public static final StatisticType INTERACT_WITH_LOOM = new StatisticType("INTERACT_WITH_LOOM");
    public static final StatisticType INTERACT_WITH_STONECUTTER = new StatisticType("INTERACT_WITH_STONECUTTER");
    public static final StatisticType BELL_RING = new StatisticType("BELL_RING");
    public static final StatisticType RAID_TRIGGER = new StatisticType("RAID_TRIGGER");
    public static final StatisticType RAID_WIN = new StatisticType("RAID_WIN");
    public static final StatisticType INTERACT_WITH_ANVIL = new StatisticType("INTERACT_WITH_ANVIL");
    public static final StatisticType INTERACT_WITH_GRINDSTONE = new StatisticType("TARGET_HIT");
    public static final StatisticType TARGET_HIT = new StatisticType("TARGET_HIT");
    public static final StatisticType INTERACT_WITH_SMITHING_TABLE = new StatisticType("INTERACT_WITH_SMITHING_TABLE");
    
    //Must be counted by PlayerMoveEvent
    public static final StatisticType WALK_ONE_CM = new StatisticType("WALK_ONE_CM");
    public static final StatisticType MINECART_ONE_CM = new StatisticType("MINECART_ONE_CM");
	public static final StatisticType BOAT_ONE_CM = new StatisticType("BOAT_ONE_CM");
	public static final StatisticType PIG_ONE_CM = new StatisticType("PIG_ONE_CM");
	public static final StatisticType HORSE_ONE_CM = new StatisticType("HORSE_ONE_CM");
	public static final StatisticType SPRINT_ONE_CM = new StatisticType("SPRINT_ONE_CM");
	public static final StatisticType CROUCH_ONE_CM = new StatisticType("CROUCH_ONE_CM");
	public static final StatisticType AVIATE_ONE_CM = new StatisticType("AVIATE_ONE_CM");
    public static final StatisticType SNEAK_TIME = new StatisticType("SNEAK_TIME");
	public static final StatisticType CLIMB_ONE_CM = new StatisticType("CLIMB_ONE_CM");
	public static final StatisticType FLY_ONE_CM = new StatisticType("FLY_ONE_CM");
    public static final StatisticType SWIM_ONE_CM = new StatisticType("SWIM_ONE_CM");
    public static final StatisticType STRIDER_ONE_CM = new StatisticType("STRIDER_ONE_CM");
    
    //Custom StatisticTypes which are not included in Bukkit Statistic.
    public static final StatisticType LOGIN = new StatisticType("LOGIN");
    public static final StatisticType VOTE = new StatisticType("VOTE");
    public static final StatisticType AFK_ONE_MINUTE = new StatisticType("AFK_ONE_MINUTE");
    public static final StatisticType PLAY_ONE_MINUTE = new StatisticType("PLAY_ONE_MINUTE");
    public static final StatisticType TOTAL_ONLINE_ONE_MINUTE = new StatisticType("TOTAL_ONLINE_ONE_MINUTE");
    public static final StatisticType CRAWLING_ONE_CM = new StatisticType("CRAWLING_ONE_CM");
	
	static HashSet<StatisticType> statisticTypes = new HashSet<>();
	
	private String uniquename;
	private StatisticType(String uniquename)
	{
		this.uniquename = uniquename;
		statisticTypes.add(this);
	}
	
	public static boolean registerStatisticType(String uniquename)
	{
		return statisticTypes.add(new StatisticType(uniquename));
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