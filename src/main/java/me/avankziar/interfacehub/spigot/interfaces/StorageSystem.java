package main.java.me.avankziar.interfacehub.spigot.interfaces;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface StorageSystem
{
	/**
	 * Return true, if on this location a distributionchest exist.
	 * @param server
	 * @param location
	 * @return
	 */
	boolean existDistributionChest(String server, Location location);
	
	/**
	 * Return true, if on this location a storagechest exist.
	 * @param server
	 * @param location
	 * @return
	 */
	boolean existStorageChest(String server, Location location);
	
	/**
	 * Return true, if the player is the owner from a or multiple storagesystems.
	 * @param player
	 * @return
	 */
	boolean hasDistributionChests(Player player);
	
	/**
	 * Return all distributionchests ids, which are on this location.<br>
	 * Return null, if no distribtionchest exist there.
	 * @param server
	 * @param location
	 * @return
	 */
	Integer[] getDistributionChestIDs(String server, Location location);
	
	/**
	 * Return all storagechests ids, which are on this location.<br>
	 * Return null, if no storagechest exist there.
	 * @param server
	 * @param location
	 * @return
	 */
	Integer[] getStorageChestIDs(String server, Location location);
	
	/**
	 * Return all distributionchests ids, which are in this area.<br>
	 * Return null, if no distribtionchest exist there.
	 * @param server
	 * @param point1
	 * @param point2
	 * @return
	 */
	Integer[] getDistributionChestIDs(String server, Location point1, Location point2);
	
	/**
	 * Return all storagechests ids, which are in this area.<br>
	 * Return null, if no storagechest exist there.
	 * @param server
	 * @param point1
	 * @param point2
	 * @return
	 */
    Integer[] getStorageChestIDs(String server, Location point1, Location point2);
	
    /**
     * Return true, if this distributionchest is deleted.<br>
     * If you wish to delete all bounded storagechest, set true by the second param.
     * @param id
     * @param deleteBoundedStorageChests
     * @return
     */
	boolean deleteDistributionChest(int id, boolean deleteBoundedStorageChests);
	
	/**
	 * Return true, if this storagechest is deleted.
	 * @param id
	 * @return
	 */
	boolean deleteStorageChest(int id);
	
	/**
	 * Return all storagechests which have this item as filter and bound by this distributionchest.<br>
	 * Return null, if there is no such chest.
	 * @param distributionchestid
	 * @param searchItem
	 * @return
	 */
	Integer[] getStorageChestsWithSearchableItem(int distributionchestid, ItemStack searchItem);
	
	/**
	 * Return all storagechests which have this item as filter and owned by the player.<br>
	 * Return null, if there is no such chest.
	 * @param player
	 * @param searchableItem
	 * @return
	 */
	Integer[] getStorageChestsWithSearchableItem(Player player, String searchableItem);
	
	/**
	 * Return all storagechests which have this item as filter.<br>
	 * Return null, if there is no such chest.
	 * @param searchableItem
	 * @return
	 */
	Integer[] getStorageChestsWithSearchableItem(String searchableItem);
	
	/**
	 * Return the owner uuid of this distributionchest.<br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	String getDistributionChestOwnerUUID(int id);
	
	/**
	 * Return the members uuid of this distributionchest.<br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	List<String> getDistributionChestMembers(int id);
	
	/**
	 * Return the creation date of this distributionchest.<br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	Long getDistributionChestCreationDate(int id);
	
	/**
	 * Return the chestname of this distributionchest.<br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	String getDistributionChestChestName(int id);
	
	/**
	 * Return the normal priority (asc=false or desc=true) of this distributionchest.<br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	Boolean getDistributionChestNormalPriority(int id);
	
	/**
	 * Return the prioritytype of this distributionchest.<br>
	 * Either <b>SWITCH</b> or <b>PLACE</b><br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	String getDistributionChestPriorityType(int id);
	
	/**
	 * Return the prioritynumber of this distributionchest.<br>
	 * Is only important if the priority type is <b>PLACE</b>.<br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	Integer getDistributionChestPriorityNumber(int id);
	
	/**
	 * Return true if the chest distribute automatic.<br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	Boolean getDistributionChestAutomaticDistribution(int id);
	
	/**
	 * Return true if the chest distribute random.<br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	Boolean getDistributionChestDistributeRandom(int id);
	
	/**
	 * Return the server of this distributionchest.<br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	String getDistributionChestServer(int id);
	
	/**
	 * Return the location of this distributionchest.<br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	Location getDistribtionChestLocation(int id);
	
	
	/**
	 * Return the owner uuid of this storagechest.<br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	String getStorageChestOwnerUUID(int id);
	
	/**
	 * Return the distributionchest id to which this storagechest is bounded.<br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	Integer getStorageChestDistributionChestID(int id);
	
	/**
	 * Return the creation date of this storagechest.<br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	Long getStorageChestCreationDate(int id);
	
	/**
	 * Return the prioritynumber of this storagechest.<br>
	 * Only important, if the distributionchest prioritytype set to <b>PLACE</b>.<br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	Integer getStorageChestPriorityNumber(int id);
	
	/**
	 * Return the itemstack array filter of this storagechest.<br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	ItemStack[] getStorageChestFilter(int id);
	
	/**
	 * Return the itemstack array filter as searchable string of this storagechest.<br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	String[] getStorageChestSearchContent(int id);
	
	/**
	 * Return true if this storagechest is a endstorage.<br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	Boolean getStorageChestEndStorage(int id);
	
	/**
	 * Return the server of this storagechest.<br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	String getStorageChestServer(int id);
	
	/**
	 * Return the location of this storagechest.<br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	Location getStorageChestLocation(int id);
	
	/**
	 * Return the chestname of this storagechest.<br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	String getStorageChestChestName(int id);
	
	/**
	 * Return true if this storagechest is a void chest.<br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	Boolean getStorageChestOptionVoid(int id);
	
	/**
	 * Return true if this storagechest has the option durability active.<br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	Boolean getStorageChestOptionDurability(int id);
	
	/**
	 * Return the durabilitytype of this storagechest.<br>
	 * Possibility: <b>LESSTHAN</b> or <b>LARGERTHAN</b><br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	String getStorageChestDurabilityType(int id);
	
	/**
	 * Return the durability percent of this storagechest.<br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	Integer getStorageChestDurabilityPercent(int id);
	
	/**
	 * Return true if this storagechest has the option repair active.<br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	Boolean getStorageChestOptionRepair(int id);
	
	/**
	 * Return the repairtype of this storagechest.<br>
	 * Possibility: <b>LESSTHAN</b> or <b>LARGERTHAN</b><br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	String getStorageChestRepairType(int id);
	
	/**
	 * Return the repair level cost of this storagechest.<br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	Integer getStorageChestRepairLevelCost(int id);
	
	/**
	 * Return true if this storagechest has the option enchantment active.<br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	Boolean getStorageChestOptionEnchantment(int id);
	
	/**
	 * Return true if this storagechest has the option material active.<br>
	 * Return null, if the chest not exist.
	 * @param id
	 * @return
	 */
	Boolean getStorageChestOptionMaterial(int id);
}