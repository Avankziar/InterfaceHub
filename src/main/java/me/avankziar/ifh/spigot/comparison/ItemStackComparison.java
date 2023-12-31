package main.java.me.avankziar.ifh.spigot.comparison;

import org.bukkit.inventory.ItemStack;

public interface ItemStackComparison
{
	boolean isSimilar(ItemStack item, ItemStack filter,
			boolean checkAmount, boolean checkCustomModelData, boolean checkDisplayname, boolean checkItemFlags, boolean checkLore,
			boolean checkEnchantments, boolean checkBookEnchantments, boolean checkChulkerContents, boolean checkArmorMeta,
			boolean checkAxolotlBucketMeta, boolean checkBannerMeta, boolean checkBookMeta, boolean checkBundleMeta,
			boolean checkDamageable, boolean checkFireworkEffectMeta, boolean checkLeatherArmorMeta, boolean checkMapMeta,
			boolean checkPotionMeta, boolean checkRepairable, boolean checkSkullMeta, boolean checkSpawnEggMeta, boolean checkTropicalFishBucketMeta);
	
	boolean isSimilar(ItemStack item, ItemStack filter);
	
	boolean matchType(ItemStack i, ItemStack f);
	
	boolean matchAmount(ItemStack i, ItemStack f);
	
	boolean matchCustomModelData(ItemStack i, ItemStack f);
	
	boolean matchDisplayname(ItemStack i, ItemStack f);
	
	boolean matchItemFlags(ItemStack i, ItemStack f);
	
	boolean matchLore(ItemStack i, ItemStack f);
	
	boolean matchEnchantments(ItemStack i, ItemStack f);
	
	boolean matchArmorMeta(ItemStack i, ItemStack f);
	
	boolean matchAxolotlBucketMeta(ItemStack i, ItemStack f);
	
	boolean matchBannerMeta(ItemStack i, ItemStack f);
	
	boolean matchBookMeta(ItemStack i, ItemStack f);
	
	boolean matchBundleMeta(ItemStack i, ItemStack f);
	
	boolean matchDamageable(ItemStack i, ItemStack f);
	
	boolean matchFireworkMeta(ItemStack i, ItemStack f);
	
	boolean matchLeatherArmorMeta(ItemStack i, ItemStack f);
	
	boolean matchPotionMeta(ItemStack i, ItemStack f);
	
	boolean matchRepairable(ItemStack i, ItemStack f);
	
	boolean matchSkullMeta(ItemStack i, ItemStack f);
	
	boolean matchSpawnEggMeta(ItemStack i, ItemStack f);
	
	boolean matchTropicalFishBucketMeta(ItemStack i, ItemStack f);
}
