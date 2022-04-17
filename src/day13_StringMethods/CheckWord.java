package day13_StringMethods;

import java.util.Scanner;

public class CheckWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three word");
        String word1 = scan.next();
        String word2 = scan.next();
        String word3 = scan.next();

        scan.close();

        String result = "";

        if (word1.length() == word2.length() && word2.length() == word3.length()) {
            result = "All words are same length";
        } else if (word1.length() == word2.length()) {
            result = "Not Same nor Different lengths";
        } else if (word1.length() == word3.length()) {
            result = "Not Same nor Different lengths";
        } else if (word2.length() == word3.length()) {
            result = "Not Same nor Different lengths";
        } else {
            result = "All different length";
        }

        System.out.println(result);
    }
}