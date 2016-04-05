package com.SkyIsland.DynamicDungeons.Dungeon;

import java.util.ArrayList;
import java.util.List;

public abstract class DungeonNode {

	private List<Goal> nodeGoals;
	
	public DungeonNode() {
		this.nodeGoals = new ArrayList<Goal>();
	}
	
	public void addGoals(List<Goal> goals) {
		this.nodeGoals.addAll(goals);
	}
	
	public void addGoals(Goal...goal) {
		this.nodeGoals.addAll(nodeGoals);
	}
	
	/**
	 * This method constructs the Node (Physically)
	 * @return
	 */
	public int construct() {
		// We need to determine what requirements have been specified by the "Goal"
		return 0;
	}
}
