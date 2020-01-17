package H12.task1;

import java.io.IOException;
import java.util.ArrayList;

public class Genre implements LibraryObject {
    private static final String DF_NAME = "unnamed genre", DF_DESCRIPTION = "no info";

    private String name, description;

    private Genre(String name, String description) {
        if(!name.equals("")) this.name = name;
        else this.name = DF_NAME;
        if(!description.equals("")) this.description = description;
        else this.description = DF_DESCRIPTION;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    static void manipulate(ArrayList<Genre> genres) throws IOException {
        while(true) {
            System.out.println("GENRES");
            System.out.println("1. Add new");
            System.out.println("2. Remove");
            System.out.println("3. Print list");
            System.out.println("4. QUIT FROM GENRES");
            System.out.print("::");
            Main.in = Main.input.readLine();
            try {
                Main.num = Integer.parseInt(Main.in);
            } catch (NumberFormatException e) {
                System.out.println("Wrong input");
                continue;
            }
            if (!Main.check1To3.test(Main.num)) continue;
            switch(Main.num) {
                case 1:
                    String name, description;
                    System.out.println("Enter name of genre");
                    System.out.print("::");
                    name = Main.input.readLine();
                    System.out.println("Enter description of genre");
                    System.out.print("::");
                    description = Main.input.readLine();
                    genres.add(new Genre(name, description));
                    System.out.println("ADDED");
                    continue;
                case 2:
                    System.out.println("Enter number of genre or its name to remove");
                    System.out.print("::");
                    try {
                        Main.in = Main.input.readLine();
                        Main.num = Integer.parseInt(Main.in);
                        System.out.println(genres.get(Main.num - 1));
                        genres.remove(Main.num - 1);
                    }
                    catch (IndexOutOfBoundsException e) {
                        System.out.println("Sorry, not found on this index");
                        continue;
                    }
                    catch (NumberFormatException e) {
                        for (Main.num = 0; Main.num < genres.size(); Main.num++) if (genres.get(Main.num).getName().equals(Main.in))
                            break;
                        System.out.println(genres.get(Main.num));
                        genres.remove(Main.num);
                    }
                    System.out.println("REMOVED");
                    continue;
                case 3:
                    Main.printAll(genres);
                    System.out.println("Enter number of genre to read more about it, or anything else to quit");
                    System.out.print("::");
                    try {
                        Main.num = Integer.parseInt(Main.input.readLine());
                        System.out.println(genres.get(Main.num - 1));
                    }
                    catch (Exception e) {
                        System.out.println("Not found. Quit");
                    }
                    System.out.println("DONE");
                    continue;
                default:
                    System.out.println("QUIT GENRES");
            }
            break;
        }
    }
}
