public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,5};
        System.out.println(getMissingNumber(arr,5));
    }
    private static int getMissingNumber(int[] arr, int totalCount){
        int expected = totalCount * ((totalCount + 1)/2);
        int sum=0;
        for(int i=0; i<arr.length ; i++){
            sum+=arr[i];
        }
        return expected -  sum;
    }
}
