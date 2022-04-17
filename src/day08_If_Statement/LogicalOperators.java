package day08_If_Statement;

public class LogicalOperators {
    public static void main(String[] args) {

        String name2 = "josh";

        int creditScore=720;
        int age2=23;
        int income =40000;

        boolean isElligible2= creditScore >=700 && age2 >=21&& income >=60000;// AND operatora &&
        System.out.println(name2+"is Elligible for loan: =  " + isElligible2);
        
        String name3= "Shay";
        int age3=21;
        char gender='F';
        boolean isElligible3= age3>=18 &&(gender =='M' ||gender== 'F');
        System.out.println(name3+ " is Elligible to register:  " + isElligible3);

        String student= "Anna";

        double gpa= 3.5;
        int familyIncome = 100000;
        boolean isElligible5= gpa>=3.5 || familyIncome <=60000;

        System.out.println(student+ " is Elligible for scholarship = " + isElligible5);


        boolean result2=true;
        System.out.println("result2 = " + result2);

       boolean result3=!result2;
        System.out.println("result3 = " + result3);


        int score=85;
        boolean passed= score>=60;
        boolean failed=!passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);
    }
}
