package com.company;

import java.util.HashMap;

public class CountPairsGivenSum {
    public static void main(String[] args) {

        int[] arr = {2,4,6,7,2,5,3};
        System.out.println(getPairsCount(arr, 8));
    }
    static int getPairsCount(int[] arr , int k){
        int counter=0;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]<k){
                int element = k-arr[i];
                if(hmap.containsKey(element)){
                    counter+=hmap.get(element);
                }
                if(hmap.get(arr[i])==null){
                    hmap.put(arr[i],0);
                }
                hmap.put(arr[i], hmap.get(arr[i])+1);
            }
        }

        return counter;
    }
}
