import java.util.*;
class Book{ String id; String title; Book(String id,String t){this.id=id;this.title=t;} public String toString(){return id+":"+title;} }
public class LibraryManagementSystem {
    public static void main(String[] args){
        List<Book> books = new ArrayList<>(); books.add(new Book("B1","Java")); books.add(new Book("B2","DSA"));
        Set<String> members = new HashSet<>(); members.add("M1"); members.add("M2"); members.add("M1");
        Queue<Book> issueQueue = new LinkedList<>(); issueQueue.add(books.get(0));
        Stack<Book> returned = new Stack<>(); returned.push(books.get(1));
        if(!returned.isEmpty()) System.out.println("Re-issue "+returned.pop());
    }
}
