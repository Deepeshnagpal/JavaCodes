import java.util.HashSet;
import java.util.Set;

public class determineCost {
    public static void main(String[] args) {
       int n =841;
       int x =1;
       for(int i=1; i< 50; i++){
           int nx = (x+n/x)/2;
           x = nx;
       }
        System.out.println(x);
    }
 /*   public static int stringConst(String s){
        int cost =5;
        Set<Character>set = new HashSet<>();
        for(int i=0; i<s.length() ; i++){
            char c = s.charAt(i);
            if(!set.contains(c)){
                cost++;
                set.add(c);
            }
        }
        return cost;
    }*/
}
