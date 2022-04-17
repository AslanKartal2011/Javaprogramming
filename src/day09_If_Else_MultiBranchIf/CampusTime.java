package day09_If_Else_MultiBranchIf;

public class CampusTime {
    public static void main(String[] args) {

        int time = 13;
        String result = "";


        if (time >= 8 && time <= 23) {
            result = "open";
        } else  {
            result = "closed";
        }
        System.out.println("result = " + result);
    }
}