import java.util.Locale;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Deepesh is a good boy";

        String words[] = str.split(" ");

         for(int i = words.length-1; i>=0 ; i-- ){
             System.out.print(words[i]+ " ");
         }
    }
}
