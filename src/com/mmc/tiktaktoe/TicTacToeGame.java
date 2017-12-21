package com.mmc.tiktaktoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.mmc.tiktaktoe.abstraction.Board;
import com.mmc.tiktaktoe.abstraction.Mover;
import com.mmc.tiktaktoe.abstraction.Position;
import com.mmc.tiktaktoe.abstraction.PostionProvider;
import com.mmc.tiktaktoe.abstraction.Printer;
import com.mmc.tiktaktoe.abstraction.Refeere;
import com.mmc.tiktaktoe.rules.DiagonalRule;
import com.mmc.tiktaktoe.rules.HorizontalRule;
import com.mmc.tiktaktoe.rules.VerticalRule;

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
	
	

	public static void main(String[] args) {
		
		while (true) {
			Board board = new TicTacToeBoard();
			
			Refeere refeere = new TicTacToeRefeere(board);
			refeere.addRule(new HorizontalRule());
			refeere.addRule(new VerticalRule());
			refeere.addRule(new DiagonalRule());

			refeere.setOnWinListener(new Refeere.OnWinListener() {
				@Override
				public void onWin(TicTacToeType who) {
					
				}
			});
			
			Printer printer = new TicTacToePrinter(board);
			
			PostionProvider human = new HummanProvider();
			
			PostionProvider computer = new PostionProvider() {
				@Override
				public Position getPosition() {
					 int x = (int) (Math.random()*3);
					 int y = (int) (Math.random()*3);
					return new CellPosition(x, y);
				}
			};
			
			Mover movement = new TicTacToeMover(board);
			
			


		}
		
	}
	
	

	
	
	




}
