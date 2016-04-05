/**
 * 
 */
package com.SkyIsland.DynamicDungeons.Dungeon;

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
	
	public boolean addNode(DungeonNode dn) {
		this.DungeonGraph.addVertex(dn);
		return false;
	}
	
	public DungeonEdge connectNodes(DungeonNode from, DungeonNode to) {
		return this.DungeonGraph.addEdge(from, to);
	}
}