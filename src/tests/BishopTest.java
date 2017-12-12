package tests;

import main.java.piece.Bishop;
import org.junit.Assert;
import org.junit.Test;

public class BishopTest {
    @Test
    public void isMovedTest(){          //Пряме тестування коду
        Bishop bishop = new Bishop(0);
        //Перевірка початкового значення
        boolean isMoved = bishop.getMoved();
        Assert.assertFalse(isMoved);
        //Зміна значення та перевірка
        bishop.setMoved(true);
        isMoved = bishop.getMoved();
        Assert.assertTrue(isMoved);
        //Зміна значення в початкове положення
        bishop.setMoved(false);
        Assert.assertFalse(bishop.getMoved());

    }
}