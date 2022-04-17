package day21_ArraysUtilityForEachLoop;

public class CommonElements {
    public static void main(String[] args) {

        int[] one={1,2,3,4,5};
        int[] two={4,5,6,7,8,9};


        for ( int each:one) {
            for (int element:two) {
                if(each==element){
                    System.out.println(each);
                }
            }
        }
    }
}
