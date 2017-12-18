package tests;

import main.java.piece.Knight;
import org.junit.Assert;
import org.junit.Test;

public class KnightTest {
    @Test
    public void isMovedTest(){          //Пряме тестування коду
        Knight knight= new Knight(0);
        //Перевірка початкового значення
        boolean isMoved = knight.getMoved();
        Assert.assertFalse(isMoved);
        //Зміна значення та перевірка
        knight.setMoved(true);
        isMoved = knight.getMoved();
        Assert.assertTrue(isMoved);
        //Зміна значення в початкове положення
        knight.setMoved(false);
        Assert.assertFalse(knight.getMoved());

    }
}
