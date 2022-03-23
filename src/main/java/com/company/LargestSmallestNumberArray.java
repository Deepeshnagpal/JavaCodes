package com.company;

public class LargestSmallestNumberArray {
    public static void main(String[] args) {
        int arr[] = {3,6,8,100,99,101,999,5};
        int max = arr[0];
        int min = arr[0];

        for(int i = 1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];

            }
            else if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Max value in array:"+max);
        System.out.println("Min value in array:"+min);
    }
}
