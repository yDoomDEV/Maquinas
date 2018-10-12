package br.com.ydoom;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_8_R3.command.ColouredConsoleSender;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import br.com.commands.ComandoMaquinas;
import br.com.listeners.EventoClickMenu;
import br.com.listeners.EventoColocarMaquina;
import br.com.listeners.EventoMySQL;
import br.com.utils.MySQL;
import net.milkbowl.vault.chat.Chat;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.permission.Permission;

public class Main extends JavaPlugin{
	
	public static Main plugin;
	
	public static Permission permission = null;
    public static Economy economy = null;
    public static Chat chat = null;
    
	
	ColouredConsoleSender console = (ColouredConsoleSender) Bukkit.getConsoleSender();
	
	
	public void onEnable() {
		registrarEventos();
		registrarComandos();
		setupPermissions();
		setupChat();
		setupEconomy();
		MySQL.criarTabela();
		plugin = this;
		console.sendMessage("§aPlugin ligado com sucesso!");
	}
	public void onDisable() {
		console.sendMessage("§cPlugin desligado com sucesso!");
	}
	public void registrarEventos() {
		getServer().getPluginManager().registerEvents(new EventoClickMenu(), this);
		getServer().getPluginManager().registerEvents(new EventoColocarMaquina(), this);
		getServer().getPluginManager().registerEvents(new EventoMySQL(), this);
	}
	public void registrarComandos() {
		getCommand("maquinas").setExecutor(new ComandoMaquinas());
	}
	 private boolean setupPermissions()
	    {
	        RegisteredServiceProvider<Permission> permissionProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.permission.Permission.class);
	        if (permissionProvider != null) {
	            permission = permissionProvider.getProvider();
	        }
	        return (permission != null);
	    }

	    private boolean setupChat()
	    {
	        RegisteredServiceProvider<Chat> chatProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.chat.Chat.class);
	        if (chatProvider != null) {
	            chat = chatProvider.getProvider();
	        }

	        return (chat != null);
	    }

	    private boolean setupEconomy()
	    {
	        RegisteredServiceProvider<Economy> economyProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.economy.Economy.class);
	        if (economyProvider != null) {
	            economy = economyProvider.getProvider();
	        }

	        return (economy != null);
	    }

}
