package tests;

import main.java.piece.Rook;
import org.junit.Assert;
import org.junit.Test;

public class RookTest {
    @Test
    public void isMovedTest(){          //Пряме тестування коду
        Rook rook = new Rook(0);
        //Перевірка початкового значення
        boolean isMoved = Rook.getMoved();
        Assert.assertFalse(isMoved);
        //Зміна значення та перевірка
        Rook.setMoved(true);
        isMoved = rook.getMoved();
        Assert.assertTrue(isMoved);
        //Зміна значення в початкове положення
        Queen.setMoved(false);
        Assert.assertFalse(Rook.getMoved());

    }
}