package day12__ScannerClass;


import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter an integer: ");

        int num1=input.nextInt();



        System.out.println("Enter a decimal");

        double num2=input.nextDouble();

        System.out.println( num1 );
        System.out.println( num2 );
        System.out.println("Multiplication: "+ (num1*num2));

        input.close();



        /*
        nextByte()
        nextShort()
        nextInt()
        nextLong()
        nextFloat()
        nextDouble()
        nextBoolean()
        next()  =======> String reads the input only until a space
        nextLine ======> String reas the entire input until the new line (press enter)

         */

    }

}
