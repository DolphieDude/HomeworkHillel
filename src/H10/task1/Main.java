package H10.task1;

import java.util.*;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        List<String> collection = new ArrayList<>();
        BiConsumer<List<String>, String> func = (l, s) -> {
            for (int i = 0; i < 10; i++) l.add(s + i);
        };
        func.accept(collection, "Hello");
        collection.forEach(System.out::println);
    }
}
