package com.mmc.tiktaktoe;

public interface Board {	
	Cell[][] getTics();
	boolean setTicX(int i, int k);
	boolean setTicO(int i, int k);
}
