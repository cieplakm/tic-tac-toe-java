package com.mmc.tiktaktoe;

public class Movement {
	TicTacToeType actual;
	public Movement(TicTacToeType beginer) {
		actual = beginer;
	}
	
	public TicTacToeType getMove() {
		
		if(actual == TicTacToeType.X) {
			
			return TicTacToeType.O;
		}else {
			
			return TicTacToeType.X;
		}
		
	}
	
	public void moved() {
		if(actual == TicTacToeType.X) {
			actual = TicTacToeType.O;
			
		}else {
			actual = TicTacToeType.X;
			
		}
	}
	
}
