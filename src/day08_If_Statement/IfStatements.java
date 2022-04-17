package day08_If_Statement;

public class IfStatements
{
    public static void main(String[] args) {
      //  if( condition){ }
        int number= 100;
        boolean evenNumber= number%2 == 0;
        boolean oddNumber= !evenNumber;

        if(evenNumber){ // true
            System.out.println(number + " is even number");
        }


        if(oddNumber) {// false
            System.out.println(number+ " is odd number");
        }
    }
}
