package Problem_7;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void testIsPrime() throws Exception {
        int x = 127;
        Assert.assertTrue(Main.isPrime(x));
        boolean test = false;
        for (int i = 2; i < x; i++) {
            if (x%i==0) test=true;
        }
        Assert.assertFalse(test);
    }
}