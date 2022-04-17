package day11_Switch_Scanner;

public class CydeoBatches {
    public static void main(String[] args) {


        String result="";
        String batchName="US Evening";

        boolean validBatch = batchName == "US Morning" || batchName == "US Evening" || batchName == "EU";

        if (validBatch) {

            if (batchName == "US Morning") {
                result = "Class times are 10-5 EST. M, T, Th, F.";
            } else if (batchName == "US Evening") {
                result = "Class times are 7-\n" + "10 EST. M, T, W, Th, S, S";
            } else if (batchName == "EU") {
                result = "Class times are  10-5 EST. \n" + "M, T, W, Th, F.";
            } else {
                result="invalid Batch";
            }
        }

    }
}



