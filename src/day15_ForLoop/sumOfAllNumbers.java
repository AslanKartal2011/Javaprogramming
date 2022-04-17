package day15_ForLoop;

import java.util.Scanner;

public class sumOfAllNumbers {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();


        if (number<0){
            System.out.println("invalid number");
        } else if(number>0){
            int sum=0;
            for (int i = 1; i < number; i++) {
                sum += i;

            }
            System.out.println(sum);
        }

    }
}
/*
3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050
                input: 50
                output: 1275
 */