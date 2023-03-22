package Service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GameServiceTest {
    GameService gameService = new GameService();

    @Test
    @DisplayName("initGame")
    public void initGameTest() throws Exception {
        gameService.initGame();
    }
}