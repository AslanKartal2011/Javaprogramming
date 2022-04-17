package day17_While_DoWhile_Loop;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String str = "Java Java Python Python dog dog python java java python";
        str = str.toLowerCase();

        int frequencyJava = 0;
        int frequencyPython = 0;

        while (str.contains("java") || str.contains("python")) {
            if (str.contains("java")) {
                str = str.replaceFirst("java", "");
                frequencyJava++;
            }
            if (str.contains("python")) {
                str = str.replaceFirst("python", "");
                frequencyPython++;
            }

        }
              System.out.println("frequencyJava = " + frequencyJava);
              System.out.println("frequencyPython = " + frequencyPython);
    }
}