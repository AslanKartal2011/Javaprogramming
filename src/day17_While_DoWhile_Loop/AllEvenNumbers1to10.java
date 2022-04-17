package day17_While_DoWhile_Loop;

public class AllEvenNumbers1to10 {

    public static void main(String[] args) {


        for (int i = 1; i < 11; i++) {
            if (i % 2 != 0) { //2 4 6 8 10
                continue;
            }
            System.out.println(i);
        }
    }
}