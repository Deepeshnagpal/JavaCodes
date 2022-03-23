public class Segregate0s1sInArray {
    public static void main(String[] args) {
    int arr[] = new int[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 0};

    Segregate0s1sInArray seg = new Segregate0s1sInArray();
    seg.segregate0s1s(arr);
        System.out.print("Array after segregation is ");
    for(int i=0; i<arr.length ; i++){
        System.out.print(arr[i] + " ");
    }

    }

    public void segregate0s1s(int[] arr){

        int left, right;
        left = 0;
        right = arr.length -1;

        while(left < right){
            while(left < right && arr[left]==0){
                left++;
            }
            while(left < right && arr[right]==1){
                right--;
            }
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
