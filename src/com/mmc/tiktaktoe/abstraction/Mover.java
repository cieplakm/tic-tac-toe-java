package com.mmc.tiktaktoe.abstraction;

import com.mmc.tiktaktoe.TicTacToeType;

public interface Mover {
	interface OnMoveListener{
		void onMove();
	}

	boolean move(Position position);
	TicTacToeType getTurn();
	void startFrom(TicTacToeType starter);
	void setOnMoveListener(OnMoveListener onMoveListener);
}
