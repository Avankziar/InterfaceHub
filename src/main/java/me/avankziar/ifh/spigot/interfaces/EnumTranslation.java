package main.java.me.avankziar.ifh.spigot.interfaces;

import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.PatternType;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public interface EnumTranslation
{
	public String getLocalization(Material mat);
	
	public String getLocalization(DyeColor dyeColor, PatternType patternType);
	
	public String getLocalization(Enchantment ench);
	
	public String getLocalization(ItemFlag i);
}