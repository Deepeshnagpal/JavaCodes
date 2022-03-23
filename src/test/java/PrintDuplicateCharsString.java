

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class PrintDuplicateCharsString {
    public static void main(String[] args) {
        String str = "Java and JavaScript";
        printDuplicate(str);
        printDuplicateChars(str);

    }
    //Method1
    public static void printDuplicate(String s){
        String dupliacteChars = "";
        s = s.replaceAll(" ", "").toLowerCase();
        for(int i =0; i<s.length(); i++){
            for(int j =i+1; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    if(!dupliacteChars.contains(String.valueOf(s.charAt(i)))){
                        dupliacteChars +=s.charAt(i);
                    }
                }
            }
        }
        System.out.println("Duplicate chars:"+dupliacteChars);
    }

    //Method2
    public static void printDuplicateChars(String str){
        str = str.replaceAll(" ", "").toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        char[] ch = str.toCharArray();
        for(Character c : ch){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        System.out.println("Map:"+map);
        for(Map.Entry<Character,Integer> es : map.entrySet()){
            if(es.getValue()>1){
                System.out.println(es.getKey() + " occurs "+es.getValue() + "times");
            }
        }
    }

/*    //Remove Duplicates from String and print resulting string
    public static void removeDuplicates(String str){
        str = str.toLowerCase();
        LinkedHashSet<Character> lis = new LinkedHashSet<>();
        for(Character ch : str.toCharArray()){
            lis.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for(Character c: lis){
            sb.append(c);
        }
        System.out.println("remove duplicates from resulting string:"+sb);
    }*/
}
