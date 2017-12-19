package com.mmc.tiktaktoe;

public class TickImpl implements Tic{
	String choosedSign; // "x" or "o"
	boolean used;
	
	@Override
	public String getTic() {
		return choosedSign;
	}

	@Override
	public void setTic(String tic) {
		choosedSign = tic;
		
	}
	
}
