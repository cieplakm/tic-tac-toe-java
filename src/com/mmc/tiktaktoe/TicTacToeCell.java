package com.mmc.tiktaktoe;

public class TicTacToeCell implements Cell{
	String ticTacToe; // "x" or "o"
	boolean used;
	
	@Override
	public String getTicTakToe() {
		return ticTacToe;
	}

	@Override
	public void setCellAs(String tic) {
		ticTacToe = tic;
		
	}
	
}
