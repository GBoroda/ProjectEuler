package Problem_4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testIsPalyndrom() throws Exception {
        Assert.assertTrue(Main.isPalyndrom(2002));
        Assert.assertTrue(Main.isPalyndrom(245542));
        Assert.assertFalse(Main.isPalyndrom(1004));
        Assert.assertFalse(Main.isPalyndrom(1000));
    }
}