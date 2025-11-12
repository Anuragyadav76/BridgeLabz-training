import java.util.*;
class Question{ String q; Question(String q){this.q=q;} public String toString(){return q;} }
class Student{ String id; Student(String id){this.id=id;} public String toString(){return id;} }
public class OnlineExamSystem {
    public static void main(String[] args){
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("Q1"));
        questions.add(new Question("Q2"));
        questions.add(new Question("Q3"));
        Collections.shuffle(questions);
        Set<String> studentIds = new HashSet<>();
        studentIds.add("S1"); studentIds.add("S2"); studentIds.add("S1");
        Queue<Student> queue = new LinkedList<>();
        queue.add(new Student("S1")); queue.add(new Student("S2"));
        Stack<Question> nav = new Stack<>();
        for(Question q:questions) nav.push(q);
        while(!queue.isEmpty()){
            Student s = queue.poll();
            System.out.println("Serving "+s);
        }
        while(!nav.isEmpty()){
            System.out.println("Question: "+nav.pop());
        }
    }
}
