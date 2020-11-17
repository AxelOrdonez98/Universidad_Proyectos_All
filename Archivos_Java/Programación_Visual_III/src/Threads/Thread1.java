package Threads;
import static java.lang.Thread.currentThread;
import java.sql.Timestamp;
/**
 *
 * @author Axel Ordoñez
 */
public class Thread1 extends Thread {
    @Override
    public void run() {
        Timestamp tp = new Timestamp(System.currentTimeMillis());
        System.out.println(currentThread().getName() + " Tiempo 1: " + tp);
        try {
            Thread.sleep(4000);
        } catch(InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
