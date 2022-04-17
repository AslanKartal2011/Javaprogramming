package day08_If_Statement;

public class PosNegZero {

    public static void main(String[] args) {

  int n= 100;

if (n>0){
    System.out.println("Positive");
}
       if(n<0) {
System.out.println("negative");
    }
       if(n==0){
           System.out.println("Zero");
       }

        System.out.println("................................");
 boolean positive =n >0;
 boolean negative =n<0;
 if(positive){
     System.out.println("positive");
 } else if (negative){
     System.out.println(negative);
 } else {
     System.out.println("zero");
 }
}}



