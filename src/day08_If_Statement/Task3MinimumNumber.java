package day08_If_Statement;

public class Task3MinimumNumber {

    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 200;

        boolean n1IsMax = n1 > n2;
        boolean n2IsMax = n1 < n2;
        boolean equal =n1==n2;

        if (n1IsMax) {
            System.out.println(n1 + " is maximum number");
        }

      if (n2IsMax){
          System.out.println(n2+ " is the maximum number");
      }
     if (equal){
         System.out.println("Equal");
     }
    }
}