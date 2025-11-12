import java.util.*;
class RideRequest implements Comparable<RideRequest>{ String id; int priority; double distance;
    RideRequest(String id,int p,double d){this.id=id;this.priority=p;this.distance=d;}
    public int compareTo(RideRequest r){ if(this.priority!=r.priority) return Integer.compare(r.priority,this.priority); return Double.compare(this.distance,r.distance); }
    public String toString(){ return id+" pr:"+priority+" d:"+distance; }
}
class Driver{ String id; Driver(String id){this.id=id;} public String toString(){return id;} public boolean equals(Object o){ return o instanceof Driver && id.equals(((Driver)o).id);} public int hashCode(){return id.hashCode();} }
class Ride{ String id; Ride(String id){this.id=id;} public String toString(){return id;} }
public class RideSharingDispatch {
    public static void main(String[] args){
        PriorityQueue<RideRequest> pqueue = new PriorityQueue<>();
        pqueue.add(new RideRequest("R1",1,5.0));
        pqueue.add(new RideRequest("R2",5,2.0));
        pqueue.add(new RideRequest("R3",3,1.0));
        Set<Driver> drivers = new HashSet<>();
        drivers.add(new Driver("D1")); drivers.add(new Driver("D2"));
        List<Ride> completed = new ArrayList<>();
        Queue<RideRequest> pending = new LinkedList<>();
        while(!pqueue.isEmpty()){
            RideRequest req = pqueue.poll();
            if(!drivers.isEmpty()){
                Driver d = drivers.iterator().next();
                drivers.remove(d);
                completed.add(new Ride(req.id+"-with-"+d.id));
                drivers.add(d);
            } else {
                pending.add(req);
            }
        }
        System.out.println("Completed: "+completed);
        System.out.println("Pending: "+pending);
    }
}
