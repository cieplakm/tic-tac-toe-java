package com.mmc.tiktaktoe;


import java.util.ArrayList;
import java.util.List;
import com.mmc.tiktaktoe.abstraction.Board;
import com.mmc.tiktaktoe.abstraction.Cell;
import com.mmc.tiktaktoe.abstraction.Refeere;
import com.mmc.tiktaktoe.rules.Rule;

public class TicTacToeRefeere implements Refeere {
	private List<Rule> rules;
	private Board board;
	private int xResult;
	private int oResult;
	private OnWinListener onWinListener;
	private boolean won;

	public TicTacToeRefeere(Board board) {
		this.board = board;

		rules = new ArrayList<>();
	}

	@Override
	public void addRule(Rule rule) {
		rules.add(rule);
	}

	@Override
	public boolean checkIfSomeoneWon() {
		
		for (Rule rule : rules) {
			Cell wonCell = rule.qualify(board.getCells());
			
			if(  wonCell != null ) {
				win(wonCell);
				return true;
			}
		}
		
		return false;
	}

	@Override
	public boolean isWon() {
		return won;
	}

	private void win(Cell wonCell) {

		if (wonCell.isO()){
			incrementO();
		}else{
			incrementX();
		}

		won = true;

		if (onWinListener != null){
			onWinListener.onWin(wonCell);
		}

	}

	private void incrementX(){
		xResult++;
	}

	private void incrementO(){
		oResult++;
	}


	@Override
	public int resultX() {
		return xResult;
	}

	@Override
	public int resultO() {
		return oResult;
	}

	@Override
	public void setOnWinListener(OnWinListener onWinListener) {
		this.onWinListener = onWinListener;
	}

	@Override
	public void reset() {
		won = false;
	}


}
