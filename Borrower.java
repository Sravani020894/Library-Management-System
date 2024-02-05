public class Borrower {
    private String name;
    private int borrowerId;

    public Borrower(String name, int borrowerId) {
        this.name = name;
        this.borrowerId = borrowerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(int borrowerId) {
        this.borrowerId = borrowerId;
    }

    @Override
    public String toString() {
        return "Borrower{" +
                "name='" + name + '\'' +
                ", borrowerId=" + borrowerId +
                '}';
    }
}
