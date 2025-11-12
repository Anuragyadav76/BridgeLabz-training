import java.util.*;
class Parcel{ String id; int priority; Parcel(String id,int p){this.id=id;this.priority=p;} public String toString(){return id+":"+priority;} }
public class CourierDeliveryRouting {
    public static void main(String[] args){
        PriorityQueue<Parcel> pq = new PriorityQueue<>(new Comparator<Parcel>(){ public int compare(Parcel a,Parcel b){ return Integer.compare(b.priority,a.priority); }});
        Set<String> assigned = new HashSet<>();
        List<Parcel> completed = new ArrayList<>();
        Queue<Parcel> normal = new LinkedList<>();
        Parcel p1 = new Parcel("PX1",5); if(assigned.add(p1.id)) pq.add(p1);
        Parcel p2 = new Parcel("PX2",1); if(assigned.add(p2.id)) normal.add(p2);
        while(!pq.isEmpty()) completed.add(pq.poll());
        while(!normal.isEmpty()) completed.add(normal.poll());
        System.out.println("Completed: "+completed);
    }
}
