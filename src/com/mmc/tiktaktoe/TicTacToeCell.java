package com.mmc.tiktaktoe;

public class TicTacToeCell implements Cell{
	TicTacToeType type;
	
	@Override
	public boolean isUsed() {
		return type != null;
	}
	@Override
	public boolean isX() {
		return type == TicTacToeType.X;
	}
	@Override
	public boolean isO() {
		return type == TicTacToeType.O;
	}
	@Override
	public boolean setAsX() {
		if(!isUsed()) {
			type = TicTacToeType.X;
			return true;
		}
		return false;
	}
	@Override
	public boolean setAsO() {
		if(!isUsed()) {
			type = TicTacToeType.O;
			return true;
		}
		return false;
	}
	@Override
	public String getType() {
		if(type == null) {
			return "-";
		}
		return type.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.type == ((TicTacToeCell)obj).type && type != null;
	}
	
}
