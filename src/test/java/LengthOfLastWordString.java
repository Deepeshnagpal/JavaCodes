public class LengthOfLastWordString {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};

        String str = "  Hello Princess Cutie ";

        System.out.println(lengthOfLastWord(str));
    }

    public static int lengthOfLastWord(String s){
        if(s == null || s.length() == 0){
            return 0;
        }
        s = s.trim();
        String[] words = s.split("\\s+");
        System.out.println(words.length);
        return words[words.length -1].length();
    }
}
