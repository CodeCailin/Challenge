package com.server;

import java.util.ArrayList;
import java.util.List;

public class GameState {
	
	private int turn;
	
	private int numberUser;
	
	private String [][] stateGame;

	public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}

	public String[][] getStateGame() {
		return stateGame;
	}

	public void setStateGame(String[][] stateGame) {
		this.stateGame = stateGame;
	}

	public int getNumberUser() {
		return numberUser;
	}

	public void setNumberUser(int numberUser) {
		this.numberUser = numberUser;
	}
	
	

}
