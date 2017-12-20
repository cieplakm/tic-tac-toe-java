package com.mmc.tiktaktoe;

import com.mmc.tiktaktoe.rules.DiagonalRule;
import com.mmc.tiktaktoe.rules.HorizontalRule;
import com.mmc.tiktaktoe.rules.VerticalRule;

public class TicTacToeGame {

	public static void main(String[] args) {
		Board board = new TicTacToeBoard();
		
		Printer printer = new TicPrinter(board.getCells());
		
		Refeere refeere = new TicRefeere(board.getCells());
		refeere.addRule(new HorizontalRule());
		refeere.addRule(new VerticalRule());
		refeere.addRule(new DiagonalRule());
			
		Movement movement = new Movement(TicTacToeType.X);	
			
		while(!board.isFull() && !refeere.isWin()) {
			System.out.println("is full : "+board.isFull());
			int y, x;
			
			if (movement.getMove() == TicTacToeType.X) {
		
				do {
					
					 x = (int) (Math.random()*3);
					 y = (int) (Math.random()*3);
					
					if( !board.getCells()[x][y].isUsed() ) {
						board.setTicX(x, y);
						break;
					}
					
				} while( board.getCells()[x][y].isUsed() );
				
				
				
				
			}else {
				
				do {
					 x = (int) (Math.random()*3);
					 y = (int) (Math.random()*3);
					
					if( !board.getCells()[x][y].isUsed() ) {
						board.setTicO(x, y);
						break;
					}
					
				}while( board.getCells()[x][y].isUsed() );
				
				
			}
			
			printer.print();
			
			
		}
		
	}

}
