package woowa.baseball;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import woowa.baseball.controller.GameController;

public class BaseballApplication {

    public static void main(String[] args) {
        GameController gameController = new GameController();
    }

}
