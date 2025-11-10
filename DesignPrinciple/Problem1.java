package DesignPrinciple;

import java.util.*;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println(title + " by " + author);
    }
}

class Library {
    String name;
    List<Book> books;

    Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    void addBook(Book b) {
        books.add(b);
    }

    void showBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            b.display();
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("The Alchemist", "Paulo Coelho");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2);

        lib1.showBooks();
        lib2.showBooks();
    }
}

