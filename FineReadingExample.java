package Week_3.ExceptionLesson;

//try-catch exception lesson.

import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class FineReadingExample {

    public static void main(String[] args){


        try{
            File file = new File("thisDoesNotExist.txt");
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){ //kalau jumpa, print the text inside the file
                String line = scanner.nextLine();
                System.out.println(line);

            }
        }catch (FileNotFoundException e){ //kalau ta, file is not found + message.
            System.out.println("File not found : " + e.getMessage());
        }

    }

    public void readFile(String fileName) throws IOException {

        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

    if(file == null){
        throw new FileNotFoundException("File not found");
    }
    while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }

    public void processData(String data) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:database.db");
    }

}
