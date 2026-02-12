package controller;

import frameworks.InMemoryLibraryRepository;
import usecases.*;

public class LibraryController {
    private final InMemoryLibraryRepository repository;
    private final AddBookUseCase addBookUseCase;
    private final BorrowBookUseCase borrowBookUseCase;
    private final ListBookUseCase listBookUseCase;
    private final RegisterMemberUseCase registerMemberUseCase;
    private final ReturnBookUseCase returnBookUseCase;

    public LibraryController() {
        this.repository = new InMemoryLibraryRepository();
        this.addBookUseCase = new AddBookUseCase(repository);
        this.borrowBookUseCase = new BorrowBookUseCase(repository);
        this.listBookUseCase = new ListBookUseCase(repository);
        this.registerMemberUseCase = new RegisterMemberUseCase(repository);
        this.returnBookUseCase = new ReturnBookUseCase(repository);
    }

}
