package com.mmc.tiktaktoe;

public class TicTacToeBoard implements Board {
	Cell[][] fields;
	
	public TicTacToeBoard() {
		createFields();
	}

	private void createFields() {
		fields = new TicTacToeCell[3][];
		
		for (int i = 0; i < 3; i++) {
			fields[i] = new TicTacToeCell[3];
			
			for (int k = 0; k < 3; k++) {
				TicTacToeCell field = new TicTacToeCell();
				field.setCellAs((i+1) + "" + (k+1));
				fields[i][k] = field;
			}
			
		}
		
	}
	

	@Override
	public Cell[][] getTics() {
		return fields;
	}

	@Override
	public boolean setTicX(int i, int k) {
		if (!fields[i][k].isUsed()) {
			fields[i][k].setCellAs("x");
			return true;
		}
		return false;
	}

	@Override
	public boolean setTicO(int i, int k) {
		if (!fields[i][k].isUsed()) {
			fields[i][k].setCellAs("o");
			return true;
		}
		return false;
	}
	
}
