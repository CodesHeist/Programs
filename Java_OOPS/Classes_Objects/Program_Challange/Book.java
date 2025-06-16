package Program_Challange;

/* WAP to Create a Book class Library System
 * Instance Variable: isbn,author,title
 * Static Variable: totalBooks, a counter to total number of book instance.
 * instance method: borrowedBook(), returnBook()
 * static method: getTotalBook(), too get the total number of book in the library.
 */

class Book {
    static int totalNoBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowedBook;

    static{
        totalNoBooks = 0;
    }
    { //This is not an class Initialiser this is Object Initialiser...
        totalNoBooks++;
    } 
Book(String isbn, String title, String auther){
this.isbn = isbn;
this.author = auther;
this.title = title;
}
Book(String isbn){
    this(isbn ,"Unknown", "Unknown");
}
static int getTotalBook(){
    return totalNoBooks;
}
void borrowedBook(){
    if(isBorrowedBook){
        System.out.println("Book is Already borrowed...");
    }else{
        this.isBorrowedBook=true;
        System.out.println("Enjoy your book "+this.title);
    }
}
void returnBook(){
    if(isBorrowedBook){
        this.isBorrowedBook=false;
        System.out.println("Hope you enjoy the book, Please write us a reviwe note...");
    }else{
        System.out.println("Book is already avilable in the library....");
    }
    }
}

