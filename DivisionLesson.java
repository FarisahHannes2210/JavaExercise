package Week_3.ExceptionLesson;

public class DivisionLesson {

    //put try catch where you want it to handle the exception..try catch is still handled

    public static void main(String[] args) {

        try { //try is the block of code that will run
            divide(10, 0);

        } catch (ArithmeticException e) { //catch is what we can do to handle it
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace(); //useful to debug code

        }
    }

    //eg; [i throw a ball at you, you handle this.] use throw keywords when doing on other methods.
    //throw bomb at method. getting rid of it literally
    //exception is being handled by other method. main difused the bomb

    //throws: if condition is met, declare arithmetic exception
    //throw: this happened. method throw it to the method that called it. and main have try catch, so it will be handled there
    public static void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by 0");
        }
        int result = a / b;
        System.out.println("Result: " + result);
    }
}
