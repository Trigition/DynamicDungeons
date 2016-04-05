package com.SkyIsland.DynamicDungeons.Dungeon;

/**
 * This class represents the connection between 2 {@link DungeonNode} instances.
 * @author williamfong
 *
 */
public abstract class DungeonEdge {
	
	private int edgeDistance;
	private DungeonNode source;
	private DungeonNode destination;
	
	/**
	 * Creates an edge between vertex 1 to vertex 2
	 * @param vertex1
	 * @param vertex2
	 * @param distance
	 */
	public DungeonEdge(DungeonNode src, DungeonNode dst, int distance) {
		this.source = src;
		this.destination = dst;
		this.edgeDistance = distance;
	}
}
