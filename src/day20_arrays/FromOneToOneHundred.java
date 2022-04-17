package day20_arrays;

import java.util.Arrays;

public class FromOneToOneHundred {

    public static void main(String[] args) {

        int[] number=new int[100];

        for (int i = 1; i < number.length; i++) {
            number[i]=i;
        }
        System.out.println(Arrays.toString(number));


    }

}

