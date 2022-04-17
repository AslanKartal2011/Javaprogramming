package day12__ScannerClass;

import java.util.Scanner;

public class ScannerPractice_Nextline {

    //nextLine(): if we are using nextLine() methods after the other methods of scanner, we MUST provide one additional nextLine()

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter your full name");
        String fullName =input.nextLine();//Wooden SpoonEnter

        System.out.println("Enter your Programming Language:");
        String programming =input.nextLine();

        System.out.println(" Enter your age");
        int age=input.nextInt();//25
        input.nextLine();

        System.out.println("Enter your school name");
        String schoolName=input.nextLine();//Enter

        System.out.println("fullName = "+ fullName);
        System.out.println("programming = " + programming);
    
    
    }
}
