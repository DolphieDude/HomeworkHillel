package H12.task1;

import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

public class Main {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static String in;
    static int num;
    static Predicate<Integer> check1To3 = i -> i >= 1 && i <= 4;
    public static void main(String[] args) throws IOException {
        ArrayList<Author> authors = new ArrayList();
        ArrayList<Book> books = new ArrayList();
        ArrayList<Genre> genres = new ArrayList();
        System.out.println("Library START");
        while(true) {
            System.out.println("Choose with what to manipulate");
            System.out.println("1. Genres");
            System.out.println("2. Books");
            System.out.println("3. Authors");
            System.out.println("4. QUIT");
            System.out.print("::");
            in = input.readLine();
            try {
                num = Integer.parseInt(in);
            }
            catch(NumberFormatException e) {
                System.out.println("Wrong input");
                continue;
            }
            if(!check1To3.test(num)) continue;
            switch (num) {
                case 1:
                    Genre.manipulate(genres);
                    continue;
                case 2:
                    Book.manipulate(books, genres);
                    continue;
                case 3:
                    Author.manipulate(authors, books);
                    continue;
                default:
                    System.out.println("FINISHED");
            }
            break;
        }
    }

    static void printAll(ArrayList<? extends LibraryObject> genres) {
        AtomicInteger i = new AtomicInteger(1);
        genres.forEach((e -> {
            System.out.print(i + "=" + e.getName() + ";");
            i.incrementAndGet();
        }));
        System.out.println();
    }
}
