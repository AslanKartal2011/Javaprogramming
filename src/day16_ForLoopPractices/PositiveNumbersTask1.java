package day16_ForLoopPractices;

import java.util.Scanner;

public class PositiveNumbersTask1 {
    public static void main(String[] args) {


        System.out.println("Enter five numbers");

        int countPositive=0;
        int countNegative=0;


        for (int i = 0; i < 5 ; i++) {

            Scanner scan=new Scanner(System.in);
            int num= scan.nextInt();

            if(num>=0){
                countPositive++;
            }else if(num<0) {
                countNegative++;

            }

        }
        System.out.println(countPositive+" positive and "+countNegative+" negative");
    }
}
