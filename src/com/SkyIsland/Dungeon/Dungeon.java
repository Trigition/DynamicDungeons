/**
 * 
 */
package com.SkyIsland.Dungeon;

import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;

/**
 * @author williamfong
 *
 */
public class Dungeon {
	private DirectedGraph<DungeonNode, DungeonEdge> DungeonGraph;
	
	public Dungeon() {
		this.DungeonGraph = new DefaultDirectedGraph<DungeonNode, DungeonEdge>(DungeonEdge.class);
	}
}
