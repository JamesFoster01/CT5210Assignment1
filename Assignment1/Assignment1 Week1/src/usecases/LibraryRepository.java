package usecases;

import entities.Book;
import entities.Member;
import entities.BorrowRecord;
import java.util.ArrayList;
import java.util.Optional;

public interface LibraryRepository {

    // Books
    void addBook(Book book);

    ArrayList<Book> getAllBooks();

    Optional<Book> findBookById(String bookId);

    // members
    void addMember(Member member);

    Optional<Member> findMemberById(String memberId);

    // Borrow records
    void addBorrowRecord(BorrowRecord record);

    Optional<BorrowRecord> findActiveBorrowByBookId(String bookId);

    ArrayList<BorrowRecord> getAllBorrowRecords();
}
