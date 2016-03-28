package com.SkyIsland.Dungeon;

import java.util.ArrayList;
import java.util.List;

public abstract class DungeonNode {

	private List<Goal> NodeGoals;
	
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
