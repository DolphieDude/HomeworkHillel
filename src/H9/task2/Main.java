package H9.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newFixedThreadPool(2);
        List<Callable<String>> callables = new ArrayList(3);
        for (int i = 0; i < 3; i++) callables.add(new Caller(i));
        List<Future<String>> futures = exec.invokeAll(callables);
        for (Future f: futures) System.out.println(f.get());
//        for (int i = 0; i < futures.size(); i++) futures.add(exec.submit(new Caller(i)));
//        for (Future f: futures) System.out.println(f.get());
    }
}
