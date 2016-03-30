package com.SkyIsland.DynamicDungeons.Dungeon;

import java.util.ArrayList;
import java.util.List;

import com.SkyIsland.DynamicDungeons.Voxel.Voxel;

public abstract class DungeonNode {

	private List<Goal> NodeGoals;
	private List<Voxel> NodeVoxels;
	
	public DungeonNode() {
		this.NodeGoals = new ArrayList<Goal>();
	}
	
	/**
	 * This method constructs the Node (Physically)
	 * @return
	 */
	public int construct() {
		//We essentially want to do this, but more intricate
		//than linear builds
		/**for (Goal g : this.NodeGoals) {
			g.construct();
		}**/
		return 0;
	}
	
	
}
