package br.com.edsonbjr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticOverFlowTest {

    @Test
    public void shouldReturnIntFromDoubleCast() {
        int result = ArithmeticOverFlow.castToInt(100.234);
        assertEquals(100, result);
    }

    @Test
    public void shouldReturnOverflowFromIntValue() {
        int result = ArithmeticOverFlow.showArithmeticOverflow(1000);
        assertEquals(-2147482649, result);
    }
}
