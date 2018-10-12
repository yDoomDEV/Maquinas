package br.com.utils;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class ItemAPI {
	
		public static ItemStack create(String name, Material mat) {
			ItemStack is = new ItemStack(mat);
			ItemMeta im = is.getItemMeta();
			im.setDisplayName(name.replace("&", "§"));
			is.setItemMeta(im);
			return is;
		}
		public static ItemStack create(String name, Material mat, Enchantment ench, int level) {
			ItemStack is = new ItemStack(mat);
			ItemMeta im = is.getItemMeta();
			im.setDisplayName(name.replace("&", "§"));
			is.setItemMeta(im);
			is.addUnsafeEnchantment(ench, level);
			return is;
		}
		public static ItemStack create(String name, Material mat, List<String> lore) {
			ItemStack is = new ItemStack(mat);
			ItemMeta im = is.getItemMeta();
			im.setDisplayName(name.replace("&", "§"));
			im.setLore(lore);
			is.setItemMeta(im);
			return is;
		}
		public static ItemStack create(String name, Material mat, List<String> lore, int amount) {
			ItemStack is = new ItemStack(mat);
			ItemMeta im = is.getItemMeta();
			im.setDisplayName(name.replace("&", "§"));
			im.setLore(lore);
			is.setItemMeta(im);
			is.setAmount(amount);
			return is;
		}
		public static ItemStack create(String name, Material mat, short id) {
			ItemStack is = new ItemStack(mat);
			ItemMeta im = is.getItemMeta();
			im.setDisplayName(name.replace("&", "§"));
			is.setItemMeta(im);
			is.setDurability(id);
			return is;
		}
		public static ItemStack create(String name, Material mat, short id, List<String> lore) {
			ItemStack is = new ItemStack(mat);
			ItemMeta im = is.getItemMeta();
			im.setDisplayName(name.replace("&", "§"));
			im.setLore(lore);
			is.setItemMeta(im);
			is.setDurability(id);
			return is;
		}
		public static ItemStack skull(String name, String p) {
			ItemStack is = new ItemStack(Material.SKULL_ITEM);
			SkullMeta im = (SkullMeta) is.getItemMeta();
			is.setDurability((short)3);
			im.setDisplayName(name.replace("&", "§"));
			im.setOwner(p);
			is.setItemMeta(im);
			return is;
		}
		public static ItemStack create(String name, Material mat, Enchantment ench, int level, List<String> lore) {
	        ItemStack is = new ItemStack(mat);
	        ItemMeta im = is.getItemMeta();
	        im.setDisplayName(name.replace("&", "§"));
	        im.setLore(lore);
	       im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
	        is.setItemMeta(im);
	        is.addUnsafeEnchantment(ench, level);
	        return is;
	    }
		public static ItemStack create(String name, Material mat, List<String> lore, List<String> lore2) {
			ItemStack is = new ItemStack(mat);
			ItemMeta im = is.getItemMeta();
			im.setDisplayName(name.replace("&", "§"));
			im.setLore(lore);
			is.setItemMeta(im);
			return is;
		}
		public static ItemStack create(String name, Material mat, Enchantment ench, int level, List<String> lore, List<String> lore2) {
	        ItemStack is = new ItemStack(mat);
	        ItemMeta im = is.getItemMeta();
	        im.setDisplayName(name.replace("&", "§"));
	        im.setLore(lore);
	        im.setLore(lore2);
	        im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
	        is.setItemMeta(im);
	        is.addUnsafeEnchantment(ench, level);
	        return is;
	    }
	}
