package br.com.edsonbjr.datatypes;

import br.com.edsonbjr.datatypes.IntegerOperations;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerOperationsTest {

    private IntegerOperations operation;
    @Before
    public void setUp() {
        // Initialize the shared variable before each test
        operation = new IntegerOperations();
    }
    @Test
    public void shouldReturnValueOfAddiction() {
        int result = operation.addition();
        assertEquals(30, result);
    }
    @Test
    public void shouldReturnValueOfSubtraction() {
        int result = operation.subtraction();
        assertEquals(-10, result);
    }

    @Test
    public void shouldReturnValueOfMultiplication() {
        int result = operation.multiplication();
        assertEquals(200, result);
    }

    @Test
    public void shouldReturnValueOfDivison() {
        int result = operation.division();
        System.out.println(result);
        /*
        When comparing floating-point numbers,
        due to the way they are represented in computers,
        it's not always possible to achieve exact equality.
        Therefore, it's common to use an approach where you check
        if the difference between two floating-point numbers
        is within an acceptable range (delta).
         */
        assertEquals(0.0, result, 0.1);
    }
}
