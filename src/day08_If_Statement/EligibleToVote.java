package day08_If_Statement;

public class EligibleToVote {
    public static void main(String[] args) {

        String name= "John";
        int age=18;
        String citizen="USA";

        boolean isEligible =age >=21 && citizen=="USA";

       //Eligible
        if (isEligible){//true ==!false
            System.out.println("Eligible");
        }
  // Not Eligible
        if(!isEligible){// !true==false
            System.out.println("is not Eligible");
        }
    }
}
