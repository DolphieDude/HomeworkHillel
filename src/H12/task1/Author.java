package H12.task1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Author implements LibraryObject {
    private static final String DF_NAME = "unknown name", DF_SURNAME = "unknown surname";
    private String name, surname;
    private List<Book> listOfBooks = new ArrayList();

    Author(String name, String surname) {
        if(!name.equals("")) this.name = name;
        else this.name = DF_NAME;
        if(!surname.equals("")) this.surname = surname;
        else this.surname = DF_SURNAME;
    }

    public String getName() {
        return this.name + " " + this.surname;
    }

    @Override
    public String toString() {
        String result = "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", listOfBooks[";
        for (Book b: listOfBooks) result += b.getName() + ';';
        return result += "]}";
    }

    void addBook(Book book) {
        this.listOfBooks.add(book);
    }

    static void manipulate(ArrayList<Author> authors, ArrayList<Book> books) throws IOException {
        while (true) {
            System.out.println("AUTHORS");
            System.out.println("1. Add new");
            System.out.println("2. Remove");
            System.out.println("3. Print list");
            System.out.println("4. Add book");
            System.out.println("5. QUIT FROM AUTHORS");
            System.out.print("::");
            Main.in = Main.input.readLine();
            try {
                Main.num = Integer.parseInt(Main.in);
            } catch (NumberFormatException e) {
                System.out.println("Wrong input");
                continue;
            }
            if (Main.num == 5) {
                System.out.println("QUIT BOOKS");
                break;
            }
            else if (!Main.check1To3.test(Main.num)) continue;
            switch (Main.num) {
                case 1:
                    String name, surname;
                    System.out.println("Enter name of author");
                    System.out.print("::");
                    name = Main.input.readLine();
                    System.out.println("Enter surname of author");
                    System.out.print("::");
                    surname = Main.input.readLine();
                    authors.add(new Author(name, surname));
                    System.out.println("ADDED");
                    break;
                case 2:
                    System.out.println("Enter number of author or its \"name surname\" to remove");
                    System.out.print("::");
                    try {
                        Main.in = Main.input.readLine();
                        Main.num = Integer.parseInt(Main.in);
                        System.out.println(authors.get(Main.num - 1));
                        authors.remove(Main.num - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Sorry, not found on this index");
                        break;
                    } catch (NumberFormatException e) {
                        for (Main.num = 0; Main.num < authors.size(); Main.num++)
                            if (authors.get(Main.num).getName().equals(Main.in))
                                break;
                        System.out.println(authors.get(Main.num));
                        authors.remove(Main.num);
                    }
                    System.out.println("REMOVED");
                    break;
                case 3:
                    Main.printAll(authors);
                    System.out.println("Enter number of author to read more about it, or anything else to quit");
                    System.out.print("::");
                    try {
                        Main.num = Integer.parseInt(Main.input.readLine());
                        System.out.println(authors.get(Main.num - 1));
                    } catch (Exception e) {
                        System.out.println("Not found. Quit");
                    }
                    System.out.println("DONE");
                    break;
                default:
                    System.out.println("Choose author by number");
                    Main.printAll(authors);
                    Author toAddBook;
                    try {
                        Main.num = Integer.parseInt(Main.input.readLine());
                        toAddBook = authors.get(Main.num - 1);
                    } catch (Exception e) {
                        System.out.println("Not found. Quit");
                        break;
                    }
                    System.out.println("Choose book to add by number");
                    Main.printAll(books);
                    try {
                        Main.num = Integer.parseInt(Main.input.readLine());
                        toAddBook.addBook(books.get(Main.num - 1));
                        System.out.println(books.get(Main.num - 1));
                    } catch (Exception e) {
                        System.out.println("Not found. Quit");
                    }
                    System.out.println("DONE");
            }
        }
    }
}
