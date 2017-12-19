package com.mmc.tiktaktoe;

public class Print implements Printer {
	
	public static void main(String[] args ) {
		new Print();
	}

	public Print() {
		this.print();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("11|12|13");
		System.out.println("--------");
		System.out.println("21|22|23");
		System.out.println("--------");
		System.out.println("31|32|33");
	}
	
	
}
