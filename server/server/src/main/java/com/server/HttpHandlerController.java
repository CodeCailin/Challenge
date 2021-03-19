package com.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpHandlerController {
	
	@GetMapping("/start")
	public GameState createGame(@RequestParam(defaultValue = "0", name = "id") int id) {
		GameLogic gameLogic = GameLogic.getInstance();
		gameLogic.initState(id);
		return gameLogic.getGameState();
	}

}
