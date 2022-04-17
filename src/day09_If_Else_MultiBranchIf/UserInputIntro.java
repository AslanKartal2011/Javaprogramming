package day09_If_Else_MultiBranchIf;

 import java.util.Scanner;

public class UserInputIntro {

    public static void main(String[] args) {

       String name1="Orhan";

        // output goes to console

        System.out.println("output");

        //How can i receive input for my JAVA class
        // 1.Create your scanner object
        Scanner input= new Scanner(System.in);
        //2. prompt the user for putting input
        System.out.println("Put your name :  " );
        //3.get the input

         name1=input.next();// read the data from console and assigns teh value to my variable
         //   4. use the value that i read

        // step 1 and 3 are MUST , but steps 2 and 4 depends on the situation
        // we need to import scanner class from java utilities
        // import java.util.Scanner; you put theis statement aat the yop of your page before class


    }
}
