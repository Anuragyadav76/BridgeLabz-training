import java.util.*;
class Account{ String id; double balance; Account(String id,double b){this.id=id;this.balance=b;} public boolean equals(Object o){return o instanceof Account && id.equals(((Account)o).id);} public int hashCode(){return id.hashCode();} public String toString(){return id+":"+balance;} }
class Transaction{ String id; String accId; double amount; Transaction(String id,String a,double amt){this.id=id;this.accId=a;this.amount=amt;} public String toString(){return id+":"+accId+":"+amount;} }
public class BankingTransactionSystem {
    public static void main(String[] args){
        List<Transaction> all = new ArrayList<>();
        all.add(new Transaction("T1","A1",100));
        all.add(new Transaction("T2","A2",200));
        Queue<Transaction> queue = new LinkedList<>(all);
        Set<Account> accounts = new HashSet<>();
        accounts.add(new Account("A1",500)); accounts.add(new Account("A2",300));
        Stack<Transaction> rollback = new Stack<>();
        while(!queue.isEmpty()){
            Transaction t = queue.poll();
            boolean valid = accounts.contains(new Account(t.accId,0));
            if(valid){
                rollback.push(t);
            }
        }
        if(!rollback.isEmpty()){
            Transaction last = rollback.pop();
            System.out.println("Rolled back "+last);
        }
    }
}
