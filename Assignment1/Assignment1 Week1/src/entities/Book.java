package entities;

public class Book {
    private final String title;
    private final String author;
    private final String isbn;
    private int copies;
    private int availableCopies;

    public Book(String title, String author, String isbn, int copies) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.copies = copies;
        this.availableCopies = copies;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAvailableCopies() {
        return copies;
    }

    public boolean isAvailable() {
        return availableCopies > 0;
    }

    public void decrementAvailableCopies() {
        if (availableCopies > 0) {
            availableCopies--;
        }
    }

    public void incrementAvailableCopies() {
        this.copies++;
    }

    @Override
    public String toString() {
        return "Book{ title='" + title + "', author='" + author + "', isbn='" + isbn + "', copies='"
                + copies + "'}";
    }
}