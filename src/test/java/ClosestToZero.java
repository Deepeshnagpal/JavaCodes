import java.util.Arrays;

public class ClosestToZero {
    public static void main(String[] args) {
        int[] testingArray = {4,7,9,-2,2,1};
        int result = getClosestToZero(testingArray);
        System.out.println(result);
    }
    public static int getClosestToZero(int [] a){
        int currentValue = 0;
        int closestVal = a[0];
        Arrays.sort(a);

        for(int i =0 ; i<a.length ; i++){
            currentValue = a[i] * a[i];
            if (currentValue <= (closestVal * closestVal)) {
                closestVal = a[i];
            }
        }

        return closestVal;
    }
}
