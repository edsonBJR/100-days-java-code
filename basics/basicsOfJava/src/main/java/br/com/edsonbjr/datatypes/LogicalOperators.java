package br.com.edsonbjr.datatypes;

import java.util.Arrays;

public class LogicalOperators {

    /*
        Logical Operators:
            Declare two boolean variables and use logical
            operators (&&, ||, !) to create compound conditions.
            Print the results of the compound conditions.
     */


    // Method to compare arrays and store the results in a boolean array
    public boolean[] compareArrays(int[] arr1, int[] arr2) {
        // Check if arrays have the same length
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Arrays must have the same length.");
        }

        // Create a boolean array to store the results
        int length = arr1.length;
        boolean[] results = new boolean[length];

        // Iterate through the arrays and compare values at corresponding indices
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                // Compare values at corresponding indices and check if both are even
                if(arr1[i] == arr2[j] && isEven(arr1[i]) && isEven(arr2[j])) {
                    results[i] = true;
                } else {
                    results[i] = false;
                }
            }
        }

        // Return the boolean array with the results
        System.out.println(Arrays.asList(results));
        return results;
    }

    // Method to check if a number is even
    public boolean isEven(int num) {
        return num % 2 == 0;
    }
}

