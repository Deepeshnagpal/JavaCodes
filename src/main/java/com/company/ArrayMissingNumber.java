package com.company;

public class ArrayMissingNumber {
    public static void main(String[] args) {

        int[] a = {1,2,4,5,6};
        int sum = 0;
        int expectedElement = a.length +1;
        int totalSum = expectedElement * (expectedElement +1)/2;

        for(int i=0; i<a.length;i++){
            sum = sum +a[i];
        }
        System.out.println("Missing number:"+(totalSum -sum));
    }
}
