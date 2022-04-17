package day14_Strings_2;

import java.util.Locale;
import java.util.Scanner;

public class EndWithLy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next().toLowerCase();

        String lastTwoChars = word.substring(word.length() - 2);

        if (lastTwoChars.equals("ly")) {
            System.out.println("Really???");
        } else {
            System.out.println("Never mind");
        }
    }
}