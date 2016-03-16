package me.build;

import me.build.build.buildevent;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

	public void onEnable() {
		PluginManager pm = Bukkit.getPluginManager();
		
		pm.registerEvents(new buildevent(), this);
		
		
		
	}
	
}
