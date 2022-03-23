import java.util.Arrays;

public class RemoveSpecificElementArray {
    public static void main(String[] args) {

        int[] arr = {10,20,40,50,60,1,2};


        for(int i =3 ; i< arr.length-1; i++){
           // if(arr[i] == 50){
                arr[i] = arr[i+1];
            //}

        }
        System.out.println(Arrays.toString(arr));
    }
}
