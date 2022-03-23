import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateCharacterString {
    public static void main(String[] args) {
        String str = "geeks for geeks";
        str = str.replaceAll(" ", "").toLowerCase();
        int count =0;
        String duplicates = "";
        System.out.println("Duplicate Characters are:");
        for(int i=0 ; i<str.length(); i++){
            for(int j=i+1; j< str.length(); j++){
              if(str.charAt(i)==str.charAt(j)){
                  if(!duplicates.contains(String.valueOf(str.charAt(j)))){
                      duplicates+=str.charAt(j);
                      break;
                  }
              }
            }
        }
        System.out.println(duplicates);
    }

}
