package com.mmc.tiktaktoe;

public class Printer implements TicPrinter {
	String divider = "|";
	public static void main(String[] args ) {
		TicPrinter tp = new Printer();
		tp.print(new IDontKnowNameOfClass().getTics());
	}

	public Printer() {
		
	}

	@Override
	public void print(Tic[][] ticksArray) {
		int i = 0;
		
		for (Tic[] ta : ticksArray) {
			
			int k = 0;
			for (Tic tic : ta ) {
				
				if (k < 3 && k > 0) System.out.print(divider);
				System.out.print(tic.getTic());
				k++;
			}
			
			if (i < 2) {
				System.out.println("");
				System.out.println("--+--+--");
			}
			
			i++;
		}
		
		
		
	}
	
//	System.out.println("11|12|13");
//	System.out.println("--+--+--");
//	System.out.println("21|22|23");
//	System.out.println("--+--+--");
//	System.out.println("31|32|33");
	
	
}
