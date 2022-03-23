import java.util.HashSet;
import java.util.Set;

public class Reverse_String {
    public static void main(String[] args) {
        String str = "radar";
        pallindromeString(str);
    }

    public static void pallindromeString(String str){
        String reverseString = "";
        str = str.replaceAll(" ", "").toLowerCase();
        for(int i = str.length() - 1 ; i>=0; i--){
            reverseString+=str.charAt(i);
        }
        if(reverseString.equals(str)){
            System.out.println(str + " is a pallindrome string");
        }
        else
            System.out.println(str + " is not a pallindrome string");
    }


}
