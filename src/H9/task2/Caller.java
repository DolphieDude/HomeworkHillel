package H9.task2;

import java.util.concurrent.Callable;

public class Caller implements Callable<String> {
    private int name;

    Caller(int name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 30; i++) {
            System.out.println(Thread.currentThread().getName() + " name " + this.name);
            Thread.sleep(100);
        }
        Thread.sleep(500);
        return "stop " + this.name;
    }
}