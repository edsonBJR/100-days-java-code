package br.com.edsonbjr.inputoutput;

import org.junit.Test;

import java.io.*;
import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;

public class ReadPrintStringTest {

    @Test
    public void readPrintStringTest() throws IOException {

        String simulatedInput = "John\n";

        InputStream originalSystemIn = System.in;
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalSystemOut = System.out;
        System.setOut(new PrintStream(outputStream));

        ReadPrintString.readPrintConsole();

        System.setIn(originalSystemIn);
        System.setOut(originalSystemOut);

        String expectedOutput = "Type your name: \n" + "Dear John good afternoon!\n";

        assertEquals(expectedOutput, outputStream.toString());
    }


}
