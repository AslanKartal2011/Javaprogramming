package day13_StringMethods;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your username");
        String username=scan.next();
        System.out.println("Enter your password");
        String password=scan.next();
        scan.close();

        if (  username.equals("Cydeo") && password.equals("WoodenSpoon")) {

            System.out.println("Logged in");
        } else {
            System.out.println("incorrect username or password");
        }

    }
}
