package com.mmc.tiktaktoe.rules;

import com.mmc.tiktaktoe.abstraction.Cell;

public class VerticalRule implements Rule {

	@Override
	public Cell qualify(Cell[][] tickArray) {
		for (int i = 0; i < tickArray.length; i++) {
			
			if( tickArray[0][i].equals( tickArray[1][i] ) && tickArray[1][i].equals( tickArray[2][i] ) ) {
				System.out.println("Vertical!");
				tickArray[0][i].setTakePartOfWon(true);
				tickArray[1][i].setTakePartOfWon(true);
				tickArray[2][i].setTakePartOfWon(true);
				return tickArray[0][i];
			}
						
		}
		
		return null;
	}

}
