package day14_Strings_2;

import java.util.Scanner;

public class WithoutFirstWord {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter your a word");
        String word1=scan.next();
        System.out.println("enter second word");
        String word2= scan.next();

        scan.close();
        String result = word1.substring(1)+word2.substring(1);

        System.out.println(result);

        }



    }


