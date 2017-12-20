package com.mmc.tiktaktoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Positioner implements PostionGetter{
	
	private String getFromConsole() {
		String answer;
		
		while(true) {
			try {
				answer = getFromUser();
				
				if(answer.length() != 2) {
					System.out.println("z³a odpowed");
					continue;
				}
				
				break;
			} catch (IOException e) {
				System.out.println("z³a odpowed");
				continue;
			}
			
			
		}
		
		return answer;
	}
	
	public Position convertStringToPostition(String positionsInString) {
		int y = 0, x = 0;
		
		x = Integer.parseInt(positionsInString.substring(0, 1));
		y = Integer.parseInt(positionsInString.substring(1, 2));
		
		return new CellPosition(x, y);
	}
	
	public String getFromUser() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input your choice: ");
        
        String s = br.readLine();
       
        return s;
	}

	@Override
	public Position getPosition() {
		return convertStringToPostition(getFromConsole());
	}
}
