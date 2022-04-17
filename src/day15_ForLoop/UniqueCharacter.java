package day15_ForLoop;

public class UniqueCharacter {
    public static void main(String[] args) {

        String str = "aaabccc";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                result = ch+result;
            }
        }
        System.out.println(result);
    }
}