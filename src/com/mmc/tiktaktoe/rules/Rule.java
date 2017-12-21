package com.mmc.tiktaktoe.rules;

import com.mmc.tiktaktoe.abstraction.Cell;

public interface Rule {
	Cell qualify(Cell[][] tickArray);
}
