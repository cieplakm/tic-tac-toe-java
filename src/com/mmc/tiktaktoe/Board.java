package com.mmc.tiktaktoe;

public interface Board {	
	Cell[][] getCells();
	boolean isFull();
	Cell getCell(Position position);
	boolean setTicX(Position position);
	boolean setTicO(Position position);
}
