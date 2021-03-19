package client;

public class GameState {
	
	private int turn;
	
	private int numberUser;
	
	private String [][] stateGame;
	
	//0, end game
	private int status;
	
	private int winner;

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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getWinner() {
		return winner;
	}

	public void setWinner(int winner) {
		this.winner = winner;
	}
	
	

}
