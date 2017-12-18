package tests;

import main.java.piece.Rook;
import org.junit.Assert;
import org.junit.Test;

public class RookTest {
    @Test
    public void isMovedTest(){          //Ïðÿìå òåñòóâàííÿ êîäó
        Rook rook = new Rook(0);
        //Ïåðåâ³ðêà ïî÷àòêîâîãî çíà÷åííÿ
        boolean isMoved = Rook.getMoved();
        Assert.assertFalse(isMoved);
        //Çì³íà çíà÷åííÿ òà ïåðåâ³ðêà
        Rook.setMoved(true);
        isMoved = rook.getMoved();
        Assert.assertTrue(isMoved);
        //Çì³íà çíà÷åííÿ â ïî÷àòêîâå ïîëîæåííÿ
        Rook.setMoved(false);
        Assert.assertFalse(Rook.getMoved());

    }
}
