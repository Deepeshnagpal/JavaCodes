public class ArrangeStringInIncreasingOrder {
    public static void main(String[] args) {
        String s = "Name i  deeepesh Anames";
        arrangeStringIncreasingOrder(s);
    }

    // Arrange string In Increasing order of words of String
    public static void arrangeStringIncreasingOrder(String s){
        s= s.toLowerCase();
        String words[] = s.split(" ");

        for(int i =0 ; i<words.length ; i++){
           for(int j = i+1; j<words.length ; j++){
               if(words[i].length() > words[j].length()){
               String temp = words[i];
               words[i] = words[j];
               words[j] = temp;

               }
           }
        }
        for(int i =0 ; i< words.length ; i++){
            System.out.print(words[i] + " ");
        }
    }
}
