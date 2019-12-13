package H7.com.cherevatyi.task2;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> population = new HashMap<>();
        String city, surname;
        while (true) {
            System.out.print("Enter city: ");
            city = input.readLine();
            System.out.print("Enter surname: ");
            surname = input.readLine();
            if (!(city.equals("") || surname.equals(""))) population.put(city, surname);
            else break;
        }
        while (true) {
            System.out.print("Enter city to get surname: ");
            city = input.readLine();
            if (population.containsKey(city)) System.out.println(population.get(city));
            else break;
        }
        System.out.println("END");
    }
}
