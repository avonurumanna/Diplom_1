package praktikum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BunTest {
    public static final float bunPrice = 0.75f;
    public static String bunName = "Bun";
    Bun bun;


    @Before
    public void setUp() throws Exception {
        bun = new Bun(bunName, bunPrice);
    }

    @Test
    public void bunGetNameExpectedReturnName() {
        assertEquals(bunName, bun.getName());
    }

    @Test
    public void bunGetNameExpectedReturnPrice() {
        assertEquals(bunPrice, bun.getPrice(), 0.1f);
    }


}