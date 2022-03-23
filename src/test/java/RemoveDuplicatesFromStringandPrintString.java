import java.util.LinkedHashSet;

public class RemoveDuplicatesFromStringandPrintString {
    public static void main(String[] args) {
        removeDuplicates("aaaabbbbcccdd");
        //removeDuplicatesUsingLinkedHashset("aaaabbbbcccdd");
    }

    /* Remove Duplicates from the String and print resulting string  */
    //Method 1
    public static void removeDuplicates(String str){
        String result = "";
        for(int i =0 ; i<str.length() ; i++){
            if(!result.contains(String.valueOf(str.charAt(i)))){
                result +=String.valueOf(str.charAt(i));
            }
        }
        System.out.println("Remove duplicates:"+result);
    }

    //Method 2 : Using LinkedHashSet
    public static void removeDuplicatesUsingLinkedHashset(String s){
        LinkedHashSet<Character> lis = new LinkedHashSet<>();

        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(Character c : ch){
            lis.add(c);
        }
        System.out.println("LinkedHashSet:"+lis);
        for(Character c: lis){
            sb.append(c);
        }
        System.out.println("Resulting string:"+sb);
    }
}
