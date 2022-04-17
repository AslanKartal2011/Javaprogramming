package day05_Concatenaion;

import javax.swing.plaf.basic.BasicLookAndFeel;

public class ShippingAddress {

    public static void main(String[] args) {

        String name= "Aslan king",
               buildingNumber= "112233dsv",
                streetName= "Wilson road",
                city = "Oldbury",
                state ="VA2",
                zipCode="2222ss";
        System.out.println("name = " + name);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode+ "\n" );

        System.out.println ( name + "\n " + buildingNumber + " " +streetName+ "\n"+ city+", "+zipCode );

        String address = name + "\n " + buildingNumber + " " +streetName+ "\n"+ city+", "+zipCode ;

        System.out.println(address);

    }
}
