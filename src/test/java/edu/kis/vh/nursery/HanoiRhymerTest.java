package edu.kis.vh.nursery;
import org.junit.Assert;
import org.junit.Test;
public class HanoiRhymerTest {
    @Test
    public void testHanoiRhymerRejectionLogic() {
        HanoiRhymer rhymer = new HanoiRhymer();
        int first = 10;
        int second = 20;
        rhymer.countIn(first);
        Assert.assertEquals(first, rhymer.peekaboo());
        rhymer.countIn(second);
        Assert.assertEquals(first, rhymer.peekaboo());
        Assert.assertEquals(1, rhymer.reportRejected());
    }

    @Test
    public void testHanoiRhymerAcceptanceLogic() {
        HanoiRhymer rhymer = new HanoiRhymer();
        int first = 20;
        int second = 10;

        rhymer.countIn(first);
        rhymer.countIn(second);

        Assert.assertEquals(second, rhymer.peekaboo());
        Assert.assertEquals(0, rhymer.reportRejected());
    }
}
