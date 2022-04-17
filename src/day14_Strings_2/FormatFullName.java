package day14_Strings_2;

import java.util.Locale;

public class FormatFullName {

    public static void main(String[] args) {

        String firstName="cyDEo",
              lastName="SCHOOL";

        firstName= firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        System.out.println("firstName = " + firstName);

    }
}
