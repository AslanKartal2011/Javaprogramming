package day21_ArraysUtilityForEachLoop;

import java.util.Arrays;

public class SortintDescendingOrder {

    public static void main(String[] args) {

        int [] arr= new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = new int[arr.length];

        for (int i = arr.length-1; i >=0 ; i--) {
            result[i] = arr[i];
        }


        System.out.println(Arrays.toString(result));
    }


}

/*
1. Write a program that sort the array of integer in descending order
 */




