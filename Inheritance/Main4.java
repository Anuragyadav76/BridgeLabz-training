class Book {
    String title;
    int publicationYear;
}

class Author extends Book {
    String name;
    String bio;
    void displayInfo() {
        System.out.println("Book: " + title + " (" + publicationYear + ")");
        System.out.println("Author: " + name + " - " + bio);
    }
}

public class Main4 {
    public static void main(String[] args) {
        Author a = new Author();
        a.title = "Java Basics";
        a.publicationYear = 2020;
        a.name = "James Gosling";
        a.bio = "Creator of Java";
        a.displayInfo();
    }
}
