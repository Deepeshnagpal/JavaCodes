import java.util.Arrays;
/*
reverse an String
 */
public class ReverseStringJava {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("character array:"+ Arrays.toString(s));
        int a = 0;
        int b = s.length -1;

        for(a=0; a< s.length/2; a++){
            char temp = s[a];
            s[a] = s[b];
            s[b] = temp;
            a++;
            b--;
        }
        System.out.println("reverse string:"+ Arrays.toString(s));

        String str = "A man, a plan, a canal: Panama";
        str =str.toLowerCase().replaceAll("\\W+", "");
        System.out.println(str);
       // if(str==" ")
          //  return true;
    }





}
