package day17_While_DoWhile_Loop;

;
import java.util.Scanner;

public class MarriageProposal {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Will you marry me?");
        String marriage= scan.next().toLowerCase();

       while (!(marriage.equals("yes")||marriage.equals("no"))){
           System.err.println("Invalid answer, please re-enter");
           marriage=scan.next().toLowerCase();
       }
           if (marriage.contains("yes")) {
               System.out.println("Congrats");
           } else{
                System.out.println("Goodbye");
            }

        }
    }

