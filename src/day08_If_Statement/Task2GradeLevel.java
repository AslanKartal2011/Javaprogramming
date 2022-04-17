package day08_If_Statement;

public class Task2GradeLevel {

    public static void main(String[] args) {

        byte number=16;

        boolean ElemantarySchool=number>=1&&number<=5;
        boolean MiddleSchool=number>=6&&number<=8;
        boolean HighSchool=number>=9&&number<=12;
        boolean College=number>=13&&number<=16;
        boolean GradSchool=number>=17&&number<=18;

        if (ElemantarySchool){
            System.out.println("ElemantarySchool " );}

        if (MiddleSchool){
            System.out.println("MiddleSchool " );}

            if (HighSchool){
                System.out.println("HighSchool ");}

            if(College){
                System.out.println("College  ");}
            if(GradSchool){
                System.out.println("GradSchool ");}
    }
}
