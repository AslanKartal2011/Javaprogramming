package day16_ForLoopPractices;

import java.util.Scanner;

public class multiplyTwoNumbers {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two positive numbers");
        int num=scan.nextInt();
        int num2= scan.nextInt();
        int result = 0;

        for (int i = 0; i < num2; i++) {
            result += num;
            System.out.println("Multiplication = " + result);
        }



    }

}


