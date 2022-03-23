public class ReverseIntegerInJava {
    public static void main(String[] args) {
        int num = 3256;
        System.out.println(reversed(num));
    }

    public static int reversed(int num){
        int remainder = 0, rev =0;
        while(num!=0){
            remainder = num % 10;
            rev = rev * 10 + remainder;
            num /=10;
        }
        return rev;
    }
}
