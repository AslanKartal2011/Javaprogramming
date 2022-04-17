package day09_If_Else_MultiBranchIf;

public class AgeGroups {
    public static void main(String[] args) {

    int age = 19;
    String result = "";

    if(age <= 2){
        result = "Infant";
    }else if(age <= 5){
        result = "Toddler";
    }else if(age <= 9){
        result = "Kid";
    }else if(age <= 12){
        result = "Pre-Teen";
    }else if(age <= 17){
        result = "Teenager";
    }else if(age <= 20){
        result = "Young Adult";
    }else if(age <= 39){
        result = "Adult";
    }else if(age <= 49){
        result = "Young Middle-Aged Adult";
    }else if(age <= 54){
        result = "Middle-Aged Adult";
    }else if(age <= 64){
        result = "Very Young Senior Citizen";
    }else if(age <= 74){
        result = "Young Senior Citizen";
    }else if(age <= 84){
        result = "Senior Citizen";
    }else{
        result = "Old Senior Citizen";
    }


    System.out.println(result);


}

}

