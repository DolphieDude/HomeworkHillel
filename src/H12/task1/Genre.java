package H12.task1;

public class Genre {
    private static final String DF_NAME = "unnamed genre", DF_DESCRIPTION = "no info";

    private String name, description;

    Genre(String name, String description) {
        if(!name.equals("")) this.name = name;
        else this.name = DF_NAME;
        if(!description.equals("")) this.description = description;
        else this.description = DF_DESCRIPTION;
    }

    String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
