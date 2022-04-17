package day13_StringMethods;

import java.util.Scanner;

public class FirstLastCharacterOfSentence {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence=scan.nextLine();
        scan.close();

        char firstChar=sentence.charAt(0);
        char lastChar=sentence.charAt(sentence.length()-2);

        String result=firstChar+""+lastChar;
        System.out.println(result);



    }
}