package br.com.commands;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import br.com.utils.ItemAPI;


public class ComandoMaquinas implements CommandExecutor{
	
	public ItemStack comb = ItemAPI.create("§8Combustiveis", Material.COAL, Arrays.asList("§7Categoria de combustiveis." + "\n" + "§7Clique aqui para acessar."));
	public ItemStack maq = ItemAPI.create("§eMaquinas", Material.ENDER_STONE, Arrays.asList("§7Categoria de maquinas."));
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lb, String[] args) {
		if(!(sender instanceof Player)) {
			sender.sendMessage("§4Voce nao pode executar comandos!");
			return true;
		}
		Player p = (Player)sender;
		if(cmd.getName().equalsIgnoreCase("maquinas")) {
			Inventory inv = Bukkit.createInventory(null, 27, "§eMaquinas §7- §8Combustiveis");
			inv.setItem(11, maq);
			inv.setItem(15, comb);
			p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
			p.openInventory(inv);
		}
		return false;
	}
}
