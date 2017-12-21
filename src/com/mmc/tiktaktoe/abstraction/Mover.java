package com.mmc.tiktaktoe.abstraction;

import com.mmc.tiktaktoe.TicTacToeType;

public interface Mover {
	boolean move(Position position);
	TicTacToeType getTurn();
	void startFrom(TicTacToeType starter);
}
