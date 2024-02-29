package br.com.edsonbjr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IncrementDecrementDemoTest {

    @Test
    public void shouldReturnZeroAtEndOfTheMethod() {
        IncrementDecrementDemo incrementDecrementDemo = new IncrementDecrementDemo();

        // Call the method to test it
        incrementDecrementDemo.incrementDecrementInt();

        // Assuming incDec is an instance variable of MyClass
        // Check the final value of incDec after the method is called
        assertEquals(0, incrementDecrementDemo.incDec);
    }
}
