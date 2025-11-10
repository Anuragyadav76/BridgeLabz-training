package Constructors;
class Books {
    public String ISBN;
    protected String title;
    private String author;

    Books(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    void display() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
    }
}

class EBook extends Books {
    double fileSize;

    EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    void displayDetails() {
        System.out.println("EBook ISBN: " + ISBN + ", Title: " + title + ", File Size: " + fileSize + "MB");
    }

    public static void main(String[] args) {
        EBook eb = new EBook("12345", "Java OOP", "Khapra", 2.5);
        eb.display();
        eb.displayDetails();
        eb.setAuthor("Shraddha Khapra");
        System.out.println("Updated Author: " + eb.getAuthor());
    }
}
