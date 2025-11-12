import java.util.*;
public class CustomerFeedbackAnalysis {
    public static void main(String[] args){
        List<String> all = new ArrayList<>(); all.add("Good"); all.add("Bad"); all.add("Good");
        Set<String> unique = new LinkedHashSet<>(all);
        Queue<String> queue = new LinkedList<>(unique);
        Stack<String> recent = new Stack<>();
        while(!queue.isEmpty()){
            String f = queue.poll();
            recent.push(f);
        }
        System.out.println("Recent: "+recent);
    }
}
