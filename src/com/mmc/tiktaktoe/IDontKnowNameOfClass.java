package com.mmc.tiktaktoe;

public class IDontKnowNameOfClass {
	Field[][] fields;
	
	public IDontKnowNameOfClass() {
		createFields();
		
	}

	private void createFields() {
		fields = new Field[3][];
		
		for (int i = 0; i < 3; i++) {
			fields[i] = new Field[3];
			
			for (int k = 0; k < 3; k++) {
				fields[i][k] = new Field();
				System.out.println(i + " " + k);
			}
			
		}
		
	}
	
	public void chooseField() {
		
	}
	
	
}
