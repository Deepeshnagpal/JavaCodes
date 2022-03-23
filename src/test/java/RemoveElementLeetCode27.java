import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
       Remove the specified element from array and count the number of elements remaining in array(Should return 5)
 */
public class RemoveElementLeetCode27 {
    public static void main(String[] args) {
        int arr[] = {0,1,2,2,3,0,4,2};
        System.out.println("remove element:"+removeElementsfromArray(arr, 2));
    }
    /*public static int removeElement(int[] nums, int val){
        if(nums.length ==0) return 0;
        int count =0;
        int[] arr_new = new int[nums.length];

        for(int i=0; i< nums.length; i++){
            if(nums[i]!=val){
                arr_new[count] = nums[i];
                count++;
            }

        }
        System.out.println(Arrays.toString(arr_new));
        return count;

    }*/
    // method 2
    public static int removeElementsfromArray(int[] array, int deleteVal){
        int[] new_array = new int[]{array.length -1};
        int count = 0;
        for(int i =0; i<array.length; i++){
            if(array[i]== deleteVal){
                new_array[count] = array[i];
                count++;
            }
        }
        System.out.println("New array:"+new_array);
        return count++;
    }
}
