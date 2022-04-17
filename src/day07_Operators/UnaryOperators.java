package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int a=5;
        // ++a=6;    --=4
        System.out.println(++a);//6 pre increment
        System.out.println(--a);//5
        System.out.println(a++);//post increment by 1 later//5

        System.out.println(a);//6
        System.out.println(a--);//post decrement 5
        System.out.println(a);

        int p =8;


        System.out.println(p--);// later -1
        System.out.println(p);//7

        int y= 8;
        System.out.println(y++);// later+1
        System.out.println(y);//9


    }

}
