package H12.task1;

import java.io.IOException;
import java.util.ArrayList;

class Book implements LibraryObject {
    private static final String DF_NAME = "unnamed", DF_DESCRIPTION = "no info";
    private static final int DF_DATE = 2000;

    private String name, description;
    private int dateOfRelease;
    private Genre genre;

    Book(String name, String description, int dateOfRelease, Genre genre) {
        if(!name.equals("")) this.name = name;
        else this.name = DF_NAME;
        if(!description.equals("")) this.description = description;
        else this.description = DF_DESCRIPTION;
        if(dateOfRelease > 0) this.dateOfRelease = dateOfRelease;
        else this.dateOfRelease = DF_DATE;
        this.genre = genre;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dateOfRelease=" + dateOfRelease +
                ", genre=" + genre.getName() +
                '}';
    }

    static void manipulate(ArrayList<Book> books, ArrayList<Genre> genres) throws IOException {
        while (true) {
            System.out.println("BOOKS");
            System.out.println("1. Add new");
            System.out.println("2. Remove");
            System.out.println("3. Print list");
            System.out.println("4. QUIT FROM BOOKS");
            System.out.print("::");
            Main.in = Main.input.readLine();
            try {
                Main.num = Integer.parseInt(Main.in);
            } catch (NumberFormatException e) {
                System.out.println("Wrong input");
                continue;
            }
            if (!Main.check1To3.test(Main.num)) continue;
            switch (Main.num) {
                case 1:
                    String name, description;
                    int dateOfRelease = 0;
                    Genre genre = null;
                    System.out.println("Enter name of book");
                    System.out.print("::");
                    name = Main.input.readLine();
                    System.out.println("Enter description of book");
                    System.out.print("::");
                    description = Main.input.readLine();
                    System.out.println("Enter date of release of book");
                    System.out.print("::");
                    try {
                        dateOfRelease = Integer.parseInt(Main.input.readLine());
                    } catch (NumberFormatException e) {
                    }
                    System.out.println("Choose genre for it");
                    Main.printAll(genres);
                    try {
                        Main.num = Integer.parseInt(Main.input.readLine());
                        genre = genres.get(Main.num - 1);
                        System.out.println(genre);
                    } catch (Exception e) {
                        System.out.println("Not found");
                    }
                    books.add(new Book(name, description, dateOfRelease, genre));
                    System.out.println("ADDED");
                    continue;
                case 2:
                    System.out.println("Enter number of book or its name to remove");
                    System.out.print("::");
                    try {
                        Main.in = Main.input.readLine();
                        Main.num = Integer.parseInt(Main.in);
                        System.out.println(books.get(Main.num - 1));
                        books.remove(Main.num - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Sorry, not found on this index");
                        continue;
                    } catch (NumberFormatException e) {
                        for (Main.num = 0; Main.num < books.size(); Main.num++)
                            if (books.get(Main.num).getName().equals(Main.in))
                                break;
                        System.out.println(books.get(Main.num));
                        books.remove(Main.num);
                    }
                    System.out.println("REMOVED");
                    continue;
                case 3:
                    Main.printAll(books);
                    System.out.println("Enter number of book to read more about it, or anything else to quit");
                    System.out.print("::");
                    try {
                        Main.num = Integer.parseInt(Main.input.readLine());
                        System.out.println(books.get(Main.num - 1));
                    } catch (Exception e) {
                        System.out.println("Not found. Quit");
                    }
                    System.out.println("DONE");
                    continue;
                default:
                    System.out.println("QUIT BOOKS");
            }
            break;
        }
    }
}
