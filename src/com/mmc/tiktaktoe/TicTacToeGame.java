package com.mmc.tiktaktoe;

import com.mmc.tiktaktoe.abstraction.Board;
import com.mmc.tiktaktoe.abstraction.Mover;
import com.mmc.tiktaktoe.abstraction.PostionProvider;
import com.mmc.tiktaktoe.abstraction.Printer;
import com.mmc.tiktaktoe.abstraction.Refeere;


public class TicTacToeGame {
	Board board;
	Refeere refeere;
	Printer printer;
	PostionProvider postionGetterO;
	PostionProvider postionGetterX;
	Mover mover;
	
	public TicTacToeGame(Board board, Refeere refeere, 
			Printer printer, 
			PostionProvider postionGetterX, 
			PostionProvider postionGetterO, 
			Mover movement){
		this.board = board;
		this.refeere = refeere;
		this.printer = printer;
		this.postionGetterX = postionGetterX;
		this.postionGetterO = postionGetterO;
		this.mover = movement;
		
	}

//	public static void main(String[] args) {
//
//		while (true) {
//			Board board = new TicTacToeBoard();
//
//			Refeere refeere = new TicTacToeRefeere(board);
//			Printer printer = new TicTacToePrinter(board);
//			PostionProvider human = new HummanProvider();
//
//			Mover mover = new TicTacToeMover(board);
//			mover.setOnMoveListener(()->{
//				//check if someone won
//				if (refeere.checkIfSomeoneWon()){
//					//inform about someone won!
//				}
//
//			});
//
//			refeere.addRule(new HorizontalRule());
//			refeere.addRule(new VerticalRule());
//			refeere.addRule(new DiagonalRule());
//
//		}
//
//	}
	
	

	
	
	




}
