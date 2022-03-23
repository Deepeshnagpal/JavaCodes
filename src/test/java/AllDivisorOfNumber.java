public class AllDivisorOfNumber {
    public static void main(String[] args) {
        System.out.println(getDivisors(15));
    }

    public static int getDivisors(int n){
        int sum =0;
        for(int i =1; i< n; i++){
            if(n%i==0){
                sum +=i;
            }
        }
        return sum;
    }
}
