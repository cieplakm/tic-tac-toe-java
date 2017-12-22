package com.mmc.tiktaktoe;

import com.mmc.tiktaktoe.abstraction.Board;
import com.mmc.tiktaktoe.abstraction.Mover;
import com.mmc.tiktaktoe.abstraction.Position;
import com.mmc.tiktaktoe.abstraction.Refeere;

public class TicTacToeMover implements Mover{
	TicTacToeType actual;
	Board board;
	OnMoveListener onMoveListener;


	public TicTacToeMover(Board board) {
		actual = TicTacToeType.O;
		this.board =  board;
	}
	
	public void startFrom(TicTacToeType starter) {
		actual = starter;
	}

	@Override
	public void setOnMoveListener(OnMoveListener onMoveListener) {
        this.onMoveListener = onMoveListener;
    }

	public TicTacToeType getTurn() {
		
		if(actual == TicTacToeType.X) {
			return TicTacToeType.O;
		}else {
			return TicTacToeType.X;
		}
		
	}
	
	public boolean move(Position position) {
		boolean isRight = false;

		if(actual == TicTacToeType.X) {
			isRight = moveAsX(position);
		}else {
			isRight = moveAsO(position);
		}


		if (isRight) {
			changeTurn();
		}
		
		return isRight;
	}

	private boolean moveAsX(Position position) {
		if( !board.isFull() ) {
			return board.setTicX(position);
		}
		return false;
	}
	
	private boolean moveAsO(Position position) {
		if( !board.isFull() ) {
			return board.setTicO(position);
		}
		return false;
	}

	private void changeTurn() {

		if(actual == TicTacToeType.X) {
			actual = TicTacToeType.O;
		}else {
			actual = TicTacToeType.X;
		}

        if (onMoveListener != null)
            onMoveListener.onMove();

	}
	
}
