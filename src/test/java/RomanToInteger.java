import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(RomanToInt("LXIII"));
    }

    public static int RomanToInt(String s){
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int length = s.length();
        int mapResult = map.get(s.charAt(4));

     int result = map.get(s.charAt(s.length() -1));

     for(int i = s.length() -2; i>=0; i--){
         if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
             result-=map.get(s.charAt(i));
         }
         else{
             result+=map.get(s.charAt(i));
         }
     }
        return result;
    }
}
