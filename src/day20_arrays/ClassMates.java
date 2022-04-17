package day20_arrays;

import java.util.Arrays;

public class ClassMates {
    public static void main(String[] args) {

        String[] classMates={"Ayse K","Fatma P","Nuri P","Orcun cc", "Java Programming","Nuri P","Orcun cc",
                "Java Programming","Aslan K","Mon K"};


        for (int i = 0; i < classMates.length; i++) {

            String initial = classMates[i].charAt(0) +"."+ classMates[i].charAt(  classMates[i].indexOf(" ") + 1);
            System.out.println(initial);

        }

        System.out.println(Arrays.toString(classMates));

    }

}

