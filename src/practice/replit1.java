package practice;

import java.util.Scanner;

public class replit1 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(words[i].substring(0, 1) + words[i].substring(words[i].length() - 1));
//        }
//
//        System.out.println("\n---------\n");
//
//        for (String s: words) {
//            System.out.println(s.substring(0, 1) + s.substring(s.length() - 1));
//        }


//        System.out.println("Printing multiplication table start");
//
//        for(int i = 1; i<3; i++){        //outer loop
//            for(int j=0; j<=12; j++){     //inner loop
//                System.out.println(i+ "*"+ j+ "="+ i*j);
//            }
//            System.out.println("Multiplication table of "+ i+ " completed");
//        }

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 20; j++) {
//                System.out.println(i+ "*"+ j+ "="+ i*j);
//            }
//        }
        String[][] str = new String[2][3];

        str = new String[][]{{"a","b","c"},{"d","e","f"}};

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(str[i][j] +str[i+1][j]);
            }
        }

        

//
//        String s1  = "abc";
//        String s2 = new String("abc");
//        System.out.println(s1==s2);
//        System.out.println( s1.equals(s2));
//
//        int a = 3;
//        int b = 3;
//        System.out.println( a==b);

//        int[] i = new int[]{1,2,3};
//        int[] j = new int[]{1,2,3};
//
//        System.out.println(i==j);

//        if (a == b) {
//            System.out.println("a esittir b dir");
//        }
//        else System.out.println("a esit degil b ye");


    }
}