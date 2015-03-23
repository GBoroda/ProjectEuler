package Problem_2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testFib() throws Exception {
        Assert.assertTrue(Main.fib(2) == 1);
        Assert.assertTrue(Main.fib(10) == 55);
        Assert.assertTrue(Main.fib(25) == 75025);
        Assert.assertTrue(Main.fib(25) == (Main.fib(23) + Main.fib(24)));
    }
}