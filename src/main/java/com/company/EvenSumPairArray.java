package com.company;

public class EvenSumPairArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int even =0, odd=0;

        for(int i=0; i<arr.length ; i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
    int evenPair = (odd*(odd-1) + even*(even-1))/2;
        System.out.println("Pairs of even number :"+evenPair);
        int oddPair = odd * even;
        System.out.println("Pairs of odd number :"+oddPair);
    }
}
