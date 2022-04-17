package day24_CustomMethods_Return;

import java.util.Arrays;

public class Task2Anagram {
    public static void main(String[] args) {

    }

    public static boolean Anagram(String str1, String str2) {

        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();

         Arrays.sort(ch1);
         Arrays.sort(ch2);

         return Arrays.equals(ch1,ch2);
     }

}
