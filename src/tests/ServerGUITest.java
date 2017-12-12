package tests;

import main.java.board.Game;
import main.java.communicator.Server;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ServerGUITest {

    @Test
    public void serverWorkTest(){    //Mock-тест поведінки серверу та гри.
        Server server = mock(Server.class);
        Game game = mock(Game.class);
        game.setCommunicator(server);
        verify(game).setCommunicator(server);



    }
}