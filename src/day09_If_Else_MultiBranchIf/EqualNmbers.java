package day09_If_Else_MultiBranchIf;

public class EqualNmbers {
    public static void main(String[] args) {
            int n1 = 100,
                n2 = 200,
                n3 = 200;

        String result = "";

        if(n1 == n2 && n2 == n3){
            result = "All equal";
        }else if(n1 == n2){
            result = "n1 & n2 are equal";
        }else if(n2 == 3){
            result = "n2 & n3 are equal";
        }else if(n1 == n3){
            result = "n1 & n3 are equal";
        }else{
            result = "none of them are equal";
        }

        System.out.println(result);



    }
}
