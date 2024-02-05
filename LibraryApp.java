import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // Dummy data for testing
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        library.addBook(book1);
        library.addBook(book2);

        while (true) {
            System.out.println("\nLibrary Management System\n" +
                    "1. Display Available Books\n" +
                    "2. Borrow a Book\n" +
                    "3. Exit\n" +
                    "Enter your choice:");

            int choice = scanner.nextInt();
            // scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    System.out.println("Enter your name:");
                    String borrowerName = scanner.nextLine();
                    Borrower borrower = new Borrower(borrowerName, 1); // Assuming a unique ID for simplicity
                    System.out.println("Enter the title of the book you want to borrow:");
                    String bookTitle = scanner.nextLine();
                    Book requestedBook = new Book(bookTitle, "");
                    library.borrowBook(requestedBook, borrower);
                    break;
                case 3:
                    System.out.println("Exiting Library Management System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
