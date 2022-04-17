package day07_Operators;

public class ArithmeticOperators {

    public static void main(String[] args) {

        /*
        20/6= 3
        20.0/6=3.333...
        10/5=5
        10/3=3.3333
        remainder = numerator-(demonitor*result)
                     10     -  (3*3)=1
                     1/3 =0.3333..
                     10%3===1
                    45/8=5.625

         */



        int num1= 25;
        int num2=5;

        int division =num1/num2;//division variable contains the result of num1 divided by num2
        int remainder=num1%num2;// remainder variable contains the remainder of num1 divided by number
        System.out.println(remainder);

        // 10 divide by 3 is equal to 3 with a remainder of 1

        System.out.println(num1 +" divided by " + num2 + " is equal to " + division + " with a remainder of " + remainder );

        // whats the remainder of 25 divided 4:

        System.out.println( 25 % 4 );

        //whats the remainder of 25 divided 5:
        System.out.println(25 % 5);


    }
}
