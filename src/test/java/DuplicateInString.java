import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class DuplicateInString {
    public static void main(String[] args) {
findDuplicates("Geeks for geeks");
    }

    public static void findDuplicates(String s){
        s = s.toLowerCase();
        Set<String> set = new HashSet<>();
        String words[] = s.split(" ");
        for(int i = 0 ; i< words.length; i++){
            if(!set.add(words[i])){
                System.out.println("Duplicate element found : " + words[i]);
            }
        }
        System.out.println("set:"+set);
    }
}
