public class indexOfArrayElements {
    public static void main(String[] args) {
        int[] ar = new int[]{1, 3, 4, 5, 10, 2, 7};
retrieveIndexofArrayElement(ar, 7);
    }


    public static void retrieveIndexofArrayElement(int arr[], int n){
        for(int i=0 ; i< arr.length; i++){
            for(int j=i+1; j<arr.length ; j++){
                if(arr[i]+arr[j]==n){
                    System.out.println("index of i:"+i +","+"index of j: "+j);
                }
            }
        }
    }
}
