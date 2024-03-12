package br.com.edsonbjr.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleCalculator {

    /*
        Simple Calculator:
            Implement a simple calculator that can perform addition, subtraction, multiplication, and division.
            Read the numbers and operation from the user.
     */

    private BufferedReader reader;
    public SimpleCalculator(BufferedReader reader) {
        this.reader = reader;
    }
    public static Double Addition(Double valueA, Double valueB) {
        return valueA + valueB;
    }

    public static Double Subtraction(Double valueA, Double valueB) {
        return valueA - valueB;
    }

    public static Double Multiplication(Double valueA, Double valueB) {
        return valueA * valueB;
    }

    public static Double Division(Double valueA, Double valueB) {
        return valueA / valueB;
    }

    public Double calculator() throws IOException {
        System.out.println("Choose the number of Operation: 1 - Addition | 2 - Subtraction | 3 - Multiplication | 4 - Division");

        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        String inputNumberOfOperation = bfn.readLine();
        int numberOfOperation = Integer.valueOf(inputNumberOfOperation);

        System.out.println("Now type the values. Example: 1, 2");
        String inputValuesToOperate = bfn.readLine();
        String[] values = inputValuesToOperate.split(",\\s*");

        Double valueA = Double.valueOf(values[0]);
        Double valueB = Double.valueOf(values[1]);

        switch (numberOfOperation) {
            case 1:
                System.out.println("Addition Operation chose!");
                return Addition(valueA, valueB);
            case 2:
                System.out.println("Subtraction Operation chose!");
                return Subtraction(valueA, valueB);
            case 3:
                System.out.println("Multiplication Operation chose!");
                return Multiplication(valueA, valueB);
            case 4:
                System.out.println("Division Operation chose!");
                return Division(valueA, valueB);
            default:
                System.out.println("Invalid Operation - Choose again.");
                return null;
        }
    }
}
