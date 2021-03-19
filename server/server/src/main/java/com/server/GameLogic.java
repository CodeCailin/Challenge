package com.server;

import java.util.ArrayList;
import java.util.List;

public class GameLogic {
	
	private static GameLogic instance;
	
	transient private List<Integer> players = new ArrayList<>();
    
    private GameLogic(){}
    
    public static GameLogic getInstance(){
        if(instance == null){
            instance = new GameLogic();
        }
        return instance;
    }
    
    private GameState gameState;
    
    private int idClient = 0;
    
    public void initState(int id) {
    	if(gameState == null) {
    		idClient = idClient + 1;
	    	gameState = new GameState();
	    	gameState.setStateGame(new String [][] {});
	    	gameState.setTurn(idClient);
	    	gameState.setNumberUser(1);
	    	players.add(idClient);
    	} else if(!players.contains(id)) {
    		idClient = idClient + 1;
	    	gameState.setTurn(idClient);
	    	gameState.setNumberUser(2);
	    	players.add(idClient);
    	}
    }

	public GameState getGameState() {
		return gameState;
	}

	public void setGameState(GameState gameState) {
		this.gameState = gameState;
	}
    
    

}
