package day19_LoopPractices;

public class task1 {

    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j % 2==1 ? 1 : 0);
            }

            System.out.println();
        }
    }
}