package H12.task1;

class Book {
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

    String getName() {
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
}
