package Week_3.ExceptionLesson;

/// key charateristics:
/// 1. private constructor: prevent other class from creating instances of the singleton class
/// 2. static instance variables
/// 3. public static methods
///
/// singleton lesson--
///
/// use case: when

public class Singleton {
    private static Singleton instance; //instance variables

    private Singleton() { //private constructor
        System.out.println("Singleton class created");
    }

    //lazy initialisation
    public static Singleton getInstance() {
        if (instance == null) {

            synchronized (Singleton.class) { // synchronised all singleton class

                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }


    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);

    }

}
