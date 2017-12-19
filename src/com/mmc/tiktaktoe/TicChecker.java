package com.mmc.tiktaktoe;

public class TicChecker implements Checker {

	public boolean checkWin(Board fieldManager) {
		Cell[][] tickArray = fieldManager.getTics();
		
		if (checkHorisontaly(tickArray)) return true;
		if (checkVertically(tickArray)) return true;
		if (checkCross(tickArray)) return true;
		
		return false;
	}

	private boolean checkCross(Cell[][] tickArray) {
		if(tickArray[0][0].getTicTakToe().equals(tickArray[1][1].getTicTakToe()) && tickArray[2][2].getTicTakToe().equals(tickArray[1][1].getTicTakToe())) {
			return true;
		}
		
		if(tickArray[0][2].getTicTakToe().equals(tickArray[1][1].getTicTakToe()) && tickArray[2][0].getTicTakToe().equals(tickArray[1][1].getTicTakToe())) {
			return true;
		}
		
		
		return false;
	}

	private boolean checkVertically(Cell[][] tickArray) {
		for (int i = 0; i < tickArray.length; i++) {
				
			if( tickArray[0][i].getTicTakToe().equals( tickArray[1][i] ) && tickArray[1][i].getTicTakToe().equals( tickArray[2][i].getTicTakToe() ) ) {
				return true;
			}
						
		}
		
		return false;
		
	}

	private boolean checkHorisontaly(Cell[][] tickArray) {
		for (Cell[] array : tickArray) {
			if( array[0].getTicTakToe().equals( array[1].getTicTakToe() )  &&  array[1].getTicTakToe().equals( array[2].getTicTakToe() ) ) {
				return true;
			}
		}
		
		return false;
	}

}
