package br.com.listeners;

import java.util.Arrays;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

import com.gmail.filoghost.holograms.api.HolographicDisplaysAPI;

import br.com.utils.ItemAPI;
import br.com.ydoom.Main;

@SuppressWarnings("deprecation")
public class EventoColocarMaquina implements Listener {

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
	public void aoColocar(BlockPlaceEvent e) {
		Player p = e.getPlayer();
		if (p.getItemInHand().hasItemMeta()) {
			if (p.getItemInHand().getItemMeta().hasDisplayName()) {
				if (p.getItemInHand().getItemMeta().getDisplayName().equals("§fMaquina De Ferro")) {
					p.getInventory().remove(maq1);
					p.sendMessage("§eVoce colocou uma maquina do tipo §fMaquina De Ferro §eno chao!");
					Location l = e.getBlockPlaced().getLocation();
					HolographicDisplaysAPI.createHologram(Main.plugin, l.clone().add(0.5, 2.3, 0.5), "§eMaquina: §fFerro",
							"§eDono: §f" + p.getName(), "§eTempo §fnull", "§eCusto: §a$§f10.00");
				}
				if (p.getItemInHand().getItemMeta().getDisplayName().equals("§cMaquina De Couro")) {
					p.getInventory().remove(maq2);
					p.sendMessage("§eVoce colocou uma maquina do tipo §cMaquina De Ferro §eno chao!");
					Location l = e.getBlockPlaced().getLocation();
					HolographicDisplaysAPI.createHologram(Main.plugin, l.clone().add(0.5, 2.3, 0.5), "§eMaquina: §cCouro",
							"§eDono: §f" + p.getName(), "§eTempo §fnull", "§eCusto: §a$§f10.00");
				}
				if (p.getItemInHand().getItemMeta().getDisplayName().equals("§bMaquina De Prismarinho")) {
					p.getInventory().remove(maq3);
					p.sendMessage("§eVoce colocou uma maquina do tipo §bMaquina De Prismarinho §eno chao!");
					Location l = e.getBlockPlaced().getLocation();
					HolographicDisplaysAPI.createHologram(Main.plugin, l.clone().add(0.5, 2.3, 0.5), "§eMaquina: §bPrismarinho",
							"§eDono: §f" + p.getName(), "§eTempo §fnull", "§eCusto: §a$§f10.00");
				}
				if (p.getItemInHand().getItemMeta().getDisplayName().equals("§eMaquina De Estrela")) {
					p.getInventory().remove(maq4);
					p.sendMessage("§eVoce colocou uma maquina do tipo §eMaquina De Estrela §eno chao!");
					Location l = e.getBlockPlaced().getLocation();
					HolographicDisplaysAPI.createHologram(Main.plugin, l.clone().add(0.5, 2.3, 0.5), "§eMaquina: §eEstrela",
							"§eDono: §f" + p.getName(), "§eTempo §fnull", "§eCusto: §a$§f10.00");
				}
				if (p.getItemInHand().getItemMeta().getDisplayName().equals("§aMaquina De Amoeba")) {
					p.getInventory().remove(maq5);
					p.sendMessage("§eVoce colocou uma maquina do tipo §aMaquina De Amoeba §eno chao!");
					Location l = e.getBlockPlaced().getLocation();
					HolographicDisplaysAPI.createHologram(Main.plugin, l.clone().add(0.5, 2.3, 0.5), "§eMaquina: §aAmoeba",
							"§eDono: §f" + p.getName(), "§eTempo §fnull", "§eCusto: §a$§f10.00");
				}
				if (p.getItemInHand().getItemMeta().getDisplayName().equals("§6Maquina De Peixe")) {
					p.getInventory().remove(maq6);
					p.sendMessage("§eVoce colocou uma maquina do tipo §6Maquina De Peixe §eno chao!");
					Location l = e.getBlockPlaced().getLocation();
					HolographicDisplaysAPI.createHologram(Main.plugin, l.clone().add(0.5, 2.3, 0.5), "§eMaquina: §6Peixe",
							"§eDono: §f" + p.getName(), "§eTempo §fnull", "§eCusto: §a$§f10.00");
				}
				if (p.getItemInHand().getItemMeta().getDisplayName().equals("§8Maquina De Combustivel")) {
					p.getInventory().remove(maq7);
					p.sendMessage("§eVoce colocou uma maquina do tipo §8Maquina De Combustivel §eno chao!");
					Location l = e.getBlockPlaced().getLocation();
					HolographicDisplaysAPI.createHologram(Main.plugin, l.clone().add(0.5, 2.3, 0.5), "§eMaquina: §8Combustivel",
							"§eDono: §f" + p.getName(), "§eTempo §fnull", "§eCusto: §a$§f10.00");
				}
			}
		}
	}

}
