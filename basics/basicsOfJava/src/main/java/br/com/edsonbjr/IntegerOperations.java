package br.com.edsonbjr;

public class IntegerOperations {

    /*
        Write a Java program that declares two int variables,
        assigns them values, and then performs addition, subtraction,
        multiplication, and division operations on them. Print the results.
    */

    int a = 10;
    int b = 20;

    public IntegerOperations() {
    }

    public int addition() {
        return a + b;
    }

    public int subtraction() {
        return a - b;
    }

    public int multiplication() {
        return a * b;
    }

    public int division() {
        // Warning: 'a / b': integer division in floating-point context
        // To resolve the warning, cast one or both operands to floating-point types
        return a / b;
    }

}