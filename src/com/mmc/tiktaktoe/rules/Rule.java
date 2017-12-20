package com.mmc.tiktaktoe.rules;

import com.mmc.tiktaktoe.Cell;

public interface Rule {
	Cell qualify(Cell[][] tickArray);
}
