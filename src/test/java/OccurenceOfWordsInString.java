import java.util.HashMap;
import java.util.Map;

public class OccurenceOfWordsInString {
    public static void main(String[] args) {
        String str = "Alice is girl and Bob is boy";

        Map<String, Integer> map = new HashMap<>();

        String [] words = str.split("\\s+");
        for(String word: words){
            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);
            }
            else{
                map.put(word, 1);
            }
        }
        System.out.println("Map:"+map);
    }
}
