package day12__ScannerClass;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Current speed: ");
        String result="";
        int speedlimit=55;
        int currentSpeed=scan.nextInt();
        int overTheLimit=currentSpeed-speedlimit;

        if(overTheLimit > 0){
            System.out.println("You are driving "+ overTheLimit +" mph over the limit. Slow down!");
        }

    }
}