package com.mmc.tiktaktoe;


import java.util.ArrayList;
import java.util.List;

import com.mmc.tiktaktoe.rules.Rule;

public class TicRefeere implements Refeere {
	List<Rule> rules;
	private Cell[][] cells;
	
	public TicRefeere(Cell[][] cells) {
		this.cells = cells;
		rules = new ArrayList<>();
	}

	@Override
	public void addRule(Rule rule) {
		rules.add(rule);
	}

	@Override
	public boolean isWin() {
		
		for (Rule rule : rules) {
			Cell wonCell = rule.qualify(cells);
			
			if(  wonCell != null) {
				
				System.out.println("WIN! " + wonCell.getType() + "!");
				return true;
			}
		}
		
		return false;
	}

	@Override
	public String whoWon() {
		// TODO Auto-generated method stub
		return null;
	}


}
