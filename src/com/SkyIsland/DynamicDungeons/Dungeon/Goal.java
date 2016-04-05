package com.SkyIsland.DynamicDungeons.Dungeon;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.inventory.ItemStack;

/**
 * This class represents a "Goal" that must be completed in some way <br />
 * in order for the Player to proceed through the Dungeon.
 * @author williamfong
 *
 */
public abstract class Goal {
	
	private List<ItemStack> itemKeys;
	private List<Puzzle> puzzels;
	
	/**
	 * This is the main constructor for the Goal. It is empty (and thus will be an empty room)
	 */
	public Goal() {
		this.itemKeys = new ArrayList<ItemStack>();
		this.puzzels = new ArrayList<Puzzle>();
	}
	
	public Goal(List<ItemStack> keys, List<Puzzle> puzzels) {
		this.itemKeys = keys;
		this.puzzels = puzzels;
	}
	
	public void addKeys(List<ItemStack> keys) {
		this.itemKeys.addAll(keys);
	}
	
	public void addKeys(ItemStack...key) {
		this.itemKeys.addAll(itemKeys);
	}
	
	public void addPuzzle(List<Puzzle> puzzels) {
		this.itemKeys.addAll(itemKeys);
	}
	
	public void addPuzzle(Puzzle...puzzle) {
		this.puzzels.addAll(puzzels);
	}
}
