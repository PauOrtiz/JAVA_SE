import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestMulti {

    @Test
    public void multiplicacionPorCero() {
       TestMulti tester = new TestMulti(); 
        assertEquals(0, tester.multiply(40, 0), "40 x 0 da 0");
        assertEquals(0, tester.multiply(0, 10), "0 x 10 da 0");
        assertEquals(0, tester.multiply(0, 0), "0 x 0 da 0");
    }
}