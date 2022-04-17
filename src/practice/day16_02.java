package practice;

import java.util.Scanner;

public class day16_02 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String shoppingListReport = "";
            String item = "";
            String countinue = "yes";
            double price = 0;
            int count = 1;
            double totalPrice = 0;



            while(countinue.equals("yes")){
                System.out.println("Enter Item"+count+"  and its price:");
                item=scan.next();
                price=scan.nextDouble();

                shoppingListReport +="Item"+count+" "+item+"price"+price;

                System.out.println("Add one more item?");
                countinue=scan.next();

                count++;
                totalPrice+=price;
            }

             System.out.println(shoppingListReport + "totzlprixe "+totalPrice);



        }
    }