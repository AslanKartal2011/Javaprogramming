package day11_Switch_Scanner;

public class Grade {

    public static void main(String[] args) {

        char ch='B';
        String result="";

        switch(ch){
            case 'A':
                result="exelent";
                break;
            case 'B':
                result="great job";
                break;
            case 'C':
                result="good";
                break;
            case 'D':
                result="passed";
                break;
            case 'F':
                result="failed";
                break;
            default:
                result="invalid";


        }

    }
}
