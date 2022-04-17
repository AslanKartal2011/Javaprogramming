package day13_StringMethods;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");
        String word=scan.next();
        scan.close();

        String result=" ";

        if(word.length()==5){
            result+=word.charAt(4);
            result+=word.charAt(3);
            result+=word.charAt(2);
            result+=word.charAt(1);
            result+=word.charAt(0);
        }else if (word.length()>5){
            System.out.println("Too long!");
        }else{
            result="too short";
        }
        System.out.println(result);
    }
}
