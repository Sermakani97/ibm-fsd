package thread_demo_20th_08;
import java.util.Vector;

public class ProducerConsumerSolution {

    public static void main(String args[]) {
        Vector<Integer> sharedQueue = new Vector<Integer>();
        int size = 4;
        Thread prodThread = new Thread(new Producer(sharedQueue, size), "Producer");
        Thread consThread = new Thread(new Consumer(sharedQueue, size), "Consumer");
        prodThread.start();
        consThread.start();
    }
}
