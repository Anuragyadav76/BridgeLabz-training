package InstanceofOperator;

class Book {
    private static String libraryName = "National Library";
    private final String isbn;
    private String title;
    private String author;

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void displayDetails() {
        if (this instanceof Book) {
            System.out.println("ISBN: " + isbn + ", Title: " + title + ", Author: " + author);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("B101", "Java Basics", "Khapra");
        Book b2 = new Book("B102", "Python OOP", "Guido");
        b1.displayDetails();
        b2.displayDetails();
        Book.displayLibraryName();
    }
}

