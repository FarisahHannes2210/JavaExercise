//package Week_3.ExceptionLesson;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Scanner;
//
////sql exception lesson. kalau sql connection rocak, bagitau error.
//
//public class SQLExceptionLesson {
//
//    public static void main(String[] args) {
//        try{
//            Connection conn = new Connection("localhost");
//            Statement stmt = conn.createStatement();
//
////            File file = new File("thisDoesNotExist.txt");
//            Scanner scanner = new Scanner(file);
//
//            while(scanner.hasNextLine()){ //kalau jumpa, print the text inside the file
//                String line = scanner.nextLine();
//                System.out.println(line);
//
//            }
//        }catch (FileNotFoundException e){ //kalau ta, file is not found + message.
//            System.out.println("File not found");
//    }catch (SQLException e)
//    {
//        system.out.println("SQL Exception");
//    }
//
//    }
//}
