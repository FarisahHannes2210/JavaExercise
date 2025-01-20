package ExceptionHandlingExercise;

import java.util.Scanner;

public class SocialMediaProfile {

    String username;
    int age;
    String bio;

    public SocialMediaProfile(String username, int age, String bio) {
        this.username = username;
        this.age = age;
        this.bio = bio;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {

        return age;
    }

    public String getBio() {

        return bio;
    }

     void createProfile(String username, int age, String bio) throws IllegalArgumentException, IndexOutOfBoundsException {

            if( username == null || username.isEmpty()) {
                throw new IllegalArgumentException("Username cannot be empty.");
            }

            if(age <13 || age > 120){
                throw new IllegalArgumentException("Age must be between 13 and 120.");
            }

            if (bio.length() > 160) {

                throw new IndexOutOfBoundsException("Bio cannot exceed 160 characters.");

            }
    }

     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         System.out.println("Create Social Media!!");

         System.out.print("Enter your username: ");
         String username = scanner.nextLine();

         System.out.print("Enter your age: ");
         int age = scanner.nextInt();

         System.out.print("Enter your bio: ");
         scanner.nextLine();
         String bio = scanner.nextLine();


         SocialMediaProfile profile = new SocialMediaProfile(username, age, bio);

         try {

             profile.createProfile(profile.getUsername(), profile.getAge(), profile.getBio());

             System.out.println("Profile created!");
             System.out.println("Username: " + profile.getUsername());
             System.out.println("Age: " + profile.getAge());
             System.out.println("Bio: " + profile.getBio());

         } catch (IllegalArgumentException e) {
             System.out.println("Error: " + e.getMessage());

         } catch (IndexOutOfBoundsException e) {
             System.out.println("Error: " + e.getMessage());

         }
     }
}

// all types of checked exceptions:
// IllegalArgumentException
// IndexOutOfBoundsException
// NullPointerException

//all types of unchecked exceptions:
// ArithmeticException
// ArrayIndexOutOfBoundsException
// NullPointerException

//numberformatexception is an unchecked exception
//nullpointerexception is a checked exception

//claiming an exception
// try {
//     // code that might throw an exception
// } catch (Exception e) {
//     // handle the exception:

//throwing an exception:
//throw new Exception();

//catching an exception:
//try {
//    // code that might throw an exception
//} catch (Exception e) {
//    // handle the exception
//}

//when do i use try-with-resources construct? when you have a resource that needs to be closed after use
//for example:
//try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
//    // code that uses the BufferedReader
//}

//what is exceptions?







