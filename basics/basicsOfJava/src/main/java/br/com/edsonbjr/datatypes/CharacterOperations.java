package br.com.edsonbjr.datatypes;
@SuppressWarnings("FieldCanBeLocal")
public class CharacterOperations {

    /*
    Character Operations
        Declare a char variable and assign it a lowercase letter.
        Convert it to uppercase and print both the lowercase and uppercase versions.
     */
    final private char character  = 'a';
    public CharacterOperations() {}

    public char convertLowerToUpper() {
        return Character.toUpperCase(character);
    }
}
