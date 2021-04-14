package com.ganesh.collection;


import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * @created: 14/04/2021 - 4:31 PM
 * @author: Ganesh
 */


public class BasicArray {
    public static void main(String[] args) {
        int arr [];
        arr = new int[10];
        System.out.println(arr[0]);
        int arr1 [] = new int [] {1,2,3,4,5,6,7};
        for(int i = 0; i <= arr1.length; i++){
            arr[i] = i*i;
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr1));
        int [] arr2 = new int []{2,8,3,9,1,7,6,4};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.binarySearch(arr2, 8));

        String [] [] arr3 = new String[][] {
                {"ganesh", "aditya", "deepak"},
                {"shashi", "vivek"},
                {"banti", "vishal", "ramu"}
        };
        System.out.println(Arrays.deepToString(arr3));
    }
}
