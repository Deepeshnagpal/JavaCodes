public class StringContainOnlyDigits {
    public static void main(String[] args) {
        String str = "2Geeks021";
        boolean result = str.matches("\\d+");
        System.out.println((result));
    }

}
