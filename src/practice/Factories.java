package practice;

import java.util.Scanner;

public class Factories {

    public static void main(String[] aslan) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your number");
        int num= scan.nextInt();
        int result=1;

        for (int i = 1; i <num+1 ; i++) {
             result=i*result;
            System.out.println(result);
        }




    }

}
