package day11_Switch_Scanner;

public class CappuccinoBuyer {

    public static void main(String[] args) {
        System.out.println(".....Solution1 if statement.....................");
    String size="tall";
    String result="";
        if ( size == "tall" || size == "grande" || size == "venti")
           { if (size=="tall"){
                result="Prise is $3.69 \n"+"90 Calories";
            }else if (size=="grande"){
                result="Price is $3.99 \n"+"120 calories";
            }else {
                result="Price is $4.29 \n"+"150 calories";
            }
        } else {
            result="Invalid Size";
        }
        System.out.println(result);

        System.out.println(".......................................................");

        System.out.println(".....Solution2 switch statement.....................");

        switch(size){
            case "tall":
                result="Prise is $3.69 \n"+"90 Calories";
                break;
            case "grande":
                result="Price is $3.99 \n"+"120 calories";
                break;
            case "venti":
                result="Price is $4.29 \n"+"150 calories";
            default:
                result="Invalid size";
        }
             System.out.println(result);

        System.out.println(".......................................................");

        System.out.println(".....Solution3 If && switch statement.....................");

        if ( size == "tall" || size == "grande" || size == "venti") {
            switch (size) {
                case "tall":
                    result = "Prise is $3.69 \n" + "90 Calories";
                    break;
                case "grande":
                    result = "Price is $3.99 \n" + "120 calories";
                    break;
                case "venti":
                    result = "Price is $4.29 \n" + "150 calories";
            }
        }else {
               result="invalid size";
        }
        System.out.println(result);
    }



}
