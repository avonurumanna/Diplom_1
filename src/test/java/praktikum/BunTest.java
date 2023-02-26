package praktikum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BunTest {
    public final float bunPrice = 0.75f;
    public final String bunName = "Bun";
    Bun bun;


    @Before
    public void setUp() throws Exception {
        bun = new Bun(bunName, bunPrice);
    }

    @Test
    public void bunGetNameExpectedReturnNameTest() {
        assertEquals(bunName, bun.getName());
    }

    @Test
    public void bunGetPriceExpectedReturnPriceTest() {
        assertEquals(bunPrice, bun.getPrice(), 0);
    }


}