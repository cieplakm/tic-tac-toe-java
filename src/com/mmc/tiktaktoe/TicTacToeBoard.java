package com.mmc.tiktaktoe;

import com.mmc.tiktaktoe.abstraction.Board;
import com.mmc.tiktaktoe.abstraction.Cell;
import com.mmc.tiktaktoe.abstraction.Position;

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
	public boolean isFull() {
		for (Cell[] celllist : cells) {
		
			for (Cell cell : celllist) {
				if ( !cell.isUsed() ) return false;
			}
			
		}
		
		return true;
	}

	@Override
	public Cell getCell(Position position) {
		return cells[position.row()][position.col()];
		
	}

	@Override
	public boolean setTicX(Position position) {
		return cells[position.row()][position.col()].setAsX();
	}

	@Override
	public boolean setTicO(Position position) {
		return cells[position.row()][position.col()].setAsO();
	}
	
}
