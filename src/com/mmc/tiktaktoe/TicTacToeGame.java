package com.mmc.tiktaktoe;

public class TicTacToeGame {

	public static void main(String[] args) {
		Board fieldManager = new TicTacToeBoard();
		TicPrinter printer = new Printer(fieldManager.getTics());
		Checker checker = new TicChecker();
			
		

		
		
			printer.print();
			fieldManager.setTicO(0, 0);
			printer.print();
			fieldManager.setTicX(1, 0);
			printer.print();
			fieldManager.setTicO(1, 2);
			printer.print();
			
		
		
	}

}
