package H9.task2;

import java.util.concurrent.Callable;

public class Caller implements Callable {
    int name;

    public Caller(int name) {
        this.name = name;
    }

    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 30; i++) {
            System.out.println(Thread.currentThread().getName() + " name " + this.name);
            Thread.sleep(100);
        }
        Thread.sleep(500);
        return "stop " + this.name;
    }
}