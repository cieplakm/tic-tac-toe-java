package com.mmc.tiktaktoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.mmc.tiktaktoe.rules.DiagonalRule;
import com.mmc.tiktaktoe.rules.HorizontalRule;
import com.mmc.tiktaktoe.rules.VerticalRule;

public class TicTacToeGame {
	Board board;
	Refeere refeere;
	Printer printer;
	PostionGetter postionGetter;
	Movement movement;
	
	TicTacToeGame(Board board, Refeere refeere, Printer printer, PostionGetter postionGetter){
		this.board = board;
		this.refeere = refeere;
		this.printer = printer;
		this.postionGetter = postionGetter;
		
		movement = new Movement(TicTacToeType.X);	
	}
	
	

	public static void main(String[] args) {
		
		while (true) {
			Board board = new TicTacToeBoard();
			
			Refeere refeere = new TicRefeere(board);
			refeere.addRule(new HorizontalRule());
			refeere.addRule(new VerticalRule());
			refeere.addRule(new DiagonalRule());
			
			Printer printer = new TicPrinter(board);
			
			PostionGetter postionGetter = new Positioner();
			
			TicTacToeGame tg = new TicTacToeGame(board, refeere, printer,  postionGetter);
			
			tg.startGame();
		}
		
	}
	
	
	public void startGame() {
		while(!board.isFull() && !refeere.isWin()) {
					
			if (movement.getMove() == TicTacToeType.X) {
				moveX();
			}else {
				moveO();
			}
			
			printer.print();
				
		}
				
				
		System.out.println("KONIEC!");
	}

	private void moveO() {
		Position position;
		int x;
		int y;
		do {
			 x = (int) (Math.random()*3);
			 y = (int) (Math.random()*3);
			 
			 position = new CellPosition(x,y);
			
			if( !board.getCell(position).isUsed() ) {
				board.setTicO(position);
				break;
			}
			
		}while( board.getCell(position).isUsed() );
		
		movement.moved();
		
	}

	private void moveX() {
		Position position;
		do {
			position = postionGetter.getPosition();
			
			if(!board.getCell(position).isUsed()) {
				board.setTicX(position);
				break;
			}
			
		} while( board.getCell(position).isUsed() );
		
		
		movement.moved();
		
	}
	
	
	
	
	


}
