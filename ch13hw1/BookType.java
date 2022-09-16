package ch13hw1;
public enum BookType {
    ADVENTURE("ADVENTURE"), FANTASY("FANTASY"), NONFICTION("NONFICTION"), HORROR("HORROR"), CLASSICS("CLASSİCS");

    private String description;

    BookType(final String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}