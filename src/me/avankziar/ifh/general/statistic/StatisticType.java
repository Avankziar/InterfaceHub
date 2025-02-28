package me.avankziar.ifh.general.statistic;

import java.util.HashMap;
import java.util.HashSet;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.bukkit.Statistic;

public class StatisticType 
{
	public enum SortingType
	{
		WITH_SUBSTATISTIC,
		MISCELLANEOUS,
		DAMAGE_AND_DEATH,
		INTERACTION_WITH_BLOCKS,
		MOVEMENT,
		TIME,
		PLUGINS,
		SPECIAL,
		SKILL,
		ECONOMY;
	}
	
	private static HashSet<StatisticType> statisticTypes = new HashSet<>();
	private static HashMap<SortingType, HashSet<StatisticType>> sortedStatisticTypes = new HashMap<>();
	
    //public static final StatisticType LEAVE_GAME See LOGIN
    //public static final StatisticType TOTAL_WORLD_TIME, //Only a Single Player thing
    //public static final StatisticType WALK_ON_WATER_ONE_CM Not reachable, will be WALK_ONE_CM
	//public static final StatisticType FALL_ONE_CM Not reachable
    //public static final StatisticType WALK_UNDER_WATER_ONE_CM Not reachable, will be WALK_ONE_CM
	//public static final StatisticType TIME_SINCE_DEATH
    //public static final StatisticType TIME_SINCE_REST
	
	//Statistics with substatistics
	public static final StatisticType MINE_BLOCK = registerStatisticType("MINE_BLOCK", SortingType.WITH_SUBSTATISTIC);
	public static final StatisticType USE_ITEM = registerStatisticType("USE_ITEM", SortingType.WITH_SUBSTATISTIC);
    public static final StatisticType BREAK_ITEM = registerStatisticType("BREAK_ITEM", SortingType.WITH_SUBSTATISTIC);
    public static final StatisticType CRAFT_ITEM = registerStatisticType("CRAFT_ITEM", SortingType.WITH_SUBSTATISTIC);
	public static final StatisticType DROP = registerStatisticType("DROP", SortingType.WITH_SUBSTATISTIC);
	public static final StatisticType PICKUP = registerStatisticType("PICKUP", SortingType.WITH_SUBSTATISTIC);
	public static final StatisticType KILL_ENTITY = registerStatisticType("KILL_ENTITY", SortingType.WITH_SUBSTATISTIC);
	public static final StatisticType ENTITY_KILLED_BY = registerStatisticType("ENTITY_KILLED_BY", SortingType.WITH_SUBSTATISTIC);
	
	//Misc
    public static final StatisticType ITEM_ENCHANTED = registerStatisticType("ITEM_ENCHANTED", SortingType.MISCELLANEOUS);
    public static final StatisticType DROP_COUNT = registerStatisticType("DROP_COUNT", SortingType.MISCELLANEOUS);
    public static final StatisticType FISH_CAUGHT = registerStatisticType("FISH_CAUGHT", SortingType.MISCELLANEOUS);
	public static final StatisticType ANIMALS_BRED = registerStatisticType("ANIMALS_BRED", SortingType.MISCELLANEOUS);
    public static final StatisticType TALKED_TO_VILLAGER = registerStatisticType("TALKED_TO_VILLAGER", SortingType.MISCELLANEOUS);
    public static final StatisticType TRADED_WITH_VILLAGER = registerStatisticType("TRADED_WITH_VILLAGER", SortingType.MISCELLANEOUS);
    public static final StatisticType RECORD_PLAYED = registerStatisticType("RECORD_PLAYED", SortingType.MISCELLANEOUS);
    public static final StatisticType CAKE_SLICES_EATEN = registerStatisticType("CAKE_SLICES_EATEN", SortingType.MISCELLANEOUS);
    public static final StatisticType SLEEP_IN_BED = registerStatisticType("SLEEP_IN_BED", SortingType.MISCELLANEOUS);
	public static final StatisticType FLOWER_POTTED = registerStatisticType("FLOWER_POTTED", SortingType.MISCELLANEOUS);
    public static final StatisticType BELL_RING = registerStatisticType("BELL_RING", SortingType.MISCELLANEOUS);
    public static final StatisticType TARGET_HIT = registerStatisticType("TARGET_HIT", SortingType.MISCELLANEOUS);
    public static final StatisticType ARMOR_CLEANED = registerStatisticType("ARMOR_CLEANED", SortingType.MISCELLANEOUS);
    public static final StatisticType CLEAN_SHULKER_BOX = registerStatisticType("CLEAN_SHULKER_BOX", SortingType.MISCELLANEOUS);
    public static final StatisticType BANNER_CLEANED = registerStatisticType("BANNER_CLEANED", SortingType.MISCELLANEOUS);
    public static final StatisticType RAID_TRIGGER = registerStatisticType("RAID_TRIGGER", SortingType.MISCELLANEOUS);
    public static final StatisticType RAID_WIN = registerStatisticType("RAID_WIN", SortingType.MISCELLANEOUS);
    
    //Damage, Death and kills which are no substatistics
    public static final StatisticType DAMAGE_DEALT = registerStatisticType("DAMAGE_DEALT", SortingType.DAMAGE_AND_DEATH);
	public static final StatisticType DAMAGE_TAKEN = registerStatisticType("DAMAGE_TAKEN", SortingType.DAMAGE_AND_DEATH);
	public static final StatisticType DEATHS = registerStatisticType("DEATHS", SortingType.DAMAGE_AND_DEATH);
	public static final StatisticType MOB_KILLS = registerStatisticType("MOB_KILLS", SortingType.DAMAGE_AND_DEATH);
	public static final StatisticType PLAYER_KILLS = registerStatisticType("PLAYER_KILLS", SortingType.DAMAGE_AND_DEATH);
    public static final StatisticType DAMAGE_DEALT_ABSORBED = registerStatisticType("DAMAGE_DEALT_ABSORBED", SortingType.DAMAGE_AND_DEATH);
    public static final StatisticType DAMAGE_DEALT_RESISTED = registerStatisticType("DAMAGE_DEALT_RESISTED", SortingType.DAMAGE_AND_DEATH);
    public static final StatisticType DAMAGE_BLOCKED_BY_SHIELD = registerStatisticType("DAMAGE_BLOCKED_BY_SHIELD", SortingType.DAMAGE_AND_DEATH);
    public static final StatisticType DAMAGE_ABSORBED = registerStatisticType("DAMAGE_ABSORBED", SortingType.DAMAGE_AND_DEATH);
    public static final StatisticType DAMAGE_RESISTED = registerStatisticType("DAMAGE_RESISTED", SortingType.DAMAGE_AND_DEATH);
    
    //Interacts with Blocks with no Substatistic
    public static final StatisticType CRAFTING_TABLE_INTERACTION = registerStatisticType("CRAFTING_TABLE_INTERACTION", SortingType.INTERACTION_WITH_BLOCKS);
    public static final StatisticType CHEST_OPENED = registerStatisticType("CHEST_OPENED", SortingType.INTERACTION_WITH_BLOCKS);
    public static final StatisticType OPEN_BARREL = registerStatisticType("OPEN_BARREL", SortingType.INTERACTION_WITH_BLOCKS);
    public static final StatisticType SHULKER_BOX_OPENED = registerStatisticType("SHULKER_BOX_OPENED", SortingType.INTERACTION_WITH_BLOCKS);
    public static final StatisticType ENDERCHEST_OPENED = registerStatisticType("ENDERCHEST_OPENED", SortingType.INTERACTION_WITH_BLOCKS);
    public static final StatisticType TRAPPED_CHEST_TRIGGERED = registerStatisticType("TRAPPED_CHEST_TRIGGERED", SortingType.INTERACTION_WITH_BLOCKS);
    public static final StatisticType FURNACE_INTERACTION = registerStatisticType("FURNACE_INTERACTION", SortingType.INTERACTION_WITH_BLOCKS);
    public static final StatisticType INTERACT_WITH_BLAST_FURNACE = registerStatisticType("INTERACT_WITH_BLAST_FURNACE", SortingType.INTERACTION_WITH_BLOCKS);
    public static final StatisticType INTERACT_WITH_SMOKER = registerStatisticType("INTERACT_WITH_SMOKER", SortingType.INTERACTION_WITH_BLOCKS);
    public static final StatisticType INTERACT_WITH_CAMPFIRE = registerStatisticType("INTERACT_WITH_CAMPFIRE", SortingType.INTERACTION_WITH_BLOCKS);
    public static final StatisticType INTERACT_WITH_LECTERN = registerStatisticType("INTERACT_WITH_LECTERN", SortingType.INTERACTION_WITH_BLOCKS);
    public static final StatisticType INTERACT_WITH_CARTOGRAPHY_TABLE = registerStatisticType("INTERACT_WITH_CARTOGRAPHY_TABLE", SortingType.INTERACTION_WITH_BLOCKS);
    public static final StatisticType INTERACT_WITH_LOOM = registerStatisticType("INTERACT_WITH_LOOM", SortingType.INTERACTION_WITH_BLOCKS);
    public static final StatisticType INTERACT_WITH_STONECUTTER = registerStatisticType("INTERACT_WITH_STONECUTTER", SortingType.INTERACTION_WITH_BLOCKS);
    public static final StatisticType INTERACT_WITH_ANVIL = registerStatisticType("INTERACT_WITH_ANVIL", SortingType.INTERACTION_WITH_BLOCKS);
    public static final StatisticType INTERACT_WITH_GRINDSTONE = registerStatisticType("TARGET_HIT", SortingType.INTERACTION_WITH_BLOCKS);
    public static final StatisticType INTERACT_WITH_SMITHING_TABLE = registerStatisticType("INTERACT_WITH_SMITHING_TABLE", SortingType.INTERACTION_WITH_BLOCKS);
    public static final StatisticType BREWINGSTAND_INTERACTION = registerStatisticType("BREWINGSTAND_INTERACTION", SortingType.INTERACTION_WITH_BLOCKS);
    public static final StatisticType HOPPER_INSPECTED = registerStatisticType("HOPPER_INSPECTED", SortingType.INTERACTION_WITH_BLOCKS);
    public static final StatisticType BEACON_INTERACTION = registerStatisticType("BEACON_INTERACTION", SortingType.INTERACTION_WITH_BLOCKS);
    public static final StatisticType DROPPER_INSPECTED = registerStatisticType("DROPPER_INSPECTED", SortingType.INTERACTION_WITH_BLOCKS);
    public static final StatisticType DISPENSER_INSPECTED = registerStatisticType("DISPENSER_INSPECTED", SortingType.INTERACTION_WITH_BLOCKS);
    public static final StatisticType CAULDRON_FILLED = registerStatisticType("CAULDRON_FILLED", SortingType.INTERACTION_WITH_BLOCKS);
    public static final StatisticType CAULDRON_USED = registerStatisticType("CAULDRON_USED", SortingType.INTERACTION_WITH_BLOCKS);
    public static final StatisticType NOTEBLOCK_PLAYED = registerStatisticType("NOTEBLOCK_PLAYED", SortingType.INTERACTION_WITH_BLOCKS);
    public static final StatisticType NOTEBLOCK_TUNED = registerStatisticType("NOTEBLOCK_TUNED", SortingType.INTERACTION_WITH_BLOCKS);
    
    /**
     * Bukkit Statistic which will be not increased though org.bukkit.event.player.PlayerStatisticIncrementEvent since 1.19.<br>
     * If it should be increased, it must be done through track org.bukkit.event.player.PlayerMoveEvent<br>
     * The Bukkit Statistic WALK_ON_WATER_ONE_CM and WALK_UNDER_WATER_ONE_CM should be also run through this,
     * because in 1.21.4 without expensive checks it is not possible to determine if a player walks under or over water.
     */
    public static final StatisticType WALK_ONE_CM = registerStatisticType("WALK_ONE_CM", SortingType.MOVEMENT);
    /**
     * Bukkit Statistic which will be not increased though org.bukkit.event.player.PlayerStatisticIncrementEvent since 1.19.<br>
     * If it should be increased, it must be done through track org.bukkit.event.player.PlayerMoveEvent
     */
    public static final StatisticType MINECART_ONE_CM = registerStatisticType("MINECART_ONE_CM", SortingType.MOVEMENT);
    /**
     * Bukkit Statistic which will be not increased though org.bukkit.event.player.PlayerStatisticIncrementEvent since 1.19.<br>
     * If it should be increased, it must be done through track org.bukkit.event.player.PlayerMoveEvent
     */
	public static final StatisticType BOAT_ONE_CM = registerStatisticType("BOAT_ONE_CM", SortingType.MOVEMENT);
    /**
     * Bukkit Statistic which will be not increased though org.bukkit.event.player.PlayerStatisticIncrementEvent since 1.19.<br>
     * If it should be increased, it must be done through track org.bukkit.event.player.PlayerMoveEvent
     */
	public static final StatisticType PIG_ONE_CM = registerStatisticType("PIG_ONE_CM", SortingType.MOVEMENT);
    /**
     * Bukkit Statistic which will be not increased though org.bukkit.event.player.PlayerStatisticIncrementEvent since 1.19.<br>
     * If it should be increased, it must be done through track org.bukkit.event.player.PlayerMoveEvent
     */
	public static final StatisticType HORSE_ONE_CM = registerStatisticType("HORSE_ONE_CM", SortingType.MOVEMENT);
    /**
     * Bukkit Statistic which will be not increased though org.bukkit.event.player.PlayerStatisticIncrementEvent since 1.19.<br>
     * If it should be increased, it must be done through track org.bukkit.event.player.PlayerMoveEvent
     */
	public static final StatisticType SPRINT_ONE_CM = registerStatisticType("SPRINT_ONE_CM", SortingType.MOVEMENT);
    /**
     * Bukkit Statistic which will be not increased though org.bukkit.event.player.PlayerStatisticIncrementEvent since 1.19.<br>
     * If it should be increased, it must be done through track org.bukkit.event.player.PlayerMoveEvent
     */
	public static final StatisticType CROUCH_ONE_CM = registerStatisticType("CROUCH_ONE_CM", SortingType.MOVEMENT);
    /**
     * Bukkit Statistic which will be not increased though org.bukkit.event.player.PlayerStatisticIncrementEvent since 1.19.<br>
     * If it should be increased, it must be done through track org.bukkit.event.player.PlayerMoveEvent
     */
	public static final StatisticType AVIATE_ONE_CM = registerStatisticType("AVIATE_ONE_CM", SortingType.MOVEMENT);
    /**
     * Bukkit Statistic which will be not increased though org.bukkit.event.player.PlayerStatisticIncrementEvent since 1.19.<br>
     * If it should be increased, it must be done through track org.bukkit.event.player.PlayerMoveEvent
     */
	public static final StatisticType CLIMB_ONE_CM = registerStatisticType("CLIMB_ONE_CM", SortingType.MOVEMENT);
    /**
     * Bukkit Statistic which will be not increased though org.bukkit.event.player.PlayerStatisticIncrementEvent since 1.19.<br>
     * If it should be increased, it must be done through track org.bukkit.event.player.PlayerMoveEvent
     */
	public static final StatisticType FLY_ONE_CM = registerStatisticType("FLY_ONE_CM", SortingType.MOVEMENT);
    /**
     * Bukkit Statistic which will be not increased though org.bukkit.event.player.PlayerStatisticIncrementEvent since 1.19.<br>
     * If it should be increased, it must be done through track org.bukkit.event.player.PlayerMoveEvent
     */
    public static final StatisticType SWIM_ONE_CM = registerStatisticType("SWIM_ONE_CM", SortingType.MOVEMENT);
    /**
     * Bukkit Statistic which will be not increased though org.bukkit.event.player.PlayerStatisticIncrementEvent since 1.19.<br>
     * If it should be increased, it must be done through track org.bukkit.event.player.PlayerMoveEvent
     */
    public static final StatisticType STRIDER_ONE_CM = registerStatisticType("STRIDER_ONE_CM", SortingType.MOVEMENT);
    /**
     * Bukkit Statistic which will be not increased though org.bukkit.event.player.PlayerStatisticIncrementEvent since 1.19.<br>
     * If it should be increased, it must be done through track org.bukkit.event.player.PlayerMoveEvent
     */
    //Not PlayerMoveEvent, but a "move" action
    public static final StatisticType JUMP = registerStatisticType("JUMP", SortingType.MOVEMENT);
    
    //Must be access an protocol with a special plugin
    public static final StatisticType SNEAK_TIME = registerStatisticType("SNEAK_TIME", SortingType.TIME);
    
    /**
     * Custom StatisticTypes which are not included in Bukkit Statistic.
     */
    public static final StatisticType LOGIN = registerStatisticType("LOGIN", SortingType.MISCELLANEOUS);
    /**
     * Custom StatisticTypes which are not included in Bukkit Statistic.
     */
    public static final StatisticType VOTE = registerStatisticType("VOTE", SortingType.PLUGINS);
    /**
     * Custom StatisticTypes(Time) which are not included in Bukkit Statistic.
     */
    public static final StatisticType TOTAL_ONLINE_ONE_MINUTE = registerStatisticType("TOTAL_ONLINE_ONE_MINUTE", SortingType.TIME);
    /**
     * Custom StatisticTypes(Time) which <b>ARE</b> included in Bukkit Statistic <b>BUT</b> which was tracked per tick not a minute!
     */
    public static final StatisticType PLAY_ONE_MINUTE = registerStatisticType("PLAY_ONE_MINUTE", SortingType.TIME); //A new definition, definitive one minute
    /**
     * Custom StatisticTypes(Time) which are not included in Bukkit Statistic.
     */
    public static final StatisticType AFK_ONE_MINUTE = registerStatisticType("AFK_ONE_MINUTE", SortingType.TIME);
    /**
     * Custom StatisticTypes(Movement) which are not included in Bukkit Statistic.
     */
    public static final StatisticType CRAWLING_ONE_CM = registerStatisticType("CRAWLING_ONE_CM", SortingType.MOVEMENT);
	
	private String uniquename;
	private SortingType sortingType;
	private StatisticType(String uniquename, SortingType sortingType)
	{
		this.uniquename = uniquename;
		this.sortingType = sortingType;
	}
	
	public SortingType getSortingType()
	{
		return this.sortingType;
	}
	
	/**
	 * Register a StatistcType with SortingType <b>PLUGINS</b>, which a stored in a HashSet.<br>
	 * Returns null if one of the @param are null or if the StatisticType are already registered.
	 * @param uniquename
	 * @return
	 */
	public static StatisticType registerStatisticType(String uniquename)
	{
		return registerStatisticType(uniquename, SortingType.PLUGINS);
	}
	
	/**
	 * Register a StatistcType, which a stored in a HashSet.<br>
	 * Returns null if one of the @param are null or if the StatisticType are already registered.
	 * @param uniquename
	 * @param sortingType
	 * @return
	 */
	public static StatisticType registerStatisticType(@Nonnull String uniquename, @Nonnull SortingType sortingType)
	{
		if(uniquename == null || sortingType == null)
		{
			return null;
		}
		StatisticType st = new StatisticType(uniquename, sortingType);
		boolean b = statisticTypes.add(st);
		if(b)
		{
			HashSet<StatisticType> hs = sortedStatisticTypes.containsKey(sortingType) 
					? sortedStatisticTypes.get(sortingType) : new HashSet<StatisticType>();
			hs.add(st);
			sortedStatisticTypes.put(sortingType, hs);
			return st;
		}
		return null;
	}
	
	public static HashSet<StatisticType> getStatisticTypes(@Nullable SortingType sortingType)
	{
		return sortingType == null ? statisticTypes : sortedStatisticTypes.get(sortingType);
	}
	
	/**
	 * Get the StatisticType of a uniquename.<br>
	 * Return null if StatisitcType dont exist.
	 * @param name
	 * @return
	 */
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
	
	/**
	 * Returns the StatisticType uniquename.
	 */
	public String toString()
	{
		return this.uniquename;
	}
	
	/**
	 * Returns the StatisticType of the Bukkit/Spigot Statistic<br>
	 * For LEAVE_GAME, TOTAL_WORLD_TIME, TIME_SINCE_DEATH, TIME_SINCE_REST return null-<br>
	 * For WALK_ON_WATER_ONE_CM, WALK_UNDER_WATER_ONE_CM return StatisticType.WALK_ONE_CM.
	 * @param statistic
	 * @return
	 */
	public static StatisticType getStatisticType(Statistic statistic)
	{
		switch(statistic)
		{
		case LEAVE_GAME:
		case TOTAL_WORLD_TIME:
		case TIME_SINCE_DEATH:
		case TIME_SINCE_REST:
			return null;
		case WALK_ON_WATER_ONE_CM:
		case WALK_UNDER_WATER_ONE_CM:
			return StatisticType.WALK_ONE_CM;
		default:
			return StatisticType.valueOf(statistic.toString());
		}
	}
}