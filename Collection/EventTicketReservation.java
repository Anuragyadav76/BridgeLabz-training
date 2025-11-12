import java.util.*;
class Booking{ String id; boolean vip; String user; Booking(String id,String u,boolean v){this.id=id;this.user=u;this.vip=v;} public String toString(){return id+":"+user+":"+vip;} }
public class EventTicketReservation {
    public static void main(String[] args){
        List<Booking> all = new ArrayList<>();
        Set<String> users = new HashSet<>();
        Queue<Booking> queue = new LinkedList<>();
        PriorityQueue<Booking> vipFirst = new PriorityQueue<>(new Comparator<Booking>(){ public int compare(Booking a,Booking b){ return Boolean.compare(b.vip,a.vip); }});
        users.add("U1"); users.add("U2");
        Booking b1 = new Booking("B1","U1",false); if(users.contains(b1.user)) { queue.add(b1); vipFirst.add(b1); all.add(b1); }
        Booking b2 = new Booking("B2","U3",true); if(users.add(b2.user)) { queue.add(b2); vipFirst.add(b2); all.add(b2); }
        while(!vipFirst.isEmpty()) System.out.println("Confirming "+vipFirst.poll());
    }
}
