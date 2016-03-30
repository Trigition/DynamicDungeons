package com.SkyIsland.DynamicDungeons.Voxel;

/**
 * This class represents a base block unit of a {@link DungeonNode} <br />
 * and is used for structural representation and construction.
 * @author williamfong
 *
 */
public class Voxel {
	
	private int voxel_X;
	private int voxel_Y;
	private int voxel_Z;
	
	private Voxel prev_Voxel;
	
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
	public Voxel(Voxel v, int rel_x, int rel_y, int rel_z) {
		this.voxel_X = v.getVoxel_X() + rel_x;
		this.voxel_Y = v.getVoxel_Y() + rel_y;
		this.voxel_Z = v.getVoxel_Z() + rel_z;
		
		this.prev_Voxel = v;
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
