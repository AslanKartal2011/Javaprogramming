package day14_Strings_2;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {


        String email="aslan_kartal@gmail.com";
        String firstName=email.substring(0,email.indexOf("_"));
        String lastName =email.substring(email.indexOf("_")+1,email.indexOf("@"));
       String rest=email.substring(email.indexOf("@"));
       email=lastName+"_"+firstName+rest;

        System.out.println(email);




    }
}
