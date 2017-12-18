package tests;

import main.java.board.Game;
import main.java.communicator.Server;
import org.junit.Test;
import static org.mockito.Mockito.mock;

public class GameTest {
    @Test
    public void serverWorkTest(){    //Mock-тест поведінки  гри при запуску.
        Server server = mock(Server.class);
        Game game = new Game(server);
        game.start();
        //маємо отримати повідомлення в консолі
    }
}
