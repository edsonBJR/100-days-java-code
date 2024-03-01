package br.com.edsonbjr;

public class RelationalOperations {

    /*
        Relational Operators:
            Write a program that compares two int variables
            using relational operators (<, <=, ==, !=, >=, >).
            Print the results of each comparison.
     */

    static int a = 5;
    static int b = 10;

    public RelationalOperations() {}

    public static void compare() {
        System.out.println(a + " < " + b + ": " + (a < b));
        System.out.println(a + " <= " + b + ": " + (a <= b));
        System.out.println(a + " == " + b + ": " + (a == b));
        System.out.println(a + " != " + b + ": " + (a != b));
        System.out.println(a + " >= " + b + ": " + (a >= b));
        System.out.println(a + " > " + b + ": " + (a > b));
    }


}
