package usecases;

import entities.Book;
import java.util.ArrayList;

public class ListBookUseCase { // Typo it said ListBooksUseCase --> changed to ListBookUseCase
    private final LibraryRepository repo;

    public ListBookUseCase(LibraryRepository repo) {
        this.repo = repo;
    }

    public ArrayList<Book> execute() {
        return repo.getAllBooks();
    }
}
