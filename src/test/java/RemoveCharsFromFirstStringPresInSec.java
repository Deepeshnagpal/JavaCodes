public class RemoveCharsFromFirstStringPresInSec {
    public static void main(String[] args) {
        //India is great
        //In
        printCharsRemoveCharsFromFistString("India is great", "In");
    }

    public static void printCharsRemoveCharsFromFistString(String s1, String s2){
        String uniqueString = "";
        s1 = s1.replaceAll(" ", "").toLowerCase();
        s2 = s2.replaceAll( " ", "").toLowerCase();

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        for(int i =0 ; i<ch1.length ; i++){
            for(int j=0; j<ch2.length ; j++){
                if(ch1[i] ==ch2[j]){
                    ch1[i] ='*';
                }
            }
        }
        System.out.println("After removing the characters of second string from first string :");

        for(int i=0;i<ch1.length;i++) {
            System.out.print(ch1[i]);
        }
    }
}
