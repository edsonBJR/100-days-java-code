package br.com.edsonbjr.datatypes;

import br.com.edsonbjr.datatypes.CharacterOperations;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharacterOperationsTest {

    @Test
    public void shouldConvertCharToUpperCase() {
        CharacterOperations converter = new CharacterOperations();
        char result = converter.convertLowerToUpper();

        assertEquals(result, 'A');
    }
}
