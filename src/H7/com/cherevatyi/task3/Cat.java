package H7.com.cherevatyi.task3;

import java.util.*;

public class Cat extends Animal {
    public static void createCats() {
        HashSet<Cat> result = new HashSet<>();
        for (int i = 0; i < 4; i++) result.add(new Cat());
        cats.clear();
        cats.addAll(result);
    }

    @Override
    public String toString() { return "Cat"; }
}
