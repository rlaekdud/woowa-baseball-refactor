package woowa.baseball.controller;

import woowa.baseball.dto.GameInput;
import woowa.baseball.dto.GameOutput;
import woowa.baseball.service.GameService;

public class GameController {

    private final GameInput gameInput =  new GameInput();
    private final GameOutput gameOutput = new GameOutput();
    private final GameService gameService = new GameService();

    public GameController() {

        int gameStatus = 1;

        gameOutput.printStart();

        while(gameStatus == 1) {
            gameService.play();
            gameStatus = gameInput.inputRestart();
        }
    }
}
