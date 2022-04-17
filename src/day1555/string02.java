package day1555;

public class string02 {

    public static void main(String[] args) {

        String message ="EU is Awesome!! ";

        int count =message.length();
        System.out.println("how many characters we have : "+ count);
        System.out.println(count==16);

        if (message.length()==16){
            System.out.println("happy testing");
            System.out.println(message.toUpperCase());

            System.out.println("message after uppercase");
            System.out.println(message);

            String str = "  abc  ";
            str = str.trim();
            System.out.println(str.trim());
            System.out.println(str);

        }
    }
}
