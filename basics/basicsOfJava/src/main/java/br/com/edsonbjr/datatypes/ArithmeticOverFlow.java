package br.com.edsonbjr.datatypes;

public class ArithmeticOverFlow {

    /*
    Casting:
        Declare a double variable and convert it to an int.
        Print both the original double value and the converted int value.

    Arithmetic Overflow:
        Declare an int variable with the maximum possible value.
        Add 1 to it and print the result. Observe what happens and explain why.
     */

    public static int castToInt(double value) {
        return (int) value;
    }

    public static int showArithmeticOverflow(int value) {
        int maxIntValue = Integer.MAX_VALUE;
        return maxIntValue + value;
    }
}
