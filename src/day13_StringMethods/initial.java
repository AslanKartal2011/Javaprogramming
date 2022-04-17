package day13_StringMethods;

import java.util.Scanner;

public class initial {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName =scan.next();


        System.out.println("Enter your last name");
        String lastName=scan.next();
        char f = firstName.charAt(0);
        char l = lastName.charAt(0);
        String initial =  f + "." + l;
        System.out.println("initial = " + initial);


        scan.close();
    }
}
