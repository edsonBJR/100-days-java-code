package br.com.edsonbjr.inputoutput;

import java.io.*;

public class ReadWriteFile {

    /*
        File Reading and Writing:
            Read content from a file and write it to another file.
            You can choose a text file for this exercise.
     */

    public static void readWriteFile() {
        String sourceFilePath = "src/main/resources/source.txt";
        String destinationFilePath = "src/main/resources/destination.txt";

        //Read content from the source file and write to the destionation file
        try {
            readFileAndWriteToFile(sourceFilePath, destinationFilePath);
            System.out.println("Content successfully copied from " + sourceFilePath + destinationFilePath);
        } catch(IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void readFileAndWriteToFile(String sourceFilePath, String destinationFilePath) throws IOException{

        //Open the source file for reading
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath))){
            //Open the destination file for writing
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFilePath))){
                String line;
                //Read each line from the source file and write it to the destination file
                while ((line = reader.readLine()) != null) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        }
    }


}
