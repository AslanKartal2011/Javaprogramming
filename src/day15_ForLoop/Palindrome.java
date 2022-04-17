package day15_ForLoop;

public class Palindrome {

    public static void main(String[] args) {

        String name = "level";
        String result = "";


            for (int i = name.length()-1; i >= 0; i--) {
                result +=result.charAt(i);

            }
            boolean isPalindrome=name.equalsIgnoreCase(result);

        System.out.println(isPalindrome);
        }
    }
/*
8. Write a program that can check if the given String is palindrome
			Ex:
				input:
					Level
				output:
					true
				input:
					Anna
				output:
					true
 */
