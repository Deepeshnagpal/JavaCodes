package com.company;

import java.util.HashSet;

public class ArraySubset {
    public static void main(String[] args) {

        int[] arr1 = {11,1,13,21,3,7};
        int[] arr2 = {11,3,7,1};
        ArraySubset arraySubset = new ArraySubset();
        System.out.println(arraySubset.isSubset(arr1,arr2));
    }

    static boolean isSubset(int[] a, int[] b){
        HashSet<Integer> hset = new HashSet<>();
        int m = a.length;
        int n = b.length;

        for(int i=0; i<m ; i++){
            if(!hset.contains(a[i])){
                hset.add(a[i]);
            }
        }

        for(int i=0; i<n ; i++) {
            if (!hset.contains(b[i])) {
                return false;
            }
        }
        return true;
    }
}
