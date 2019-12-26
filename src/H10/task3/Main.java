package H10.task3;

import java.io.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter word: ");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String in = input.readLine();
        Function<String, String> func = s -> {
            StringBuilder result = new StringBuilder();
            for (int i = s.length() - 1; i >= 0; i--) result.append(s.charAt(i));
            return result.toString();
        };
        System.out.println(func.apply(in));
    }
}
