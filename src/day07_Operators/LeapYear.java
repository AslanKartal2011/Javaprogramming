package day07_Operators;

public class LeapYear {
    public static void main(String[] args) {

        int year=2015;
        boolean is_Leap_Year=(year%4)==0;
        System.out.println(year + " is Leap Year : " + is_Leap_Year);

    }
}
