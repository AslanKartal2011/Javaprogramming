package day19_LoopPractices;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("How much you make an hour?");
            int hourlyRate = scan.nextInt();
            if (hourlyRate <= 0) {
                System.err.println("Invalid Entry for Hourly Rate");
            }
            System.out.println("How many hours do you work per week?");
            double weeklyHours=scan.nextDouble();
            if (weeklyHours<1||weeklyHours>144){
                System.err.println("Invalid Entry for Weekly Hours");
            }
            System.out.println("Enter your state tax rate");
            double stateTaxRate=scan.nextDouble();

            if(stateTaxRate<0||stateTaxRate>0.1){
                System.out.println("Invalid Entry for state tax Rate");
                System.exit(0);
            }

            double federalTaxRate = 0.26;

            double salaryBeforeTax = hourlyRate * weeklyHours * 52; // salary is equal to one week' salary * 52
            double stateTax = salaryBeforeTax * stateTaxRate / 100;
            double federalTax = salaryBeforeTax * federalTaxRate / 100;
            double totalTax = stateTax + federalTax;
            double salaryAfterTax = salaryBeforeTax - totalTax;

            System.out.println("Gross pay is: $" + salaryBeforeTax  );
            System.out.println("State tax = $" + stateTax);
            System.out.println("Federal tax = $" + federalTax );
            System.out.println("Total tax = $" +totalTax );
            System.out.println("Net income = $"+salaryAfterTax);

            System.out.println("Would you like to continue?");
            String answer=scan.next();
            while(!(answer.equals("no")||answer.equals("yes"))){
                System.err.println("Invalid Entry");
                answer=scan.next();
            } if(answer.equals("no")){
                System.out.println( "Thank you");
                break;
            }
        }
        scan.close();
    }
}