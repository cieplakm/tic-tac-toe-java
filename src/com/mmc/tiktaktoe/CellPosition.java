package com.mmc.tiktaktoe;

import com.mmc.tiktaktoe.abstraction.Position;

public class CellPosition implements Position {
	int[] data;


	public CellPosition(int i, int k) {
		data = new int[2];
		data[0] = i;
		data[1] = k;
	}


	@Override
	public int row() {
		return data[0];
	}


	@Override
	public int col() {
		return data[1];
	}
	

}
