import java.util.*;
class Student{ String id; double marks; Student(String id,double m){this.id=id;this.marks=m;} public boolean equals(Object o){return o instanceof Student && id.equals(((Student)o).id);} public int hashCode(){return id.hashCode();} public String toString(){return id+":"+marks;} }
public class CollegeAdmissionSystem {
    public static void main(String[] args){
        List<Student> applicants = new ArrayList<>();
        applicants.add(new Student("S1",85)); applicants.add(new Student("S2",90));
        Set<Student> shortlisted = new HashSet<>();
        for(Student s:applicants) if(s.marks>80) shortlisted.add(s);
        Queue<Student> interviewQueue = new LinkedList<>(shortlisted);
        TreeSet<Student> merit = new TreeSet<>(new Comparator<Student>(){ public int compare(Student a,Student b){int c=Double.compare(b.marks,a.marks); if(c==0) return a.id.compareTo(b.id); return c; }});
        while(!interviewQueue.isEmpty()){
            Student s = interviewQueue.poll();
            merit.add(s);
        }
        System.out.println("Merit: "+merit);
    }
}
