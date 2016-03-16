package me.build.build;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class buildevent implements Listener{

	@EventHandler
	public void Break(BlockBreakEvent e) {
		e.setCancelled(true);
	}
	
	@EventHandler
	public void Place(BlockPlaceEvent e) {
		e.setCancelled(true);
	}
}
