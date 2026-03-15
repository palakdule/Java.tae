import java.util.ArrayList;

class Book {
    String title, author, ISBN;

    Book(String t, String a, String i) {
        title = t;
        author = a;
        ISBN = i;
    }
}

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void removeBook(String isbn) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).ISBN.equals(isbn)) {
                books.remove(i);
            }
        }
    }

    void displayBooks() {
        for (Book b : books) {
            System.out.println(b.title + " " + b.author + " " + b.ISBN);
        }
    }

    public static void main(String[] args) {
        Library l = new Library();
        l.addBook(new Book("Java", "James", "101"));
        l.addBook(new Book("Python", "Guido", "102"));
        l.displayBooks();
    }
}