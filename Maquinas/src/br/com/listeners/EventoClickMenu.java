package br.com.listeners;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import br.com.utils.ItemAPI;
import br.com.ydoom.Main;

public class EventoClickMenu implements Listener {

	public ItemStack comb = ItemAPI.create("§8Combustiveis", Material.COAL,
			Arrays.asList("§7Categoria de combustiveis."));
	public ItemStack maq = ItemAPI.create("§eMaquinas", Material.ENDER_STONE,
			Arrays.asList("§7Categoria de maquinas."));
	public ItemStack comb1 = ItemAPI.create("§7Combustivel §7( 1 )", Material.COAL, Enchantment.DURABILITY, 1,
			Arrays.asList("§7Combustivel nivel ( 1 )"), Arrays.asList("§ePreço: §a$§f10.00"));
	public ItemStack comb2 = ItemAPI.create("§7Combustivel §7( 2 )", Material.COAL, Enchantment.DURABILITY, 1,
			Arrays.asList("§7Combustivel nivel ( 2 )"), Arrays.asList("§ePreço: §a$§f10.00"));
	public ItemStack comb3 = ItemAPI.create("§7Combustivel §7( 3 )", Material.COAL, Enchantment.DURABILITY, 1,
			Arrays.asList("§7Combustivel nivel ( 3 )"), Arrays.asList("§ePreço: §a$§f10.00"));
	public ItemStack comb4 = ItemAPI.create("§7Combustivel §7( 4 )", Material.COAL, Enchantment.DURABILITY, 1,
			Arrays.asList("§7Combustivel nivel ( 4 )"), Arrays.asList("§ePreço: §a$§f10.00"));
	public ItemStack comb5 = ItemAPI.create("§7Combustivel §7( 5 )", Material.MAGMA_CREAM, Enchantment.DURABILITY, 1,
			Arrays.asList("§7Combustivel nivel ( 5 )"), Arrays.asList("§ePreço: §a$§f10.00"));
	public ItemStack comb6 = ItemAPI.create("§7Combustivel §7( 6 )", Material.FIREWORK_CHARGE, Enchantment.DURABILITY,
			1, Arrays.asList("§7Combustivel nivel ( 6 )"), Arrays.asList("§ePreço: §a$§f10.00"));
	public ItemStack nada = ItemAPI.create("§e-/-", Material.STAINED_GLASS_PANE, Arrays.asList("§e-/-"));
	public ItemStack maq1 = ItemAPI.create("§fMaquina De Ferro", Material.IRON_BLOCK, Enchantment.DURABILITY, 1,
			Arrays.asList("§ePreço: §a$§f10.00"));
	public ItemStack maq2 = ItemAPI.create("§cMaquina De Couro", Material.NETHER_BRICK, Enchantment.DURABILITY, 1,
			Arrays.asList("§ePreço: §a$§f10.00"));
	public ItemStack maq3 = ItemAPI.create("§bMaquina De Prismarinho", Material.PRISMARINE, Enchantment.DURABILITY, 1,
			Arrays.asList("§ePreço: §a$§f10.00"));
	public ItemStack maq4 = ItemAPI.create("§eMaquina De Estrela", Material.ENDER_STONE, Enchantment.DURABILITY, 1,
			Arrays.asList("§ePreço: §a$§f10.00"));
	public ItemStack maq5 = ItemAPI.create("§aMaquina De Amoeba", Material.SLIME_BLOCK, Enchantment.DURABILITY, 1,
			Arrays.asList("§ePreço: §a$§f10.00"));
	public ItemStack maq6 = ItemAPI.create("§6Maquina De Peixe", Material.SEA_LANTERN, Enchantment.DURABILITY, 1,
			Arrays.asList("§ePreço: §a$§f10.00"));
	public ItemStack maq7 = ItemAPI.create("§8Maquina De Combustivel", Material.COAL_BLOCK, Enchantment.DURABILITY, 1,
			Arrays.asList("§ePreço: §a$§f10.00"));
	public ItemStack ant = ItemAPI.create("§cPagina anterior", Material.ARROW, Arrays.asList("§7Clique para voltar"));
	public ItemStack prox = ItemAPI.create("§aProxima pagina", Material.ARROW,
			Arrays.asList("§7Clique aqui para ir para a proxima pagina"));

	@EventHandler
	public void onClick(InventoryClickEvent e) {
		if (e.getCurrentItem().isSimilar(maq)) {
			e.setCancelled(true);
			Inventory maqs = Bukkit.createInventory(null, 27, "§eMenu de maquinas");
			maqs.setItem(0, nada);
			maqs.setItem(1, nada);
			maqs.setItem(2, nada);
			maqs.setItem(3, nada);
			maqs.setItem(4, nada);
			maqs.setItem(5, nada);
			maqs.setItem(6, nada);
			maqs.setItem(7, nada);
			maqs.setItem(8, nada);
			maqs.setItem(9, ant);
			maqs.setItem(17, prox);
			maqs.setItem(18, nada);
			maqs.setItem(19, nada);
			maqs.setItem(20, nada);
			maqs.setItem(21, nada);
			maqs.setItem(22, nada);
			maqs.setItem(23, nada);
			maqs.setItem(24, nada);
			maqs.setItem(25, nada);
			maqs.setItem(26, nada);
			maqs.setItem(10, maq1);
			maqs.setItem(11, maq2);
			maqs.setItem(12, maq3);
			maqs.setItem(13, maq4);
			maqs.setItem(14, maq5);
			maqs.setItem(15, maq6);
			maqs.setItem(16, maq7);
			e.getWhoClicked().openInventory(maqs);
		}
		if (e.getCurrentItem().isSimilar(ant)) {
			e.setCancelled(true);
			e.getWhoClicked().sendMessage("§cNao existe uma pagina anterior");
		}
		if (e.getCurrentItem().isSimilar(prox)) {
			e.setCancelled(true);
			e.getWhoClicked().sendMessage("§cOutras paginas em breve...");
		}
		if (e.getCurrentItem().isSimilar(nada)) {
			e.setCancelled(true);
		}
		if (e.getCurrentItem().isSimilar(maq1)) {
			Player p = (Player) e.getWhoClicked();
			if (e.getInventory().getTitle().equals("§eMenu de maquinas")) {
				e.setCancelled(true);
				if (Main.economy.has(p, 10)) {
					Main.economy.withdrawPlayer(p, 10);
					p.getInventory().addItem(maq1);
					p.sendMessage("§aVoce comprou uma maquina do tipo §fMaquina De Ferro");
				} else {
					p.sendMessage("§cVoce precisa de §a$§f10.00 §cpara comprar esta maquina!");
				}
			}
		}
		if (e.getCurrentItem().isSimilar(maq2)) {
			Player p = (Player) e.getWhoClicked();
			if (e.getInventory().getTitle().equals("§eMenu de maquinas")) {
				e.setCancelled(true);
				if (Main.economy.has(p, 10)) {
					Main.economy.withdrawPlayer(p, 10);
					p.getInventory().addItem(maq2);
					p.sendMessage("§aVoce comprou uma maquina do tipo §cMaquina De Couro");
				} else {
					p.sendMessage("§cVoce precisa de §a$§f10.00 §cpara comprar esta maquina!");
				}
			}
		}
		if (e.getCurrentItem().isSimilar(maq3)) {
			Player p = (Player) e.getWhoClicked();
			if (e.getInventory().getTitle().equals("§eMenu de maquinas")) {
				e.setCancelled(true);
				if (Main.economy.has(p, 10)) {
					Main.economy.withdrawPlayer(p, 10);
					p.getInventory().addItem(maq3);
					p.sendMessage("§aVoce comprou uma maquina do tipo §bMaquina De Prismarinho");
				} else {
					p.sendMessage("§cVoce precisa de §a$§f10.00 §cpara comprar esta maquina!");
				}
			}
		}
		if (e.getCurrentItem().isSimilar(maq4)) {
			Player p = (Player) e.getWhoClicked();
			if (e.getInventory().getTitle().equals("§eMenu de maquinas")) {
				e.setCancelled(true);
				if (Main.economy.has(p, 10)) {
					Main.economy.withdrawPlayer(p, 10);
					p.getInventory().addItem(maq4);
					p.sendMessage("§aVoce comprou uma maquina do tipo §eMaquina De Estrela");
				} else {
					p.sendMessage("§cVoce precisa de §a$§f10.00 §cpara comprar esta maquina!");
				}
			}
		}
		if (e.getCurrentItem().isSimilar(maq5)) {
			Player p = (Player) e.getWhoClicked();
			if (e.getInventory().getTitle().equals("§eMenu de maquinas")) {
				e.setCancelled(true);
				if (Main.economy.has(p, 10)) {
					Main.economy.withdrawPlayer(p, 10);
					p.getInventory().addItem(maq5);
					p.sendMessage("§aVoce comprou uma maquina do tipo §aMaquina De Amoeba");
				} else {
					p.sendMessage("§cVoce precisa de §a$§f10.00 §cpara comprar esta maquina!");
				}
			}
		}
		if (e.getCurrentItem().isSimilar(maq6)) {
			Player p = (Player) e.getWhoClicked();
			if (e.getInventory().getTitle().equals("§eMenu de maquinas")) {
				e.setCancelled(true);
				if (Main.economy.has(p, 10)) {
					Main.economy.withdrawPlayer(p, 10);
					p.getInventory().addItem(maq6);
					p.sendMessage("§aVoce comprou uma maquina do tipo §6Maquina De Peixe");
				} else {
					p.sendMessage("§cVoce precisa de §a$§f10.00 §cpara comprar esta maquina!");
				}
			}
		}
		if (e.getCurrentItem().isSimilar(maq7)) {
			Player p = (Player) e.getWhoClicked();
			if (e.getInventory().getTitle().equals("§eMenu de maquinas")) {
				e.setCancelled(true);
				if (Main.economy.has(p, 10)) {
					Main.economy.withdrawPlayer(p, 10);
					p.getInventory().addItem(maq7);
					p.sendMessage("§aVoce comprou uma maquina do tipo §8Maquina De Combustivel");
				} else {
					p.sendMessage("§cVoce precisa de §a$§f10.00 §cpara comprar esta maquina!");
				}
			}
		}
		if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§8Combustiveis")) {
			e.setCancelled(true);
			Inventory combs = Bukkit.createInventory(null, 27, "§8Menu de combustiveis");
			combs.setItem(10, comb1);
			combs.setItem(11, comb2);
			combs.setItem(12, comb3);
			combs.setItem(13, comb4);
			combs.setItem(15, comb5);
			combs.setItem(16, comb6);
			e.getWhoClicked().openInventory(combs);
		}
	}
}