package day21_ArraysUtilityForEachLoop;

public class JavaAndPyhton {
    public static void main(String[] args) {


        String sentence = "java java python python java python";
        String[] words = sentence.split(" ");

        int countJava = 0,
                countPython = 0;

        for (String each:words) {
            if(each.equalsIgnoreCase("java")){
                countJava++;
            }else if(each.equalsIgnoreCase("python")){
                countPython++;
            }
        }

        System.out.println(countJava+" Java and "+countPython+" Python");

    }

}


