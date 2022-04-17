package practice;

import java.util.Scanner;

public class day16_1 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int positive=0;
        int negative=0;

        for (int i = 0; i <5 ; i++) {
            int number = scan.nextInt();

            if(number>=0){
                positive++;
            }else if (number<0){
                negative++;
            }



        }

        System.out.println(positive+" positive and "+negative+" negative");
    }
}