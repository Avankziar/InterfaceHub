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
}
