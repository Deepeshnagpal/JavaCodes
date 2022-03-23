public class CountSpacesInString {
    public static void main(String[] args) {
        String str = "Walk down the street in empty lane";

        //Method 1 - Iterate over loop
        int count =0;
        for(int i=0; i<str.length() ; i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        System.out.println("count of spaces: "+count);

        //Method 2
        int spaceCount = 0;
        for(int j =0 ; j<str.length(); j++){
            if(Character.isWhitespace(str.charAt(j))){
                spaceCount++;
            }
        }
        System.out.println("count of spaces: "+spaceCount);
    }
}
