package com.mmc.tiktaktoe.abstraction;

public interface Board {	
	Cell[][] getCells();
	boolean isFull();
	Cell getCell(Position position);
	boolean setTicX(Position position);
	boolean setTicO(Position position);
}
