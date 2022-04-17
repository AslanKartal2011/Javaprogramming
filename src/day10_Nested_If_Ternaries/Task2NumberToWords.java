package day10_Nested_If_Ternaries;

public class Task2NumberToWords {
     int number= 5;

     String result=(number>=0 && number<=9)?
                   (number==0)?"Zero": (number==1)?"One": (number==2)?"two"
                           : (number==3)?"Zero": (number==4)?"four": (number==5)?"five"
                           : (number==6)?"six": (number==7)?"seven": (number==8)?"Eight": "nine"
                    :"invalid Number";
                {
                    System.out.println(number);
                }

}
