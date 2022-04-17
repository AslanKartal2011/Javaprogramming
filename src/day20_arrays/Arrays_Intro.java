package day20_arrays;

import java.util.Arrays;

public class Arrays_Intro {

    public static void main(String[] args) {

        String[] myGroup=new String[5];
        myGroup[0]="Gunay";
        myGroup[1]="Neira";
        myGroup[2]="Suat";
        myGroup[3]="Mikeal";
        myGroup[4]="Muhtar";

        System.out.println(Arrays.toString(myGroup));

        String []days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println(Arrays.toString(days));
        System.out.println(days[0]);
        System.out.println(days[1]);
        System.out.println(days[2]);
        System.out.println(days[3]);
        System.out.println(days[4]);
        System.out.println(days[5]);
        System.out.println(days[6]);//System.out.println(days[0]);

        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);

        }

        System.out.println(".................................................................................");

        for (int i = days.length-1; i >=0 ; i--) {
            System.out.println(days[i]);
        }


    }
}
