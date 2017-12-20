package com.mmc.tiktaktoe;

public class TicPrinter implements Printer {
	Cell[][] ticksArray;
	
	public static final String divider = "|";
	
	public TicPrinter(Cell[][] ticksArray) {
		this.ticksArray = ticksArray;
	}
	
	@Override
	public void print() {
		int i = 0;
		
		for (Cell[] ta : ticksArray) {
			
			int k = 0;
			for (Cell tic : ta ) {
				
				if (k < 3 && k > 0) System.out.print(divider);
				
				if (tic.isUsed()) {
					System.out.print(tic.getType());
				}else {
					System.out.print(""+i+k);
				}
				
				k++;
			}
			
			if (i < 2) {
				System.out.println("");
				System.out.println("-+-+-");
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
