package com.mmc.tiktaktoe.abstraction;

import com.mmc.tiktaktoe.TicTacToeType;
import com.mmc.tiktaktoe.rules.Rule;

public interface Refeere {
	public interface OnWinListener {
		void onWin(TicTacToeType who);
	}

	void addRule(Rule rule);
	boolean isWin();
	String whoWon();
	void setOnWinListener(OnWinListener onWinListener);



}
