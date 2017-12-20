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
	PostionGetter postionGetterO;
	PostionGetter postionGetterX;
	Movement movement;
	
	TicTacToeGame(Board board, Refeere refeere, Printer printer, PostionGetter postionGetterX, PostionGetter postionGetterO){
		this.board = board;
		this.refeere = refeere;
		this.printer = printer;
		this.postionGetterX = postionGetterX;
		this.postionGetterO = postionGetterO;
		
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
			
			PostionGetter humanGetter = new Positioner();
			
			PostionGetter cpomuter = new PostionGetter() {
				
				@Override
				public Position getPosition() {
					 int x = (int) (Math.random()*3);
					 int y = (int) (Math.random()*3);
					return new CellPosition(x, y);
				}
			};
			
			TicTacToeGame tg = new TicTacToeGame(board, refeere, printer,  humanGetter, cpomuter);
			
			tg.startGame();
		}
		
	}
	
	
	public void startGame() {
		while(!refeere.isWin() &&!board.isFull()  ) {
					
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
		
		do {
			 position = postionGetterO.getPosition();
			
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
			position = postionGetterX.getPosition();
			
			if(!board.getCell(position).isUsed()) {
				board.setTicX(position);
				break;
			}
			
		} while( board.getCell(position).isUsed() );
		
		
		movement.moved();
		
	}
	
	
	
	
	


}
