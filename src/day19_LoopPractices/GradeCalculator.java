package day19_LoopPractices;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("Enter your score");
            int score = scan.nextInt();

            if (!(score >= 0 && score <= 100)) {
                System.err.println("Invalid Entry");
            } else if (score >= 0 && score < 60) {
                System.out.println("F");
            } else if (score >= 60 && score < 70) {
                System.out.println("D");
            } else if (score >= 70 && score < 80) {
                System.out.println("C");
            } else if (score >= 80 && score < 90) {
                System.out.println("B");
            } else {
                System.out.println("A");
            }
            System.out.println("Would you like to continue?");
            String a = scan.next().toLowerCase();

            while (!(a.equals("no") || a.equals("yes"))) {
                System.err.println("Invalid Entry, Would you like to continue? ");
                a = scan.next().toLowerCase();

            }
                if (a.equals("no")) {
                    System.out.println("Thank you for using Cydeo grade calculator app!");
                    break;
                }
            }
            scan.close();
        }
    }
