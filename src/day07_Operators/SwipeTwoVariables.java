package day07_Operators;

import javax.lang.model.SourceVersion;

public class SwipeTwoVariables {

    public static void main(String[] args) {
         int a =10;
         int b=15;
         int c= b;
          b = a ;
          a = c ;



        System.out.println("a = " + a + " \nb = "+ b);
    }
}
