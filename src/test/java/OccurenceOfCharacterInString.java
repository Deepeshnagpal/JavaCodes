import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharacterInString {
    public static void main(String[] args) {
        String str = "Geeks for Geeks";

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(char c : str.replaceAll(" ", "").toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else {
                map.put(c, 1);
            }
        }
        System.out.println("Map : "+map);

    }
}
