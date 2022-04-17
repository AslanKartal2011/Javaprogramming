package day13_StringMethods;

import java.util.Scanner;

public class middleCharacter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a three letter");
        String word = scan.next();
        scan.close();


        if(word.length() == 3){
            if(word.charAt(1) == 'a'){
                System.out.println("Cool word");
            }
        }else{
            if(word.length() > 3 ){
                System.out.println("Word is too long");
            }else{
                System.out.println("Word is too short");
            }
        }


    }
}