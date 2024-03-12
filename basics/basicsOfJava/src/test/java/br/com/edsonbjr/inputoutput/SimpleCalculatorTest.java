package br.com.edsonbjr.inputoutput;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SimpleCalculatorTest {

    @Test
    public void testAddition() {
        assertEquals(3.0, SimpleCalculator.Addition(1.0, 2.0), 0.001);
    }

    @Test
    public void testSubtraction() {
        assertEquals(-1.0, SimpleCalculator.Subtraction(1.0, 2.0), 0.001);
    }

    @Test
    public void testMultiplication() {
        assertEquals(6.0, SimpleCalculator.Multiplication(2.0, 3.0), 0.001);
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, SimpleCalculator.Division(4.0, 2.0), 0.001);
    }

    @Test
    public void shouldReturnValueOfAdditionOperation() throws IOException {
        BufferedReader mockReader = mock(BufferedReader.class);
        when(mockReader.readLine()).thenReturn("1", "1, 2");
        SimpleCalculator calculator = new SimpleCalculator(mockReader);
        Double result = calculator.calculator();

        assertEquals(3.0, result, 0.001);
    }
}
