import java.util.ArrayList;

class Book {
    String title;
    String author;
    String ISBN;

    // Constructor
    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN);
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    // Add book
    void addBook(Book b) {
        books.add(b);
    }

    // Remove book by ISBN
    void removeBook(String ISBN) {
        books.removeIf(book -> book.ISBN.equals(ISBN));
    }

    // Display all books
    void displayBooks() {
        for (Book b : books) {
            b.display();
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();

        Book b1 = new Book("Java Basics", "James", "101");
        Book b2 = new Book("Python Guide", "Guido", "102");

        lib.addBook(b1);
        lib.addBook(b2);

        System.out.println("Available Books:");
        lib.displayBooks();

        lib.removeBook("101");

        System.out.println("After Removing Book:");
        lib.displayBooks();
    }
}