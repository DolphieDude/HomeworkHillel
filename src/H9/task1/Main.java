package H9.task1;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static Integer counter = 0;
    private static AtomicInteger atomicCounter = new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException {
	    Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length / 2; i++) {
            threads[i] = new SynchronizedThread();
            threads[i].run();
        }
        for (int i = threads.length / 2; i < threads.length; i++) {
            threads[i] = new AtomicThread();
            threads[i].run();
        }
        for (Thread t: threads) t.join();
        System.out.println(counter + atomicCounter.get());
    }
    static void nextCounter() {
        synchronized (counter) {
            counter++;
        }
    }
    static void nextAtomic() {
        atomicCounter.incrementAndGet();
    }
}
