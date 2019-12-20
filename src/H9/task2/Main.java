package H9.task2;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newFixedThreadPool(2);
        Future[] futures = new Future[3];
        for (int i = 0; i < futures.length; i++) futures[i] = exec.submit(new Caller(i));
        for (Future f: futures) System.out.println(f.get());
    }
}
