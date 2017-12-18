package tests;

import main.java.piece.Bishop;
import main.java.piece.King;
import org.junit.Assert;
import org.junit.Test;

public class KingTest {
    @Test
    public void isMovedTest(){          //Пряме тестування коду
        King king = new King(1);
        //Перевірка початкового значення
        boolean isMoved = king.getMoved();
        Assert.assertFalse(isMoved);
        //Зміна значення та перевірка
        king.setMoved(true);
        isMoved = king.getMoved();
        Assert.assertTrue(isMoved);
        //Зміна значення в початкове положення
        king.setMoved(false);
        Assert.assertFalse(king.getMoved());

    }
}