package tests;

import main.java.board.Game;
import main.java.communicator.Client;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by Nikolay on 18.12.2017.
 */
public class ClientTest {
    @Test
    public void updatetest(){
        Client client = mock(Client.class);
        Game game = mock(Game.class);
        game.setCommunicator(client);
        verify(game).setCommunicator(client);


    }
}
