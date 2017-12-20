package com.mmc.tiktaktoe;

public class TicTacToeBoard implements Board {
	Cell[][] cells;
	
	public TicTacToeBoard() {
		createFields();
	}

	private void createFields() {
		cells = new TicTacToeCell[3][];
		
		for (int i = 0; i < 3; i++) {
			cells[i] = new TicTacToeCell[3];
			
			for (int k = 0; k < 3; k++) {
				TicTacToeCell cell = new TicTacToeCell();
				cells[i][k] = cell;
			}
		}
	}
	
	@Override
	public Cell[][] getCells() {
		return cells;
	}

	@Override
	public boolean setTicX(int i, int k) {
		return cells[i][k].setAsX();
	}

	@Override
	public boolean setTicO(int i, int k) {
		return cells[i][k].setAsO();
	}

	@Override
	public boolean isFull() {
		for (Cell[] celllist : cells) {
		
			for (Cell cell : celllist) {
				if ( !cell.isUsed() ) return false;
			}
			
		}
		
		
		return true;
	}
	
}
