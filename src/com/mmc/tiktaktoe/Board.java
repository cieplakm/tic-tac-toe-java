package com.mmc.tiktaktoe;

public interface Board {	
	Cell[][] getCells();
	boolean setTicX(int i, int k);
	boolean setTicO(int i, int k);
	boolean isFull();
}
