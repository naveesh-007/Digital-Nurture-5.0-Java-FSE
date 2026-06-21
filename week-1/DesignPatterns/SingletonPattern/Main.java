package SingletonPattern;

public class Main {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();

        logger1.log("Application Started");

        Logger logger2 = Logger.getInstance();

        logger2.log("User Logged In");

        System.out.println();

        System.out.println("Logger 1 HashCode : " + logger1.hashCode());
        System.out.println("Logger 2 HashCode : " + logger2.hashCode());

        if (logger1 == logger2) {
            System.out.println("\nOnly One Logger Instance Exists");
        } else {
            System.out.println("\nMultiple Instances Created");
        }
    }
}