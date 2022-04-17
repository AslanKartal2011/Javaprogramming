package day21_ArraysUtilityForEachLoop;

import java.util.Arrays;

public class EvenAndOddNumbers {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,12,15,14,177,6,5};

        int countOdd=0;
        int countEven=0;

        for ( int each:arr) {

            if (each%2==0){
                countEven++;
            }else{
                countOdd++;
            }

        }
        System.out.println(Arrays.toString(arr) +" has "+countEven+" even numbers and "+countOdd+" odd numbers");

    }
}
