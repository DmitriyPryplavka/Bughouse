package tests;

import main.java.piece.Queen;
import org.junit.Assert;
import org.junit.Test;

public class QueenTest {
    @Test
    public void isMovedTest(){          //����� ���������� ����
        Queen Queen = new Queen(0);
        //�������� ����������� ��������
        boolean isMoved = Queen.getMoved();
        Assert.assertFalse(isMoved);
        //���� �������� �� ��������
        Queen.setMoved(true);
        isMoved = Queen.getMoved();
        Assert.assertTrue(isMoved);
        //���� �������� � ��������� ���������
        Queen.setMoved(false);
        Assert.assertFalse(Queen.getMoved());

    }
}