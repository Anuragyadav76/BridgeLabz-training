import java.util.*;
class Order {
    String id; String details;
    Order(String id,String d){this.id=id;this.details=d;}
    public boolean equals(Object o){ if(!(o instanceof Order)) return false; return id.equals(((Order)o).id); }
    public int hashCode(){ return id.hashCode(); }
    public String toString(){ return id+":"+details; }
}
public class EcommerceOrderSystem {
    public static void main(String[] args){
        List<Order> all = new ArrayList<>();
        all.add(new Order("O1","itemA"));
        all.add(new Order("O2","itemB"));
        all.add(new Order("O1","itemA-duplicate"));
        Set<Order> unique = new HashSet<>(all);
        Queue<Order> queue = new LinkedList<>(unique);
        Stack<Order> failed = new Stack<>();
        while(!queue.isEmpty()){
            Order o = queue.poll();
            if(o.id.equals("O2")) failed.push(o);
        }
        while(!failed.isEmpty()){
            Order r = failed.pop();
            System.out.println("Retrying "+r);
        }
    }
}
