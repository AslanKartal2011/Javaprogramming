package day08_If_Statement;

public class ElibileToBuyCigaratte {
    public static void main(String[] args) {

        byte age= 19;

        boolean isEligible= age>= 18;
        if (isEligible){
            System.out.println( age + " is Eligible to buy cigarette :  " + isEligible);
        }

    }

}
