package H10.task4;

public class Main {
    public static void main(String[] args) {
        printLambda(s -> s += "!!!", "Hello");
        printLambda(i -> i += 2020, 100);
        printLambda(d -> d -= 0.5, 2.);
        printLambda(b -> !b, false);
    }

    private static <T> void printLambda(GenericFunction<T> lambda, T var) {
        System.out.println(lambda.change(var));
    }
}
