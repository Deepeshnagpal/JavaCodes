public class DemoTest1 {

    public static void main(String[] args) {

        String str = "Deepesh  is a good boy123";
        int whiteSpaceCount = 0;
        int isDigit = 0;
        for(int i =0; i<str.length() ; i++){
            if(Character.isWhitespace(str.charAt(i))){
                whiteSpaceCount++;
            }
            else if(Character.isDigit(str.charAt(i))){
                isDigit++;
            }
        }
        System.out.println("white space count : "+whiteSpaceCount);
        System.out.println("digit count : "+isDigit);

        //Alternate way to count white space

        int strlength = str.length();
        int modifedString = str.replaceAll("\\s+", "").length();
        int finalString = strlength - modifedString;
        System.out.println("final white space count : "+finalString);
    }
}
