package day19_LoopPractices;

import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the radius of the circle:");
            double radius = scan.nextDouble();

            if (radius <= 0) {
                System.out.println("Invalid Entry for the radius of the circle");
            } else {
                double diameter = radius * 2;
                double area =radius * radius * 3.14;
                double perimeter = diameter * 3.14;
                System.out.println("diameter = " + diameter);
                System.out.println("area = " + area);
                System.out.println("perimeter = " + perimeter);
            }
            System.out.println("Would you like to calculate another circle?");
            String a=scan.next();
             while(!(a.equals("yes")||a.equals("no"))){
                 System.err.println("invalid entry, please re-entry");
                 a=scan.next();
             } if
            (a.equals("no")) {
                    System.out.println("Thank you for using Cydeo Circle Calculator APP");
                    break;
             }
        }
        scan.close();
    }
}