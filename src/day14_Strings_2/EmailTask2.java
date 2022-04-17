package day14_Strings_2;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your email");
        String email= scan.next();

        scan.close();

        String firstName=email.substring(0,email.indexOf("_"));

        String lastName =email.substring(email.indexOf("_")+1, email.lastIndexOf("@"));

        String domain=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));



        System.out.println("First Name : "+ firstName.substring(0,1).toUpperCase()+firstName.substring(1));
        System.out.println("Surname    : "+ lastName.substring(0,1).toUpperCase()+lastName.substring(1));
        System.out.println("Domain     : "+ email.substring(email.indexOf("@")+1,email.lastIndexOf(".")));
    }
}
