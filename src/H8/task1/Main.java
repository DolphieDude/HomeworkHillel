package H8.task1;

public class Main {
    public static void main(String[] args) {
        System.out.print("I'm " + Thread.currentThread().getStackTrace()[1] + " StackTrace: ");
        for (int i = 2; i < Thread.currentThread().getStackTrace().length; i++) System.out.print(Thread.currentThread().getStackTrace()[i] + ";");
        System.out.println();
        second();
    }

    static void second() {
        System.out.print("I'm " + Thread.currentThread().getStackTrace()[1] + " StackTrace: ");
        for (int i = 2; i < Thread.currentThread().getStackTrace().length; i++) System.out.print(Thread.currentThread().getStackTrace()[i] + ";");
        System.out.println();
        third();
    }
    static void third() {
        System.out.print("I'm " + Thread.currentThread().getStackTrace()[1] + " StackTrace: ");
        for (int i = 2; i < Thread.currentThread().getStackTrace().length; i++) System.out.print(Thread.currentThread().getStackTrace()[i] + ";");
        System.out.println();
        fourth();
    }
    static void fourth() {
        System.out.print("I'm " + Thread.currentThread().getStackTrace()[1] + " StackTrace: ");
        for (int i = 2; i < Thread.currentThread().getStackTrace().length; i++) System.out.print(Thread.currentThread().getStackTrace()[i] + ";");
        System.out.println();
        fifth();
    }
    static void fifth() {
        System.out.print("I'm " + Thread.currentThread().getStackTrace()[1] + " StackTrace: ");
        for (int i = 2; i < Thread.currentThread().getStackTrace().length; i++) System.out.print(Thread.currentThread().getStackTrace()[i] + ";");
        System.out.println();
    }
}
