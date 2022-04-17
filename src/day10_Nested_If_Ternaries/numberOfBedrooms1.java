package day10_Nested_If_Ternaries;

public class numberOfBedrooms1 {

    public static void main(String[] args) {

        System.out.println();

        int numberOfBedrooms=0;
        double startingPrice=0;

        switch(numberOfBedrooms){
            case 0:
                System.out.println("Studio apatmant");
                startingPrice =1454.0;
                break;
            case 1:
                System.out.println("One bedrroom apartmant");
                startingPrice =1725.0;
                break;

            case 2:
                System.out.println("Two bedroom Apartment");
                startingPrice=2899.0;
                break;
            default:
                System.out.println(numberOfBedrooms + "bedroom apartment not avalible");


        }

        System.out.println("stayring price"+startingPrice);
    }}






    /* add new class AdaireApartments
main method

#### WELCOME TO ADAIRE APARTMENTS ####

    numberOfBedrooms = 0, 1, 2

    startingPrice = 0;

    when numberOfBedrooms 0:
    print: "Studio apartment selected"
    startingPrice -> 1454

    when numberOfBedrooms 1:
    print: "One bedroom apartment selected"
    startingPrice -> 1725

    when numberOfBedrooms 2:
    print: "Two bedroom apartment selected"
    startingPrice -> 2899

    default:
    print "5 bedroom currently unavailable"

            ------
            "Starting price $1454"
*/
