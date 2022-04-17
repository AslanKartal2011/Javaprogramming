package day13_StringMethods;

import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter If you have a valid passport or not?");
        String hasPassport = scan.next().toLowerCase();

        int cost = 0;
        if (hasPassport.equals("yes")) {
            cost = 1000;
            scan.nextLine();

            System.out.println("Which country are you traveling ?");
            String country = scan.nextLine();

            System.out.println("How many bags will take you?");
            byte bags = scan.nextByte();
            cost += 50 * bags;

            System.out.println(" how many people they will travel with you?");
            short people = scan.nextShort();
            if (people < 3) {
                cost -= 100 * people;
            } else {
                cost -= 300;
            }
            scan.nextLine();
            System.out.println("The name of the people you will travel with in one line, separating each name with a comma");
            String names = scan.nextLine();


            System.out.println("Your ticket is booked to" + country + ". We have charged extra for the " + bags +
                    "bags but you are traveling with" + people +
                    " so we are giving a discount. Your total cost is " + cost);

        } else {

            System.out.println("when your passport expired?");
            int expired = scan.nextInt();
            cost += 75 * (2021 - expired);
            System.out.println("which country they plan to travel?");
            String country2 = scan.next();
            System.out.println("will you be traveling in the next year ?");
            String travelNextYear = scan.next().toLowerCase();
            if(travelNextYear.equals("yes")) {
                cost += 100;
            }else{
                cost -=50;
            }
            System.out.println("Looks like your password has been expired for "+(2021-expired)
                    +", but not to worry we will get it ready for you to travel to "+country2
                    +". Your total cost has come out to $"+cost);

        }


        scan.close();

        }
    }
