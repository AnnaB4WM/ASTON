public class LiveLockExample {

    static volatile boolean pass = true;

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            while (pass) {
                System.out.println("Thread 1: Идет вперед... ");
                pass = !pass;
            }
        });

        Thread thread2 = new Thread(() -> {
            while (!pass) {
                System.out.println("Thread 2: Идет вперед... ");
                pass = !pass;
            }
        });
        thread1.start();
        thread2.start();
    }
}
