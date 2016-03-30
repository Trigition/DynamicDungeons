package com.SkyIsland.DynamicDungeons.Dungeon;

/**
 * This class represents the connection between 2 {@link DungeonNode} instances.
 * @author williamfong
 *
 */
public class DungeonEdge {
	
	private int edgeDistance;
	private DungeonNode v1;
	private DungeonNode v2;
	
	/**
	 * Creates an edge between vertex 1 to vertex 2
	 * @param vertex1
	 * @param vertex2
	 * @param distance
	 */
	public DungeonEdge(DungeonNode vertex1, DungeonNode vertex2, int distance) {
		this.v1 = vertex1;
		this.v2 = vertex2;
		
		this.edgeDistance = distance;
	}
	
}
