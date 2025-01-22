package ExceptionProgrammingExercise;

import java.util.Scanner;

public class ExceptionsQ4 {

 public static void main ( String[] args ) {
         int[] someArray = {12 ,9 ,3 ,11};
         int position = getPosition () ;

         try{

             display(someArray,position);
         }catch (ArrayIndexOutOfBoundsException e){
             System.out.println("Error: " + e.getMessage());
             e.printStackTrace();
         }catch (NumberFormatException e){
             System.out.println("Error: " + e.getMessage());
             e.printStackTrace();
         }finally {
             System.out.println("End of program");
         }

 }

 static int getPosition () {
         System . out . println (" Enter array position to display ") ;
         Scanner EasyScanner = new Scanner (System.in);
         String positionEntered = EasyScanner.next();
         return Integer.parseInt(positionEntered);
         }

 static void display ( int [] arrayIn , int posIn ) {

         System.out.println(" Item at this position is : " + arrayIn[posIn]);

 }

 }
