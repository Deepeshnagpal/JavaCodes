import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersStringJava {
    public static void main(String[] args) {
        String str = "Java concept";
        str = str.toLowerCase();
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        for(char c : str.replaceAll("\\s+", "").toCharArray()){
            if(charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else{
                charCountMap.put(c, 1);
            }
        }
        System.out.println("map: "+charCountMap);
        for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
            if(entry.getValue() > 1){
                System.out.println("duplicate chars: "+entry.getKey() + ":"+entry.getValue());
            }
        }
    }
}
