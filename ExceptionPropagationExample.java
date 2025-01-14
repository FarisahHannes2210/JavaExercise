package Week_3.ExceptionLesson;

public class ExceptionPropagationExample {
    public static void main(String[] args) {
        try {
// Call method1, which can throw an Exception
            method1();
        } catch (Exception e) {
// Catch any Exception thrown by method1
            System.out.println("Exception caught in main method: " + e.getMessage());
        }
    }

    //stack overflow: memory filled to the brim it flowed out.

    // Method1 declares that it can throw an Exception
    public static void method1() throws Exception {
        System.out.println("Inside method1");
        method2(); // Call method2, which can also throw an Exception
    }

    // Method2 declares that it can throw an Exception
    public static void method2() throws Exception {
        System.out.println("Inside method2"); // Call method3, which can also throw an Exception

    }
}
