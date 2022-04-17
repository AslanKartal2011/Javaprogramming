package day04_Variables;

import java.sql.SQLOutput;

public class SalaryCalculator {

    public static void main(String[] args) {
        // hourlyRate, weeklyHours

        int hourlyRate=11;
        int WeeklyHours=16;
        int numberOfWeek=52;

        int salary = hourlyRate * WeeklyHours * numberOfWeek;

        // System.out.println(salary);

        System.out.println("hourlyRate = $ " + hourlyRate);
        System.out.println("WeeklyHours = " + WeeklyHours);
        System.out.println("salary = $" + salary);



    }
}
