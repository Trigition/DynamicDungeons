package com.SkyIsland.DynamicDungeons;

import java.io.File;

import org.bukkit.plugin.java.JavaPlugin;

public class DynamicDungeonsPlugin extends JavaPlugin {
	private static String DynamicDungeonConfig = "DyDu.config";
	public static DynamicDungeonsPlugin DyDuPlugin;
	
	@Override
	public void onLoad() {
		DynamicDungeonsPlugin.DyDuPlugin = this;
		// Ensure proper directories are constructed before plugin is loaded
		if (!getDataFolder().exists()) {
			getDataFolder().mkdirs();
			getLogger().warning("No Data Folder found, creating...");
		}
		
		
	}
}
