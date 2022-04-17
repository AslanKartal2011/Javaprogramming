package day17_While_DoWhile_Loop;

public class BranchinStatement2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {

            if (i == 'C') {
               continue;
            }

            System.out.println(i);// A B
        }
    }
}