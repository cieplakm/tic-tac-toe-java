package com.mmc.tiktaktoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
			
			
			
			if (movement.getMove() == TicTacToeType.X) {
				String answer;
				
				
				
				
				do {
					
					
					
					
					
			
					
					
					
					new Position(x,y);
					
					if( !board.getCells()[x][y].isUsed() ) {
						board.setTicX(x, y);
						break;
					}
					
				} while( board.getCells()[x][y].isUsed() );
				
				System.out.println("moved");
				movement.moved();
				
			}else {
				
				do {
					 x = (int) (Math.random()*3);
					 y = (int) (Math.random()*3);
					
					if( !board.getCells()[x][y].isUsed() ) {
						board.setTicO(x, y);
						break;
					}
					
				}while( board.getCells()[x][y].isUsed() );
				
				System.out.println("moved");
				movement.moved();
			}
			
			
			
			printer.print();
		}
		
		System.out.println("KONIEC!");
		
	}
	
	


}
