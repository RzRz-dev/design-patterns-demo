import model.Logger;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        * Singleton is a design pattern that lets you ensure that a class has only one instance, providing global access point to this
        * instance.
        * 
        * In this example a simple logger system is going to be implemented.
        */
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application started");
        logger2.log("User logged in");

        System.out.println("Same instance? " + (logger1 == logger2));
    }
}
