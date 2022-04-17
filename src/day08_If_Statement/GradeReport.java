package day08_If_Statement;

public class GradeReport {

    public static void main(String[] args) {
        int score = 85;
        boolean a = score > 90 && score <= 100;
        //               false || true
        boolean b = score >= 80 && score <= 89;
        boolean c = score >= 70 && score <= 79;
        // boolean c =!a && !b && score >=70;

        if (b) {
            System.out.println("Excellent");
        }
    }
}

/* 90~100 ==> Excellent
   80~89  ==> Great
   70~79 ==> good
   60~69 ==> passed
   0~ 59 ==> failed
 */