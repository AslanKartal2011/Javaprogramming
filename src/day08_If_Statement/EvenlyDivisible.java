package day08_If_Statement;

public class EvenlyDivisible {
    public static void main(String[] args) {
        
        int number=65;
        
        boolean isDivisibleBy2= number%2==0;
        boolean isDivisibleBy3=number%3==0;
        boolean isDivisibleBy5=number%5==0;
        System.out.println(number+ " is Divisible By 2 = " + isDivisibleBy2);
        System.out.println(number + "isDivisibleBy3 = " + isDivisibleBy3);
        System.out.println(number +"isDivisibleBy5 = " + isDivisibleBy5);
    }
}
