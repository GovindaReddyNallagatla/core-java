package MultiThreading.ctreation;

public class Main {

    public static void main(String[] args) {

        //Thread thread = new Thread(() -> System.out.println("We are running "+Thread.currentThread().getName()));

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("We are running->"+Thread.currentThread().getName());
            }
        });
        thread.setName("New Worker Thread");
        thread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Before starting the thread "+Thread.currentThread().getName());
        thread.start();
        System.out.println("After starting the thread "+Thread.currentThread().getName());
    }
}
