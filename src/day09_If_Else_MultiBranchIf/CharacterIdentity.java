package day09_If_Else_MultiBranchIf;


    public class CharacterIdentity {

        public static void main(String[] args) {

            char ch = 5;
            String result = "";

            if(ch >= '0' && ch <= '9'){
                result = "Digit";
            }else if( (ch >= 'A' && ch <= 'Z' )  || (ch >= 'a' && ch <= 'z')  ){
                result = "Alphabetic";
            }else{
                result = "Special Character";
            }
            System.out.println("result = " + result);

        }

    }



