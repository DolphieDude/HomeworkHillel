package H12.task1;

import java.util.ArrayList;
import java.util.List;

class Author {
    private static final String DF_NAME = "unknown name", DF_SURNAME = "unknown surname";
    private String name, surname;
    private List<Book> listOfBooks = new ArrayList();

    Author(String name, String surname) {
        if(!name.equals("")) this.name = name;
        else this.name = DF_NAME;
        if(!surname.equals("")) this.surname = surname;
        else this.surname = DF_SURNAME;
    }

    String getName() {
        return this.name;
    }

    void addBook(Book book) {
        listOfBooks.add(book);
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
}
