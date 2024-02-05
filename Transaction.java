import java.util.Date;

public class Transaction {
    private Book book;
    private Borrower borrower;
    private Date issueDate;
    private Date returnDate;

    public Transaction(Book book, Borrower borrower, Date issueDate, Date returnDate) {
        this.book = book;
        this.borrower = borrower;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }

    public Book getBook() {
        return book;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "book=" + book +
                ", borrower=" + borrower +
                ", issueDate=" + issueDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
