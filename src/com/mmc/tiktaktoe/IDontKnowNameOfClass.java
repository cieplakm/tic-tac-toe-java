package com.mmc.tiktaktoe;

public class IDontKnowNameOfClass implements TicsXXX {
	Field[][] fields;
	
	public IDontKnowNameOfClass() {
		createFields();
		
	}

	private void createFields() {
		fields = new Field[3][];
		
		for (int i = 0; i < 3; i++) {
			fields[i] = new Field[3];
			
			for (int k = 0; k < 3; k++) {
				Field field = new Field();
				field.setTic((i+1) + "" + (k+1));
				fields[i][k] = field;
				
			}
			
		}
		
	}
	
	public void chooseField() {
	
	}

	@Override
	public Tic[][] getTics() {
		return fields;
	}
	
	
}
