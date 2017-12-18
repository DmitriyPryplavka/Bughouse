package tests;

/**
 * Created by Nikolay on 18.12.2017.
 */

        import main.java.board.Game;
        import main.java.communicator.Client;
        import org.junit.Test;

        import static org.mockito.Mockito.mock;

public class GameClientTest {
    @Test
    public void clientWorkTest(){    //Mock-тест поведінки  гри при запуску.
        Client client = mock(Client.class);
        Game game = new Game(client);

        game.start();
        //маємо отримати повідомлення в консолі



    }
}
