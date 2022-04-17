package day19_LoopPractices;

import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        while (true){
            System.out.println("Enter the side of the square:");
            double side= scan.nextDouble();
             if (side<=0){
                 System.out.println("Invalid Entry for the side of the square");}

                 double area=side*side;
                 double perimeter=side*4;
                 System.out.println("perimeter = " + perimeter);
                 System.out.println("area = " + area);

                 System.out.println("Would you like to calculate another Square?");
                 String answer=scan.next().toLowerCase();

                 while (!(answer.equals("yes")||answer.equals("no"))){
                     System.err.println(" Invalid entry,  please re-enter a valid entry");
                     answer=scan.next().toLowerCase();
                 }if (answer.equals("no")){
                     System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
                     break;
                 }
             }

               scan.close();
        }
    }

