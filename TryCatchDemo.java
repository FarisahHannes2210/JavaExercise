package TryCatchLesson;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//normal try-catch

public class TryCatchDemo {

    public static void main(String[] args) {


        try
        {

            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            int num = Integer.parseInt(br.readLine());
            System.out.println("Number is: " + num);
            br.close();


        }
        catch(Exception e)
        {
            System.out.println("Error: Insert number only");

        }finally
        {
            System.out.println("Bye.");
        }

    }
}
