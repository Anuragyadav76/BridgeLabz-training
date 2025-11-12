import java.util.*;
class Product{ String name; double price; int stock; Product(String n,double p,int s){name=n;price=p;stock=s;} public String toString(){return name+":"+stock;} }
public class InventoryRestockManagement {
    public static void main(String[] args){
        Set<String> names = new HashSet<>();
        List<Product> products = new ArrayList<>();
        Queue<Product> restockQueue = new LinkedList<>();
        Stack<Product> restocked = new Stack<>();
        products.add(new Product("Milk",50,2)); products.add(new Product("Bread",30,10));
        for(Product p:products){
            if(names.add(p.name)){
            }
            if(p.stock<5) restockQueue.add(p);
        }
        while(!restockQueue.isEmpty()){
            Product r = restockQueue.poll();
            r.stock += 20;
            restocked.push(r);
        }
        if(!restocked.isEmpty()){
            Product last = restocked.pop();
            System.out.println("Undo restock for "+last);
        }
    }
}
