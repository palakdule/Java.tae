class Book {
    String title, author;
    double price;

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println(title + " " + author + " " + price);
    }

    public static void main(String[] args) {
        Book books[] = new Book[3];

        books[0] = new Book("Java", "James", 500);
        books[1] = new Book("Python", "Guido", 600);
        books[2] = new Book("C++", "Bjarne", 550);

        for (Book b : books) {
            b.display();
        }
    }
}