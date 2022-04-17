package day12__ScannerClass;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("enter your age");
        int age =input.nextInt();

        System.out.println("Enter your GPA");
        double gpa=input.nextDouble();//3.5

        input.nextLine();

        System.out.println("Enter your full name");
        String fullName=input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("gpa = " + gpa);

    }
}
