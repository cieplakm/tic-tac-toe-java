package com.mmc.tiktaktoe.abstraction;

import com.mmc.tiktaktoe.TicTacToeType;
import com.mmc.tiktaktoe.rules.Rule;

public interface Refeere {

	interface OnWinListener{
		void onWin(Cell wonCell);
	}

	void addRule(Rule rule);
	boolean checkIfSomeoneWon();
	boolean isWon();
	int resultX();
	int resultO();
	void setOnWinListener(OnWinListener onWinListener);
	void reset();



}
