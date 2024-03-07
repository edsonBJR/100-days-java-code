package br.com.edsonbjr.inputoutput;

import org.junit.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.Assert.assertEquals;

public class ReadWriteFileTest {

    @Test
    public void testReadFileAndWriteToFile() throws IOException {

        //Create a temporary source file
        Path sourceFile = createTempFile("source", ".txt", "Hello, this is a test.");

        //Create a temporary destination file
        Path destinationFilePath = createTempFile("destination", ".txt", "");

        //Call the method to test
        ReadWriteFile.readFileAndWriteToFile(sourceFile.toString(), destinationFilePath.toString());
        
        //Read the content from the destination file
        String resultContent = readFileContent(destinationFilePath);
        
        //Validate the content
        assertEquals("Hello, this is a test./n", resultContent);
    }

    private Path createTempFile(String fileNamePrefix, String fileNameSuffix, String content) throws IOException{
        Path tempFilePath = Files.createTempFile(fileNamePrefix, fileNameSuffix);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFilePath.toString()))){
            writer.write(content);
        }
        return tempFilePath;
    }

    private String readFileContent(Path filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath.toString()))){
            String line;
            while((line = reader.readLine()) != null) {
                content.append(line).append("/n");
            }
        }
        return content.toString().trim();
    }
}
