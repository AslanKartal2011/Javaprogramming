package day05_Concatenaion;

public class FullName {

    public static void main(String[] args) {

        String FirstName="Araon";
        String LastName ="Daniel";
        int age =45;

        String JobTitle= "SDET";
        String companyName= "Apple Inn";
        double salary = 100000.58;


        String fullName= FirstName + " "+ LastName;
        System.out.println("full name of the person is " + fullName);

        System.out.println( fullName + " is " + JobTitle +", works at "+ companyName + " and "+ fullName + "`s salary is $" + salary);



    }
}
