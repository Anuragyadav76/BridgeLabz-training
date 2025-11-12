import java.util.*;
class Patient{ String id; Patient(String id){this.id=id;} public boolean equals(Object o){return o instanceof Patient && id.equals(((Patient)o).id);} public int hashCode(){return id.hashCode();} public String toString(){return id;} }
public class HospitalPatientManagement {
    public static void main(String[] args){
        Set<Patient> admitted = new HashSet<>();
        Queue<Patient> waiting = new LinkedList<>();
        Stack<Patient> discharged = new Stack<>();
        List<Patient> history = new ArrayList<>();
        Patient p1 = new Patient("P1"); admitted.add(p1); waiting.add(p1);
        Patient p2 = new Patient("P2"); admitted.add(p2); waiting.add(p2);
        while(!waiting.isEmpty()){
            Patient p = waiting.poll();
            discharged.push(p);
            history.add(p);
        }
        Patient last = discharged.pop();
        admitted.remove(last);
        System.out.println("Re-admit allowed for "+last);
    }
}
