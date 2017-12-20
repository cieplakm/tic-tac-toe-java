package com.mmc.tiktaktoe.rules;

import com.mmc.tiktaktoe.Cell;

public class DiagonalRule implements Rule {

	@Override
	public Cell qualify(Cell[][] tickArray) {
		if(tickArray[0][0].equals(tickArray[1][1]) && tickArray[2][2].equals(tickArray[1][1])) {
			System.out.println("Diagonal!");
			return tickArray[0][0];
		}
		
		if(tickArray[0][2].equals(tickArray[1][1]) && tickArray[2][0].equals(tickArray[1][1])) {
			System.out.println("DiagonalRev!");
			return tickArray[0][2];
		}
		
		
		return null;
	}

}
