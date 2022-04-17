package day1555;

public class review1 {

    public static void main(String[] args) {

        String str1="Java";

        String srt2="Java";

        String str3= new String("Java");

        System.out.println(str1== str3);

        System.out.println((str1.equals(str3)));

        String str4 = new String("Java");
        System.out.println(str1.equalsIgnoreCase(str4));

    }



}
