package Threads;
import static java.lang.Thread.currentThread;
/**
 *
 * @author Axel Ordoñez
 */
public class Instancias {
    public static void main(String args[]) {
        System.out.println("Main thread");
        Thread1 t1 = new Thread1();
        t1.setName("Thread 1");
        Thread2 t2 = new Thread2();
        t2.setName("Thread 2");
        System.out.println("Thread: " + currentThread().getName());
        t1.start();
        t2.start();
        t1.interrupt();
        new Thread() {
            public void run() {
                System.out.println("anonimus thread: " + currentThread());
            }
        }.start();
    }
}