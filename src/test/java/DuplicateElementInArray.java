public class DuplicateElementInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,4,2,2,3,3};
        DuplicateElementInArray ds = new DuplicateElementInArray();
        ds.findDuplicateElementArray(arr);

    }
    public void findDuplicateElementArray(int[] arr){
        int count =0;
        for(int i=0 ; i< arr.length -1 ; i++){
            if(arr[i] == arr[i+1]){
                System.out.println("duplicate element:"+arr[i]);
                //count++;
            }
            //System.out.println("count of duplicate element:"+count);
        }
    }
}
