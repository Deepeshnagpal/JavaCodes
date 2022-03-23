public class VowelsConsonantJava {
    public static void main(String[] args) {
        String str = "Geeks for geeks??";

        str = str.replaceAll("\\W+", " ");
        System.out.println("String:"+str);
       String[] words = str.split(" ");
       for(String word : words){
           System.out.println(word);
       }

    }
}
