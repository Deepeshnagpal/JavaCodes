import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] number = {2,7,11,15};
        int target = 9;
        int[] array = twoSums(number, 9);
        System.out.println(Arrays.asList(array));
    }

    public static int[] twoSums(int[] nums , int target){
        for(int i=0; i< nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int complement = target - nums[i];
                if(nums[j]==complement){
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("no match found");
    }
}
