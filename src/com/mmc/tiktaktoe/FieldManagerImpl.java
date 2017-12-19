package com.mmc.tiktaktoe;

public class FieldManagerImpl implements FieldManager {
	Tic[][] fields;
	
	public FieldManagerImpl() {
		createFields();
	}

	private void createFields() {
		fields = new TickImpl[3][];
		
		for (int i = 0; i < 3; i++) {
			fields[i] = new TickImpl[3];
			
			for (int k = 0; k < 3; k++) {
				TickImpl field = new TickImpl();
				field.setTic((i+1) + "" + (k+1));
				fields[i][k] = field;
			}
			
		}
		
	}
	

	@Override
	public Tic[][] getTics() {
		return fields;
	}

	@Override
	public void setTicX(int i, int k) {
		fields[i][k].setTic("x");
	}

	@Override
	public void setTicO(int i, int k) {
		fields[i][k].setTic("o");
	}
	
}
