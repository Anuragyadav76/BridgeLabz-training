import java.util.*;
class Movie{ String id; String genre; Movie(String id,String g){this.id=id;this.genre=g;} public String toString(){return id+":"+genre;} }
public class StreamingWatchHistory {
    public static void main(String[] args){
        Stack<Movie> history = new Stack<>();
        List<Movie> library = new ArrayList<>(); library.add(new Movie("M1","Action")); library.add(new Movie("M2","Drama"));
        Set<String> genres = new HashSet<>();
        Queue<Movie> upNext = new LinkedList<>(); upNext.add(library.get(0)); upNext.add(library.get(1));
        Movie current = upNext.poll();
        history.push(current); genres.add(current.genre);
        System.out.println("History: "+history);
        System.out.println("Genres: "+genres);
    }
}
