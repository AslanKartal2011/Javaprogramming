package day20_arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class EachItemAndPrice {
    public static void main(String[] args) {


        String[] items = {"TV", "Radio", "BookCase", "lamp", "shit"};
        int[] prices = new int[5];

        for (int i = 0; i < 5; i++) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter item and then price,please?");
            String item = scan.next();
            int price = scan.nextInt();
        }


    }
}