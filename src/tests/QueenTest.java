package tests;

import main.java.piece.Queen;
import org.junit.Assert;
import org.junit.Test;

public class QueenTest {
    @Test
    public void isMovedTest(){          //Пряме тестування коду
        Queen Queen = new Queen(0);
        //Перевірка початкового значення
        boolean isMoved = Queen.getMoved();
        Assert.assertFalse(isMoved);
        //Зміна значення та перевірка
        Queen.setMoved(true);
        isMoved = Queen.getMoved();
        Assert.assertTrue(isMoved);
        //Зміна значення в початкове положення
        Queen.setMoved(false);
        Assert.assertFalse(Queen.getMoved());

    }
}