import java.util.HashMap;
import java.util.Map;

//Maximum Occuring Character String
public class MaximumOccuringCharacterString {
    public static void main(String[] args) {
        String str = "aaabbbccccccccdd";
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        int maxCount = 0;
        char maxChar = 0;
        str = str.toLowerCase();

        for(char c : str.replaceAll("\\s+", "").toCharArray()){
            if(charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else{
                charCountMap.put(c, 1);
            }
        }
        System.out.println("map:"+charCountMap);

        //entrySet returns a set of all entries
        for(Map.Entry<Character,Integer> entry : charCountMap.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println(" maximum occuring char and it's count: ");
        System.out.println(maxChar + ":"+maxCount);
    }
}
