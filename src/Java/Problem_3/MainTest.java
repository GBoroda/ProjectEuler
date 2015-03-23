package Problem_3;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void testIsPrime() throws Exception {
        Assert.assertTrue(Main.isPrime(17));
        Assert.assertTrue(Main.isPrime(7));
        Assert.assertFalse(Main.isPrime(25));
        Assert.assertFalse(Main.isPrime(100));
    }
}