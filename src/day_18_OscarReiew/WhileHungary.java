package day_18_OscarReiew;

public class WhileHungary {

    public static void main(String[] args) {

        boolean isHungary=true;
        int babanas=0;
        int countToFull=3;
        while(isHungary){
            babanas++;
            System.out.println("Eaing a babana;"+babanas);

            // condition taht will change the boolean to false
            if(babanas==countToFull){
                isHungary=false;
            }
        }
        System.out.println("Had enough bananas,let s get back to study");

    }


}
