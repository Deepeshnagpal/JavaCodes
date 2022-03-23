import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateValueInArray {
    public static void main(String[] args) {


      // DuplicatesValueInArray();
        DuplicateValuesUsingSet();
    }
    //method 1 - Using brute force approach
    public static void DuplicatesValueInArray(){
        int[] arr = new int[]{1,2,3,4,5,2,2};
        int count = 1;
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            for(int j =i+1 ; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate element is:"+arr[i]);
                   count++;
                    break;
                }
            }
        }

        System.out.println("count of duplicate value:"+count);

    }

    //Method 2 - Using Hashset
    public static void DuplicateValuesUsingSet(){
        int[] arr = new int[]{1,1,2,3,2,4,5,6,7,7,8,8};
        Arrays.sort(arr);
        Set<Integer> set = new HashSet<>();
        for(int i =0 ; i<arr.length ; i++){
            if(set.add(arr[i])==false){
                System.out.println("Duplicate element found : " + arr[i]);
            }
        }
    }

}

