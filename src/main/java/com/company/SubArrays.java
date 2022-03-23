package com.company;

public class SubArrays {
    public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
        printAllSubArrays(arr, 5);

    }

    public static void printArray(int[] arr , int s , int e){
        for(int i=s ; i<=e ; i++ ){
            System.out.println(arr[i]);
        }
    }

    public static void printAllSubArrays(int[] arr , int n){
        for(int s=0 ; s<n; s++){
            for(int e=s ; e<n; e++){
                printArray(arr, s,e);
            }
        }
    }
}
