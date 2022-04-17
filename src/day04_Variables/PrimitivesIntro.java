package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        //38 years old
        byte age =38;

        // weight; 160 pounds
       // byte weight = 160; 160 is out of byte` range
        // byte num=-129 // -129 is out of byte
        short weight =160;// 160 is within the range of short

        // salary : 100000 $
        // hort salary -100000; // 100000 is out of short ` range
        int salary = 100000;// int is preferred data type for integer number

        long asset = 3_333_333_333L;

        // tax ; 0.26
        float tax =0.26F;

        double PI=3.14;

           // #
        char ch1= '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char gender = 'F';
         char grade = 'F';
        char yesNo = 'Y';

        boolean isEmployeed = true;
        boolean isMarried= false;
        boolean result= 100>300;
        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);






    }
}
