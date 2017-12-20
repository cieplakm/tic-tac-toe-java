package com.mmc.tiktaktoe;

public class Movement {
	TicTacToeType actual;
	public Movement(TicTacToeType beginer) {
		actual = beginer;
	}
	
	public TicTacToeType getMove() {
		
		if(actual == TicTacToeType.X) {
			actual = TicTacToeType.O;
			return TicTacToeType.O;
		}else {
			actual = TicTacToeType.X;
			return TicTacToeType.X;
		}
		
	}
	
}
