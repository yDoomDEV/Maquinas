package br.com.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import br.com.utils.MySQL;

public class EventoMySQL implements Listener{
	
	@EventHandler
	public void event(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		if(MySQL.hasJogador(p)) {
			MySQL.addJogador(p);
		}
	}

}
