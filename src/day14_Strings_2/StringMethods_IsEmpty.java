package day14_Strings_2;

public class StringMethods_IsEmpty {
    public static void main(String[] args) {


        String str=" ";
        boolean r= str.isEmpty();

        System.out.println(r);
        boolean r1= str.isBlank();

        String srt2="   ";
        System.out.println(srt2.isBlank());

        String s1="CYDEO";
        String s2="cydeo";

        System.out.println(s1.equalsIgnoreCase(s2));

        String sentence="My favorite programming is Java";
        boolean hasCSharp=sentence.contains("C#");
        boolean hasJava=sentence.contains("Java");
        boolean hasJava3=sentence.toLowerCase().contains("java");
        boolean r3=sentence.contains("java")|| sentence.contains("java");

        System.out.println(hasCSharp);

        System.out.println(hasJava);
        System.out.println(hasJava3);
        System.out.println(r3);


String a ="Wooden Spoon";

boolean x=a.startsWith("Woo");
boolean y=a.endsWith("Spoon");
boolean z=a.toLowerCase().startsWith("spo");



    }
}
