package day20_arrays;

import java.util.Arrays;

public class ReverseOfNames {

    public static void main(String[] args) {

        String[] classMates={"Ayse","Fatma","Nuri","Orcun", "Java","Nuri","Orcun",
                "Programming","Aslan","Mon"};




        for (int i = 0; i < classMates.length; i++) {

            String name = classMates[i];
            String reverseName = "";

            for (int j = name.length()-1; j >= 0; j--) {
                reverseName += name.charAt(j);
                System.out.println(reverseName);
            }



        }




    }


 }




