public class ReverseString {
    public static void main(String[] args) {
        String s = "ab_a";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) return true;

        String reverseString = "";
        s = s.trim().toLowerCase().replaceAll("[^a-z]", "");

        for (int i = s.length() - 1; i >= 0; i--) {
            reverseString = reverseString + s.charAt(i);
        }
        System.out.println("reverseString:"+reverseString);
        System.out.println("original string:"+s);
        if (s.equals(reverseString))
            return true;
        else
            return false;

        // return flag;
    }
}