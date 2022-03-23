import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersString1 {
    public static void main(String[] args) {
        String str = "Java concept of the day";
        str = str.toLowerCase();

        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] ch = str.replaceAll(" ", "").toCharArray();
        for(char c: ch){
            if(charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else{
                charCountMap.put(c, 1);
            }
        }
        System.out.println(charCountMap);
        for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
            if(entry.getValue() > 1){
                System.out.println("Duplicate characters:"+entry.getKey() + " : "+entry.getValue());
            }
        }
    }


}
