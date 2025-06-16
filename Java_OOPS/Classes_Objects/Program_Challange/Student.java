package Program_Challange;
// This Java file basically made to access the java file Book.java 

public class Student {
    public static void main(String[] args) {
        System.out.println("\nThis Case is for the book onlyn have isbn no. only...\n");
        Book LibraryBooks = new Book("1");
        Book.getTotalBook();
        LibraryBooks.borrowedBook();
        LibraryBooks.borrowedBook();
        LibraryBooks.returnBook();
        System.out.println("This is Total Number of Books : "+Book.totalNoBooks);
        LibraryBooks.borrowedBook();
        LibraryBooks.returnBook();
        LibraryBooks.returnBook();
        System.out.println("This is the Book ISBN no. : "+LibraryBooks.isbn);

        System.out.println("\nThis Case is for the Book have all three Inputs...\n");
        Book book = new Book("2", "DaysOfWeekends", "Mr. WW.");
        book.borrowedBook();
        book.returnBook();
        book.borrowedBook();
        System.out.println(book.author);
        book.borrowedBook();

    }
}
