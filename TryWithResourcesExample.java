package Week_3.ExceptionLesson;

//why use different exceptions when you can just use exceptions?
//Because sometimes we need do different things with different exception.
//makes your code easier to read in general
//IOExceptions and sql exceptions are really similar, but whn declared we can know what happened.
// IOException is child to runtime exceptions etc(need to memorise this)

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//buffered reader, string builder

public class TryWithResourcesExample {
    public static void main(String[] args) {
// Try-with-resources statement, automatically closes the BufferedReader
// The FileReader is wrapped inside the BufferedReader to read text from a character-based input stream
        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
            String line;
// Read each line from the file until the end of the file is reached
            while ((line = br.readLine()) != null) {
// Print the line to the console
                System.out.println(line);
            }
        } catch (IOException e) {
// Catch and handle any IOException that occurs during file reading
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}