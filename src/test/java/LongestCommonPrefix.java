import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] StrArray=new String[]{"flower","flow","flight"};
        System.out.println(longestPrefix(StrArray));
    }
    public static String longestPrefix(String[] strs){
        if(strs.length ==0) return "";
        String prefix = strs[0];

        for(int i=1 ; i< strs.length ; i++){

            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0, prefix.length() -1);
            }
        }
        return prefix;
    }
}
