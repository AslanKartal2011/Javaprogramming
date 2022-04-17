package day14_Strings_2;

import java.util.Scanner;

public class AccountNumber {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a account number");
        String word=scan.next();
        scan.close();

        String result = "Invalid";

        if(word.charAt(0) == '2'){
            if(word.length() == 7){
                result = "Valid";
            }
        }else if(word.charAt(0) == '5'){
            if(word.length() == 10){
                result = "Valid";
            }
        }

        System.out.println(result);
    }
}
