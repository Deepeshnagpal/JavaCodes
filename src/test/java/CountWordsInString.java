public class CountWordsInString {
    public static void main(String[] args) {
        String str = "Walk down the street in empty lane";
        System.out.println(countWords(str));
    }

    public static int countWords(String string) {
        int word;
        if (string == null || string.isEmpty()){
            return 0;
        }

        else {
                String words[] = string.split("\\s+");
                 word = words.length;
        }

        return word;
    }
}
