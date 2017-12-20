package com.mmc.tiktaktoe;

public interface Cell {
	boolean isUsed();
	boolean isX();
	boolean isO();
	boolean setAsX();
	boolean setAsO();
	String getType();
	
}
