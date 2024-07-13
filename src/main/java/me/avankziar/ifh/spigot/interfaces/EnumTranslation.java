package me.avankziar.ifh.spigot.interfaces;

import org.bukkit.Color;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.TreeType;
import org.bukkit.block.banner.PatternType;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Axolotl;
import org.bukkit.entity.Cat;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fox;
import org.bukkit.entity.Rabbit;
import org.bukkit.entity.TropicalFish;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.map.MapCursor;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

public interface EnumTranslation
{
	public String getLocalization(Material mat);
	
	public String getLocalization(DyeColor dyeColor, PatternType patternType);
	
	public String getLocalization(Enchantment ench);
	
	public String getLocalization(ItemFlag i);
	
	public String getLocalization(PotionType pt);
	
	public String getLocalization(PotionType pt, PotionMeta pm);
	
	public String getLocalization(PotionEffectType pet);
	
	public String getLocalization(Axolotl.Variant axv);
	
	public String getLocalization(EntityType et);
	
	public String getLocalization(BookMeta.Generation bmg);
	
	public String getLocalization(Color c);
	
	public String getLocalization(DyeColor dc);
	
	public String getLocalization(DyeColor bodyColor, TropicalFish.Pattern pattern, DyeColor patternColor);
	
	public String getLocalization(Cat.Type ct);
	
	public String getLocalization(Fox.Type ft);
	
	public String getLocalization(MapCursor.Type mct);
	
	public String getLocalization(Rabbit.Type rt);
	
	public String getLocalization(Villager.Type vt);
	
	public String getLocalization(Villager.Profession vp);
	
	public String getLocalization(TreeType tt);
}