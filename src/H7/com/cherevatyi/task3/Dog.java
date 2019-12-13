package H7.com.cherevatyi.task3;

import java.util.*;

public class Dog extends Animal {
    public static void createDogs() {
        HashSet<Dog> result = new HashSet<>();
        for (int i = 0; i < 3; i++) result.add(new Dog());
        dogs.clear();
        dogs.addAll(result);
    }

    @Override
    public String toString() { return "Dog"; }
}
