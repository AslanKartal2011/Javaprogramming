package day23_CustomMethods_Void;

public class EligibleToVote {


    private static void eligibleToVote(int age, String citizen) {

        if (age >= 18 && citizen.equalsIgnoreCase("usa")){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
        
    }


}
