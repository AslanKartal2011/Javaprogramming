package day08_If_Statement;

public class task4medianNumber {
    public static void main(String[] args) {
        
       int a= 10, b=15, c = 20;
                     // a=10 ,c= 15, b=20 || a= 15, c=10 b=20
       boolean aIsmedian= (a>b && a<c )|| (a>c && a<b) ;


                         // b=15, a= 20,  c=10   b=15, a= 10,  c =20
       boolean bIsMedian= (b<a && b<c) || (b>a && b>c);
       boolean cIsMedian= !aIsmedian && !bIsMedian;

        if (aIsmedian) {

            System.out.println("median");
        }
       if (bIsMedian){
           System.out.println("bIsMedian = " + bIsMedian);
       }
       
       if(cIsMedian){
           System.out.println("cIsMedian = " + cIsMedian);
       }
    }
}
