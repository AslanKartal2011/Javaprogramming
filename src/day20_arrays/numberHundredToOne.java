package day20_arrays;

import java.util.Arrays;

public class numberHundredToOne {

    public static void main(String[] args) {

        int[] number = new int[100];

        for (int i = 0; i < number.length ; i++) {

            number[i]=number.length-i;
        }
        System.out.println(Arrays.toString(number));

    }
}

