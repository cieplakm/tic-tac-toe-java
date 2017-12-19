package com.mmc.tiktaktoe;

public class TicChecker implements Checker {

	public boolean checkWin(FieldManager fieldManager) {
		Tic[][] tickArray = fieldManager.getTics();
		
		if (checkHorisontaly(tickArray)) return true;
		if (checkVertically(tickArray)) return true;
		if (checkCross(tickArray)) return true;
		
		return false;
	}

	private boolean checkCross(Tic[][] tickArray) {
		if(tickArray[0][0].getTic().equals(tickArray[1][1].getTic()) && tickArray[2][2].getTic().equals(tickArray[1][1].getTic())) {
			return true;
		}
		
		if(tickArray[0][2].getTic().equals(tickArray[1][1].getTic()) && tickArray[2][0].getTic().equals(tickArray[1][1].getTic())) {
			return true;
		}
		
		
		return false;
	}

	private boolean checkVertically(Tic[][] tickArray) {
		for (int i = 0; i < tickArray.length; i++) {
				
			if( tickArray[0][i].getTic().equals( tickArray[1][i] ) && tickArray[1][i].getTic().equals( tickArray[2][i].getTic() ) ) {
				return true;
			}
						
		}
		
		return false;
		
	}

	private boolean checkHorisontaly(Tic[][] tickArray) {
		for (Tic[] array : tickArray) {
			if( array[0].getTic().equals( array[1].getTic() )  &&  array[1].getTic().equals( array[2].getTic() ) ) {
				return true;
			}
		}
		
		return false;
	}

}
