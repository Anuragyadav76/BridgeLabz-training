package Object;



class Book {
    String title;
    String author;
    double price;

    public void displayBook() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: " + price);
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Java Programming";
        book.author = "James Gosling";
        book.price = 450.50;
        book.displayBook();
    }
}
