package com.mmc.tiktaktoe;

import com.mmc.tiktaktoe.rules.Rule;

public interface Refeere {
	void addRule(Rule rule);
	boolean isWin();
	String whoWon();
}
