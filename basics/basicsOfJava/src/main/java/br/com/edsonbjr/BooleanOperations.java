package br.com.edsonbjr;

import java.util.Random;

public class BooleanOperations {

    /*
    Boolean Logic:
        Write a Java program that uses boolean variables
        to represent the conditions "sunny" and "warm."
        Create a boolean variable goForWalk that is true if it's sunny and warm,
        and false otherwise. Print whether you should go for a walk or not.

     String Concatenation:
        Declare two String variables and concatenate them using the + operator.
        Print the concatenated string.
     */

    private String weatherConditions;
    private String temperatureConditions;
    private boolean goForWalk;

    public BooleanOperations(){}

    public static String[][] generateRandomWeather() {
        String[] weatherOptions = {"Sunny", "Humid", "Warm", "Mild", "Frigid"};
        int numberOfCombinations = calculateCombinations(weatherOptions.length, 2);
        String[][] combinations = new String[numberOfCombinations][2];
        return generateCombinations(weatherOptions, combinations);

    }

    private static int calculateCombinations(int n, int k) {
        int numerator = factorial(n);
        int denominator = factorial(k) * factorial(n - k);
        return numerator / denominator;
    }

    public static int factorial(int n) {
        if(n == 0 || n ==1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static String[][] generateCombinations(String[] options, String[][] combinations) {
        int index = 0;

        for(int i = 0; i < options.length; i++) {
            for(int j = i + 1; j < options.length; j++) {
                combinations[index][0] = options[i];
                combinations[index][1] = options[j];
            }
        }
        return combinations;
    }

    public boolean shouldGoForWalk() {
        String[][] weatherCombinations = generateRandomWeather();
        for (String[] combination : weatherCombinations) {
            if(combination[0].contains("Sunny") && combination[1].contains("Warm")) {
                System.out.println(combination[0] + ", " + combination[1]);
                return true;
            }
        }
        return false;
    }
}
