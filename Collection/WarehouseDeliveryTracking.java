import java.util.*;
class PackageItem{ String id; String addr; PackageItem(String id,String a){this.id=id;this.addr=a;} public String toString(){return id+":"+addr;} }
public class WarehouseDeliveryTracking {
    public static void main(String[] args){
        Queue<PackageItem> pending = new LinkedList<>();
        Set<String> ids = new HashSet<>();
        List<PackageItem> delivered = new ArrayList<>();
        Stack<PackageItem> returned = new Stack<>();
        PackageItem p1 = new PackageItem("P1","Addr1");
        if(ids.add(p1.id)) pending.add(p1);
        PackageItem p2 = new PackageItem("P2","Addr2"); if(ids.add(p2.id)) pending.add(p2);
        while(!pending.isEmpty()){
            PackageItem p = pending.poll();
            if(p.id.equals("P2")) returned.push(p); else delivered.add(p);
        }
        System.out.println("Delivered: "+delivered);
        System.out.println("Returned: "+returned);
    }
}
