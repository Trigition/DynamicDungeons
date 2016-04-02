/**
 * 
 */
package com.SkyIsland.DynamicDungeons.IO;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.SkyIsland.DynamicDungeons.DynamicDungeonsPlugin;

/**
 * @author williamfong
 *
 */
public class PluginCommands implements CommandExecutor {

	public static final String baseCom = "dd";
	
	public PluginCommands() {
		DynamicDungeonsPlugin.DyDuPlugin.getCommand(baseCom).setExecutor(this);
		DynamicDungeonsPlugin.DyDuPlugin.getCommand(baseCom).setTabCompleter(null);
	}
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (command.getName().equalsIgnoreCase("dd")) {
			// Check arg length and if the player is OP
			if (args.length < 1 || !sender.isOp()) {
				return false;
			}
			
			String subCmd = args[0];
			if (subCmd.equalsIgnoreCase("load")) {
				// Load Dungeon into memory
			}
			
			if (subCmd.equalsIgnoreCase("deploy")) {
				// Builds the dungeon
			}
			
			if (subCmd.equalsIgnoreCase("undo")) {
				// Deconstructs the previous dungeon
			}
		}
		return false;
	}

}
