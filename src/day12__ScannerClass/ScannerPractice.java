package day12__ScannerClass;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        // System.out.println("Enter true or false: ");
        // boolean result= input.nextBoolean();

        System.out.println("Enter your name; ");
        String name=input.next();//reads the input until a space

        System.out.println("name= "+ name);//

        input.close();

    }
}
