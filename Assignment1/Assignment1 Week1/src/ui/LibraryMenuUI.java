package ui;

import controller.LibraryController;
import java.util.Scanner;

public class LibraryMenuUI {
    private final LibraryController controller;
    private final Scanner scanner;
    private boolean running;

    public LibraryMenuUI(LibraryController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
        this.running = true;
    }
    // introduce user to the library
    // provide a selection 1 through X of options to choose from
    // 1) Add a book
    // 2) Loan a book
    // i) list out available books
    // //user selects from list.
    // //update inmemorylibraryrepository.
    // 3) Check availability of a book
    // i) search by book id
    // ii) search by title
    // Scan for the input and send the choice to the controller.
}
