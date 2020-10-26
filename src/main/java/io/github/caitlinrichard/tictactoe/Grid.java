package io.github.caitlinrichard.tictactoe;

public class Grid {
	private int[] gridState = new int[9]; //holds values for grid cells, 0 = x, 1 = y, -1 = blank
	
	//default constructor, initiates blank grid
	public Grid() {
		for (int i = 0; i < gridState.length - 1; i++) {
			gridState[i] = -1;
		}
	}
	
	public boolean isCellOccupied(int cell) {
		boolean isCellOccupied;
		if (gridState[cell] != -1) {
			isCellOccupied = true;
		} else {
			isCellOccupied = false;
		}
		return isCellOccupied;
	}
	
	//iscelloccupied
}
