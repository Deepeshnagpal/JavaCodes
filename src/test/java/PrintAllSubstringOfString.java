public class PrintAllSubstringOfString {
    public static void main(String[] args) {
        String str = "India";
        for(int i= 0; i<= str.length() ; i++){
            for(int j =i+1; j<=str.length() ; j++){
                System.out.println(str.substring(i,j));
            }
        }

    }
}