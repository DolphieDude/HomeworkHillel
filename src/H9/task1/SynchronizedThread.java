package H9.task1;

public class SynchronizedThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) Main.nextCounter();
    }
}
