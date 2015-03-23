package Problem_6;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testGetDifference() throws Exception {
        Assert.assertTrue(Main.getDifference(10) == 2640); // пример с сайта
    }
}