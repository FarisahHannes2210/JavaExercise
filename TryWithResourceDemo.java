package TryCatchLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// try catch with resource

public class TryWithResourceDemo {

    public static void main(String[] args) throws IOException {

//        InputStreamReader in = null;

//        BufferedReader br = null;
        int num = 0;


        //no need to use close anymore cuz it will close automatically. optimized the whole coding
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {

//             in = new InputStreamReader(System.in);
//             br = new BufferedReader(new InputStreamReader(System.in));
             num = Integer.parseInt(br.readLine());
            System.out.println("Number is: " + num);

        }
//        finally
//        {
//            br.close();
//            System.out.println("Bye.");
//        }

    }


}
