package br.com.edsonbjr.datatypes;

import br.com.edsonbjr.datatypes.BooleanOperations;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BooleanOperationsTest {

    @Test
    public void shouldReturnTrueIfWeatherAndTemperatureConditionsAreFavorable() {
        BooleanOperations check = new BooleanOperations();
        boolean result = check.shouldGoForWalk();
        assertEquals(result, true);
    }
}
