import java.util.*;

class BookNotAvailableException extends Exception {
    BookNotAvailableException(String msg) {
        super(msg);
    }
}

class Library {
    int availableBooks;

    Library(int a) {
        availableBooks = a;
    }

    void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks = availableBooks - count;
            System.out.println("Book issued successfully");
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}

public class CE pr63 {
    public static void main(String[] args) {
        Library lib = new Library(3);

        try {
            lib.issueBook(2);
            lib.issueBook(2);
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}