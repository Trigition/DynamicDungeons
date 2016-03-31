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
			if (args.length < 1) {
				return false;
			}
			
			// Player should be OP/Admin
			if (!sender.isOp()) {
				return false;
			}
		}
		return false;
	}

}
