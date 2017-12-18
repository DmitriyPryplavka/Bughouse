package tests;

import main.java.piece.Rook;
import org.junit.Assert;
import org.junit.Test;

public class RookTest {
    @Test
    public void isMovedTest(){          //����� ���������� ����
        Rook rook = new Rook(0);
        //�������� ����������� ��������
        boolean isMoved = Rook.getMoved();
        Assert.assertFalse(isMoved);
        //���� �������� �� ��������
        Rook.setMoved(true);
        isMoved = rook.getMoved();
        Assert.assertTrue(isMoved);
        //���� �������� � ��������� ���������
        Queen.setMoved(false);
        Assert.assertFalse(Rook.getMoved());

    }
}