package day11_Switch_Scanner;

public class GradeLevel {
    public static void main(String[] args) {

        byte number = 5;
        String result = "";

        switch (number) {
            case 1: case 2: case 3: case 4: case 5:
                result = "Elementary School";
                break;
            case 6: case7: case8:
                result = "Middle school";
                break;
            case 9: case 10: case 11: case 12:
                result = "High school";
                break;
            case 13: case 14: case 15: case 16:
                result = "college";
                break;
            case 17: case 18:
                result = "Grade School";
                break;
            default:
                result = "Invalid Grade Level";
        }
    }


}
