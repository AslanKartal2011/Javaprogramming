package day24_CustomMethods_Return;

public class Task1FrequencyOfWord {

    public static void main(String[] args) {

        frequencyOfWord("Java java java python python","java");
    }


    public static int frequencyOfWord(String sentence, String word){
        int count = 0;
        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word, "");
            count++;
        }
        return count;
    }


}




