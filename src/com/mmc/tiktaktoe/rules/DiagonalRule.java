package com.mmc.tiktaktoe.rules;

import com.mmc.tiktaktoe.abstraction.Cell;

public class DiagonalRule implements Rule {

	@Override
	public Cell qualify(Cell[][] tickArray) {
		if(tickArray[0][0].equals(tickArray[1][1]) && tickArray[2][2].equals(tickArray[1][1])) {
			System.out.println("Diagonal!");
			tickArray[0][0].setTakePartOfWon(true);
			tickArray[1][1].setTakePartOfWon(true);
			tickArray[2][2].setTakePartOfWon(true);
			return tickArray[0][0];
		}
		
		if(tickArray[0][2].equals(tickArray[1][1]) && tickArray[2][0].equals(tickArray[1][1])) {
			System.out.println("DiagonalRev!");
			tickArray[0][2].setTakePartOfWon(true);
			tickArray[1][1].setTakePartOfWon(true);
			tickArray[2][0].setTakePartOfWon(true);
			return tickArray[0][2];
		}
		
		
		return null;
	}

}
