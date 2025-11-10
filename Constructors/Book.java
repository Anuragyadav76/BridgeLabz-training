package Constructors;

public class Book {
    String title;
    String author;
    int price;

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String author) {
        this(title);
        this.author = author;
    }

    public Book(String title, String author, int price) {
        this(title, author);
        this.price = price;
    }

    public Book(Book object) {
        this.title = object.title;
        this.author = object.author;
        this.price = object.price;
    }

    void display() {
        System.out.println(title + " " + author + " " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java");
        Book b2 = new Book("Python", "xyz");
        Book b3 = new Book("C++", "abc", 500);
        Book b4 = new Book(b3);
        b1.display();
        b2.display();
        b3.display();
        b4.display();
    }
    
}
