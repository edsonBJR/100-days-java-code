package br.com.edsonbjr.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

public class ReadPrintString {

    /*
        A program that reads a user's name from the console and prints a personalized greeting.
     */

    public static void readPrintConsole() throws IOException {

        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type your name: ");
        String inputStr = bfn.readLine();

        LocalDateTime now = LocalDateTime.now();
        int currentHour = now.getHour();

        if(currentHour >= 0 && currentHour < 12) {
            System.out.println("Dear " + inputStr + " good morning!");
        } else if(currentHour >= 12 && currentHour < 18) {
            System.out.println("Dear " + inputStr + " good afternoon!");
        } else {
            System.out.println("Dear " + inputStr + " good evening!");
        }
    }
}
