package br.com.edsonbjr;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class FloatPointOperationsTest {

    private FloatPointOperations operation;
    @Before
    public void setUp() {
        // Initialize the shared variable before each test
        operation = new FloatPointOperations();
    }

    @Test
    public void shouldReturnValueOfAddition() {
        double result = operation.addition();
        assertEquals(4.221, result, 0.001);
    }

    @Test
    public void shouldReturnValueOfSubtraction() {
        double result = operation.subtraction();
        assertEquals(-1.753, result, 0.001);
    }

    @Test
    public void shouldReturnValueOfMultiplication() {
        double result = operation.multiplication();
        assertEquals(3.685958, result, 0.001);
    }

    @Test
    public void shouldReturnValueOfDivision() {
        double result = operation.division();
        assertEquals(0.413123535, result, 0.001);
    }
}
