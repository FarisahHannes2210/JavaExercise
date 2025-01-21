package ExceptionHandlingTechniques;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

  class InvalidInputException extends IllegalArgumentException {


    private String message;

    public InvalidInputException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        System.out.println(message);
        return message;
    }


    public int validateInput(int input) throws InvalidInputException {

        if (input > 100 || input < 1) {
            throw new InvalidInputException("Input must be between 1 and 100");
        }
        return input;
    }

    public void readFile(String fileName) throws IOException {


        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            throw new IOException("Got an IOException error while reading file");

        }

    }

    public void processInput(int input) throws InvalidInputException {

        try{

           int validatedInput = validateInput(input);
            System.out.println("Validated input: " + validatedInput);

        }catch (InvalidInputException e){
            throw new InvalidInputException(e.getMessage());
        }

    }
}

 public class Main{

    public static void main(String args[]) {

        //----validate input
        InvalidInputException obj = new InvalidInputException("Input must be between 1 and 100");


        System.out.println("Validate Input here---");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();


        try{
            obj.processInput(input);

        }catch (InvalidInputException e){
            System.out.println(e.getMessage());

        }

        //----read file
        InvalidInputException inv = new InvalidInputException("Something went wrong with file reading");
        System.out.println("Read File here---");
        System.out.print("Enter a file name: ");
        String fileName = scanner.next();


        try{
            inv.readFile(fileName);
        }catch (IOException e){
            System.out.println(e.getMessage());

        }





    }


}





