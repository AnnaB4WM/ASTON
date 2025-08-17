public class DeadLockExample {

    public static void main(String[] args) {
        final Object lock1 = new Object();
        final Object lock2 = new Object();

        Thread thread1 = new Thread(() -> {
            System.out.println("Thread1: Попытка захватить монитор объекта lock1");
            synchronized (lock1) {
                System.out.println("Thread1: Монитор объекта lock1 захвачен");
                System.out.println("Thread1: Попытка захватить монитор объекта lock2");
                synchronized (lock2) {
                    System.out.println("Thread1: Мониторы объектов lock1 и lock2 захвачены");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread2: Попытка захватить монитор объекта lock2");
            synchronized (lock2) {
                System.out.println("Thread2: Монитор объекта lock2 захвачен");
                System.out.println("Thread2: Попытка захватить монитор объекта lock1");
                synchronized (lock1) {
                    System.out.println("Thread2: Мониторы объектов lock2 и lock1 захвачены");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
