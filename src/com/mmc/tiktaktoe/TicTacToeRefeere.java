package com.mmc.tiktaktoe;


import java.util.ArrayList;
import java.util.List;

import com.mmc.tiktaktoe.abstraction.Board;
import com.mmc.tiktaktoe.abstraction.Cell;
import com.mmc.tiktaktoe.abstraction.Refeere;
import com.mmc.tiktaktoe.rules.Rule;

public class TicTacToeRefeere implements Refeere {
	private List<Rule> rules;
	private Cell[][] cells;
	private OnWinListener onWinListener;

	public TicTacToeRefeere(Board board) {
		this.cells = board.getCells();
		rules = new ArrayList<>();
	}

	@Override
	public void addRule(Rule rule) {
		rules.add(rule);
	}

	@Override
	public boolean isWin() {
		
		for (Rule rule : rules) {
			Cell wonCell = rule.qualify(cells);
			
			if(  wonCell != null) {
				
				System.out.println("WIN! " + wonCell.getType() + "!");
				return true;
			}
		}
		
		return false;
	}

	@Override
	public String whoWon() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setOnWinListener(OnWinListener onWinListener) {
		this.onWinListener = onWinListener;
	}


}
