package br.com.edsonbjr.datatypes;

public class IncrementDecrementDemo {

    /*
    Increment and Decrement:
        Declare an int variable and demonstrate
        both pre-increment and post-increment
        operations on it. Print the results.
     */

    int incDec;

    public IncrementDecrementDemo() {}

    public void incrementDecrementInt() {
        for(int i = 0; i < 5; i++) {
            incDec = i;
            System.out.println(incDec);
        }

        for(int i = 5; i >= 0; i--) {
            incDec = i;
            System.out.println(incDec);
        }

    }
}
