import java.util.HashSet;

public class PairWithGivenSumArray {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 7, -1, 5 ,6};
    //printPairwithSumArray(arr, 11);
        printPairsusingHashset(arr, 11);
    }
    //Method 1
    public static void printPairwithSumArray(int[] arr, int sum){
        int count =0;
        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println("Pair with a given sum " + sum +
                            " is (" + arr[i] + ", " + arr[j] + ")");
                    count++;
                }
            }
        }
        System.out.println("count:"+count);
    }
    //Method 2
    public static void printPairsusingHashset(int[] arr, int sum){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
            int temp = sum - arr[i];
            if(set.contains(temp)){
                System.out.println("Pair with a given sum " + sum +
                        " is (" + arr[i] + ", " + temp + ")");
            }

        }
    }
}
