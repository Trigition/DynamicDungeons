package com.SkyIsland.DynamicDungeons.Voxel;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;

/**
 * This class represents a base block unit of a {@link DungeonNode} <br />
 * and is used for structural representation and construction.
 * @author williamfong
 *
 */
public class Voxel {
	
	private static final int max_X = 5;
	private static final int max_Y = 5;
	private static final int max_z = 5;
	
	private int voxel_X;
	private int voxel_Y;
	private int voxel_Z;
	
	private Voxel prev_Voxel;
	private World world;
	private Location vLocation;
	
	
	/**
	 * This constructor creates a {@link Voxel} instance at 0,0,0. This is the base voxel <br />
	 * of a single Dungeon Instance
	 */
	public Voxel() {
		this.voxel_X = 0;
		this.voxel_Y = 0;
		this.voxel_Z = 0;
		
		this.prev_Voxel = null;
	}
	
	/**
	 * This constructor creates a {@link Voxel} instance at a relative distance from the <br />
	 * base {@link Voxel}.
	 * @param v The base {@link Voxel} that provides the base coordinate.
	 * @param rel_x The relative x coordinate from the base.
	 * @param rel_y The relative y coordinate from the base.
	 * @param rel_z The relative z coordinate from the base.
	 */
	public Voxel(Voxel v, World w, int rel_x, int rel_y, int rel_z) {
		this.voxel_X = v.getVoxel_X() + rel_x;
		this.voxel_Y = v.getVoxel_Y() + rel_y;
		this.voxel_Z = v.getVoxel_Z() + rel_z;
		
		this.prev_Voxel = v;
		
		this.world = w;
		this.vLocation = new Location(w, this.voxel_X, this.voxel_Y, this.voxel_Z);
	}
	
	public void construct() {
		Chunk buildChunk = this.vLocation.getChunk();
		Block block;
		// Build in order of ZXY
		for (int x = 0; x < max_X; x++) {
			for (int y = 0; y < max_Y; y++) {
				for (int z = 0; z < max_z; z++) {
					//TODO construct block with specified material
					block = buildChunk.getBlock(x, y, z);
					block.setType(Material.WOOL);
				}
			}
		}
	}
	
	// Getters
	
	/**
	 * @return the voxel_X
	 */
	public int getVoxel_X() {
		return voxel_X;
	}

	/**
	 * @return the voxel_Y
	 */
	public int getVoxel_Y() {
		return voxel_Y;
	}

	/**
	 * @return the voxel_Z
	 */
	public int getVoxel_Z() {
		return voxel_Z;
	}

	/**
	 * @return the prev_Voxel
	 */
	public Voxel getPrev_Voxel() {
		return prev_Voxel;
	}
	
	
}
