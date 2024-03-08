package br.com.edsonbjr.inputoutput;

public class ReverseString {

    /*
        Reverse String:
            Read a string from the user and print its reverse.
     */

    public static void main(String[] args) {
        String text = "Edson";
        char[] charArray = text.toCharArray();
        char[] newString = new char[charArray.length];

        // Loop condition to start from charArray.length - 1 and go down to 0.
        for (int i = charArray.length - 1, j = 0; i >= 0; --i, ++j) {
            newString[j] = charArray[i];
        }

        System.out.println(newString);
    }
}
