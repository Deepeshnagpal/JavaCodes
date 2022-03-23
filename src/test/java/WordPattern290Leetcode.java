import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class WordPattern290Leetcode {

    //Given a pattern and string, find if s follows the same pattern

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }

    public static boolean wordPattern(String pattern, String s){
        String[] words = s.split("\\s+");
        if(pattern.length()!=s.length()) return false;

        Map<Character, String> map = new HashMap<Character, String>();
       for(int i=0; i< pattern.length(); i++){
           char current_char = pattern.charAt(i);
           if(map.containsKey(current_char) && map.get(current_char).equals(words[i])){
               return false;
           }
           else{
               if(map.values().contains(words[i])) return false;
               map.put(current_char, words[i]);
           }
        }
       return true;
    }
}
