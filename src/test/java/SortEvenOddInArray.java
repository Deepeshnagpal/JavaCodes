public class SortEvenOddInArray {
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};

        segregateEvenOdd(arr);
        System.out.println("Segregate the even and odd in array");
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void segregateEvenOdd(int[] arr){
        int left, right;
        left = 0;
        right = arr.length -1;

        while(left < right){
            while(left < right && arr[left]%2==0){
                left++;
            }
            while(left < right && arr[right]%2==1){
                right--;
            }

            if(left < right){
                int x = arr[left];
                arr[left] = arr[right];
                arr[right] = x;
                left++;
                right--;
            }
        }
    }
}
