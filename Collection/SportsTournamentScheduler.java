import java.util.*;
class Team{ String id; int points; Team(String id){this.id=id;} public String toString(){return id+":"+points;} public boolean equals(Object o){return o instanceof Team && id.equals(((Team)o).id);} public int hashCode(){return id.hashCode();} }
class Match{ String id; Match(String id){this.id=id;} public String toString(){return id;} }
class Result{ String match; String winner; int pts; Result(String m,String w,int p){match=m;winner=w;pts=p;} public String toString(){return match+":"+winner+":"+pts;} }
public class SportsTournamentScheduler {
    public static void main(String[] args){
        Set<Team> teams = new HashSet<>(); teams.add(new Team("T1")); teams.add(new Team("T2"));
        Queue<Match> fixtures = new LinkedList<>(); fixtures.add(new Match("M1")); fixtures.add(new Match("M2"));
        List<Result> results = new ArrayList<>();
        TreeSet<Team> leaderboard = new TreeSet<>(new Comparator<Team>(){ public int compare(Team a,Team b){ int c=Integer.compare(b.points,a.points); if(c==0) return a.id.compareTo(b.id); return c; }});
        while(!fixtures.isEmpty()){
            Match m = fixtures.poll();
            results.add(new Result(m.id,"T1",3));
            for(Team t:teams) if(t.id.equals("T1")) t.points+=3;
        }
        leaderboard.addAll(teams);
        System.out.println("Results: "+results);
        System.out.println("Leaderboard: "+leaderboard);
    }
}
