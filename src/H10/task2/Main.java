package H10.task2;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Car> autos = new ArrayList<>();
        autos.add(new Car(2000, "Sedan"));
        autos.add(new Car(1500, "Smart"));
        autos.add(new Car(1750, "Sedan"));
        autos.add(new Car(2400, "Truck"));
        autos.add(new Car(1400, "Sedan"));
        Predicate<Car> func = c -> c.getWeight() < 2000 && c.getType().toLowerCase().equals("sedan");
        autos.forEach(c -> {
            if(func.test(c)) System.out.println(c);
        });
    }
}
