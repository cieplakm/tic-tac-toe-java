package com.mmc.tiktaktoe.abstraction;

public interface Cell {
	boolean isUsed();
	boolean isX();
	boolean isO();
	boolean setAsX();
	boolean setAsO();
	String getType();
	
}
