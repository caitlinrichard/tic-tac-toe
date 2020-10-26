package io.github.caitlinrichard.tictactoe;

public class Grid {
	private int[] gridState = new int[9]; //holds values for grid cells, 0 = x, 1 = y, -1 = blank
	
	//default constructor, initiates blank grid
	public Grid() {
		for (int i = 0; i < gridState.length; i++) {
			gridState[i] = -1;
		}
	}
	
	//returns boolean if the cell is already occupied with an X or O
	public boolean isCellOccupied(int cell) {
		boolean isCellOccupied;
		if (gridState[cell] != -1) {
			isCellOccupied = true;
		} else {
			isCellOccupied = false;
		}
		return isCellOccupied;
	}
	
	//adds X to a cell
	public void addX(int cell) {
		gridState[cell] = 0;
	}
	
	//adds O to a cell
	public void addO(int cell) {
		gridState[cell] = 1;
	}
	
	//returns true if the game is over
	public boolean isGameOver() {
		boolean isGameOver = false;
		if ((gridState[0] == 0 && gridState[3] == 0 && gridState[6] == 0) ||
				(gridState[0] == 1 && gridState[3] == 1 && gridState[6] == 1)) {
			isGameOver = true;
		} else if ((gridState[1] == 0 && gridState[4] == 0 && gridState[7] == 0) ||
				      (gridState[1] == 1 && gridState[4] == 1 && gridState[7] == 1)){
			isGameOver = true;
		} else if ((gridState[2] == 0 && gridState[5] == 0 && gridState[8] == 0) ||
				      (gridState[2] == 1 && gridState[5] == 1 && gridState[8] == 1)) {
			isGameOver = true;
		} else if ((gridState[0] == 0 && gridState[1] == 0 && gridState[2] == 0) ||
			          (gridState[0] == 1 && gridState[1] == 1 && gridState[2] == 1)) {
			isGameOver = true;
		} else if ((gridState[3] == 0 && gridState[4] == 0 && gridState[5] == 0) || 
				      (gridState[3] == 1 && gridState[4] == 1 && gridState[5] == 1)) {
			isGameOver = true;
		} else if ((gridState[6] == 0 && gridState[7] == 0 && gridState[8] == 0) ||
				      (gridState[6] == 1 && gridState[7] == 1 && gridState[8] == 1)) {
			isGameOver = true;
		} else if ((gridState[0] == 0 && gridState[4] == 0 && gridState[8] == 0) ||
				      (gridState[0] == 1 && gridState[4] == 1 && gridState[8] == 1)) {
			isGameOver = true;
		} else if ((gridState[2] == 0 && gridState[4] == 0 && gridState[6] == 0) || 
				      (gridState[2] == 1 && gridState[4] == 1 && gridState[6] == 1)) {
			isGameOver = true;
		} else {
			isGameOver = false;
		}
		return isGameOver;
	}
}
