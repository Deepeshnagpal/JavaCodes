package com.company;

public class largestOddEvenSumArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 3, 10};

        int evenSum=0, oddSum=0;

        for(int i=0; i<arr.length ; i++){
            if(arr[i]%2==0){
                evenSum+=arr[i];
            }
            else{
                oddSum+=arr[i];
            }
        }
        System.out.println("Odd sum: "+oddSum);
        System.out.println("Even sum"+evenSum);
    }
}
