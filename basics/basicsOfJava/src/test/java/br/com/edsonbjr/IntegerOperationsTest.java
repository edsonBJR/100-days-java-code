package br.com.edsonbjr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerOperationsTest {

    @Test
    public void shouldReturnValueOfAddiction() {
        IntegerOperations operation = new IntegerOperations();
        int result = operation.addition();
        assertEquals(30, result);
    }
    @Test
    public void shouldReturnValueOfSubtraction() {
        IntegerOperations operation = new IntegerOperations();
        int result = operation.subtraction();
        assertEquals(-10, result);
    }

    @Test
    public void shouldReturnValueOfMultiplication() {
        IntegerOperations operation = new IntegerOperations();
        int result = operation.multiplication();
        assertEquals(200, result);
    }

    @Test
    public void shouldReturnValueOfDivison() {
        IntegerOperations operation = new IntegerOperations();
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
