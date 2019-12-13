package H7.com.cherevatyi.task3;

import java.util.*;

public class Animal {
    static Set<Animal> pets = new HashSet<>();
    static Set<Cat> cats = new HashSet<>();
    static Set<Dog> dogs = new HashSet<>();

    static void join() {
        pets.addAll(dogs);
        pets.addAll(cats);
    }
    static void removeCats() { pets.removeAll(cats); }
    static void printPets() {
        for (Animal a: pets) System.out.print(a + "; ");
        System.out.println();
    }
}
