package br.com.edsonbjr.datatypes;

import br.com.edsonbjr.datatypes.LogicalOperators;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class LogicalOperatorsTest {

    @Test
    public void testCompareArrays() {

        LogicalOperators logicalOperators = new LogicalOperators();

        int[] valuesA = {1, 2, 3, 4, 5};
        int[] valuesB = {2, 6, 7, 8, 9};

        boolean[] expectedResults = {false, true, false, false, false};
        System.out.println(Arrays.asList(expectedResults[1]));
        boolean[] actualResults = logicalOperators.compareArrays(valuesA, valuesB);
        System.out.println(Arrays.asList(actualResults[1]));
        assertArrayEquals(expectedResults, actualResults);
    }
}
