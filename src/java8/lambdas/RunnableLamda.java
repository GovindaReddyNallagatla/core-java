package java8.lambdas;

public class RunnableLamda {

    public static void main(String[] args) {

        // Before java 8
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("Runnable 1");
            }
        };

        new Thread(runnable).start();

        // Using java 8 Lambdas

        Runnable runnable2 = () -> System.out.println("Runnable 2");
        new Thread(runnable2).start();

        new Thread(() -> System.out.println("Runnable 3")).start();
    }
}
