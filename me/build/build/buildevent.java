package me.build.build;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class buildevent implements Listener{

	@EventHandler
	public void Break(BlockBreakEvent e) {
		Player p = e.getPlayer();
		if(build.Build.contains(p)) {
			
			
		} else {
			e.setCancelled(true);
		}
	}
	
	@EventHandler
	public void Place(BlockPlaceEvent e) {
		Player p = e.getPlayer();
		if(build.Build.contains(p)) {
			
			
		} else {
			e.setCancelled(true);
		}
	}
}
