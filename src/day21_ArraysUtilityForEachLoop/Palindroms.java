package day21_ArraysUtilityForEachLoop;

public class Palindroms {

    public static void main(String[] args) {

        String[] srt = {"anna", "level", "Java"};

       int count=0;

        for (String each: srt) {
        String reverse="";
        for (int i = each.length()-1; i >=0 ; i--) {
            reverse +=each.charAt(i);
            }
        if(each.equalsIgnoreCase((reverse))){
            count++;
            }
        }


        System.out.println(count);

    }

}