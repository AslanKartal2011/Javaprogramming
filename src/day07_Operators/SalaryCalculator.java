package day07_Operators;

public class SalaryCalculator {
    public static void main(String[] args) {

        double hourlyRate=10.5;
        double weeklyHours=22;
        double stateTaxRate=2.5;
        double federalTaxRate=0;
        
        double salaryBeforeTax=hourlyRate * weeklyHours * 52;
        double federalTax=federalTaxRate*salaryBeforeTax/100;
        double stateTax=stateTaxRate*salaryBeforeTax/100;
        double totalTax=federalTax+stateTax;
        double salaryAfterTax=salaryBeforeTax-(totalTax);
        double salaryMonthly= (int)salaryAfterTax/12;

        System.out.println("Gross pay is = $ " + salaryBeforeTax);
        System.out.println("federal tax is =$ " + federalTax);
        System.out.println("Total tax is = $ " + totalTax);
        System.out.println("State tax is = $" +stateTax);
        System.out.println("Net income is = $ " + salaryAfterTax);
        System.out.println("salaryMonthly = £ " + salaryMonthly);
                                
    }
}
