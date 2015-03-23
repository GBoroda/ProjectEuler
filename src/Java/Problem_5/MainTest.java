package Problem_5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testIsGood() throws Exception {
        long x = 232792560;
        Assert.assertTrue(Main.isGood(x));
        Assert.assertTrue(x%2==0);
        Assert.assertTrue(x%3==0);
        Assert.assertTrue(x%4==0);
        Assert.assertTrue(x%5==0);
        Assert.assertTrue(x%6==0);
        Assert.assertTrue(x%7==0);
        Assert.assertTrue(x%8==0);
        Assert.assertTrue(x%9==0);
        Assert.assertTrue(x%10==0);
        Assert.assertTrue(x%11==0);
        Assert.assertTrue(x%12==0);
        Assert.assertTrue(x%13==0);
        Assert.assertTrue(x%14==0);
        Assert.assertTrue(x%15==0);
        Assert.assertTrue(x%16==0);
        Assert.assertTrue(x%17==0);
        Assert.assertTrue(x%18==0);
        Assert.assertTrue(x%19==0);
        Assert.assertTrue(x%20==0);
    }
}