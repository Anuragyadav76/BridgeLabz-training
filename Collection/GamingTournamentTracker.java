import java.util.*;
class Player{ String id; Player(String id){this.id=id;} public boolean equals(Object o){return o instanceof Player && id.equals(((Player)o).id);} public int hashCode(){return id.hashCode();} public String toString(){return id;} }
class Match{ String id; Match(String id){this.id=id;} public String toString(){return id;} }
class Result{ String matchId; String winner; int points; Result(String m,String w,int p){matchId=m;winner=w;points=p;} public String toString(){return matchId+":"+winner+":"+points;} }
class Score implements Comparable<Score>{ String player; int points; Score(String p,int pts){player=p;points=pts;} public int compareTo(Score s){int c=Integer.compare(s.points,points); if(c==0) return player.compareTo(s.player); return c;} public String toString(){return player+":"+points;} }
public class GamingTournamentTracker {
    public static void main(String[] args){
        Set<Player> players = new HashSet<>(); players.add(new Player("P1")); players.add(new Player("P2"));
        Queue<Match> matches = new LinkedList<>(); matches.add(new Match("M1")); matches.add(new Match("M2"));
        List<Result> results = new ArrayList<>();
        TreeSet<Score> leaderboard = new TreeSet<>();
        while(!matches.isEmpty()){
            Match m = matches.poll();
            results.add(new Result(m.id,"P1",10));
            leaderboard.add(new Score("P1",10));
        }
        System.out.println("Results: "+results);
        System.out.println("Leaderboard: "+leaderboard);
    }
}
