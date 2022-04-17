package day16_ForLoopPractices;

import java.util.Scanner;

public class FrequencyOfTheWord {

    public static void main(String[] args) {

      String str="Java Java";
        int count = 0;

        for(int i= 0 ; i <= str.length()-4; i++){ //i:0,1,2,3
            String s = str.substring(i,i+4);
            if(s.equalsIgnoreCase("java")){
                count++;
            }
            System.out.println(count);
        }

    }
}
