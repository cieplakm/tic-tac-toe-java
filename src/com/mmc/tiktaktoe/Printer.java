package com.mmc.tiktaktoe;

public class Printer implements TicPrinter {
	Cell[][] ticksArray;
	
	public static final String divider = "|";
	
	public Printer(Cell[][] ticksArray) {
		this.ticksArray = ticksArray;
	}
	
	@Override
	public void print() {
		int i = 0;
		
		for (Cell[] ta : ticksArray) {
			
			int k = 0;
			for (Cell tic : ta ) {
				
				if (k < 3 && k > 0) System.out.print(divider);
				System.out.print(tic.getTicTakToe());
				k++;
			}
			
			if (i < 2) {
				System.out.println("");
				System.out.println("--+--+--");
			}
			
			i++;
		}
		
		System.out.println("");
		System.out.println("");
		
	}
	
//	System.out.println("11|12|13");
//	System.out.println("--+--+--");
//	System.out.println("21|22|23");
//	System.out.println("--+--+--");
//	System.out.println("31|32|33");
	
	
}
