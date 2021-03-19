package client;

public class ClientGame {
	
	private GameState gameState;
	
	public void initGame() throws Exception {
		GameState gameState = null;
		gameState = HttpClientHandler.getData("/start");
		this.gameState = gameState;
		System.out.println("You are connected with clientID " + gameState.getTurn());
	}
	
	public void initGameParams() throws Exception {
		int id = gameState.getTurn();
		gameState = HttpClientHandler.getData("/start?id="+id);
		this.gameState = gameState;
	}
	
	public void startGame() throws Exception {
		while(gameState.getNumberUser() < 2) {
			System.out.println("Waiting for the second player ...");
			initGameParams();
			Thread.sleep(5000);
		}
		System.out.println("Starting the game");
	}

}
