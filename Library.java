import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Library {
    private List<Book> books;
    private List<Borrower> borrower;
    private List<Transaction> transactions;

    public Library() {
        this.books = new ArrayList<>();
        this.borrower = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Available Books:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void borrowBook(Book book, Borrower borrower) {
        if (!books.contains(book)) {
            System.out.println("Book not available in the library.");
            return;
        }

        // Implement borrow book logic
        Transaction transaction = new Transaction(book, borrower, new Date(), null);
        transactions.add(transaction);
        System.out.println(borrower.getName() + " borrowed " + book.getTitle());
    }

    // Additional methods for borrower and transaction management

    // ...

}
