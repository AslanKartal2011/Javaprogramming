package day06_PrimitiveTypeCastings;


public class PrimitiveCasting {
  public static void main(String[] args) {



  byte a = 100;
  short b = a;

  //short b = (short)a;


  int c = b; // implicit casting
  // int c = (int)b

  long d = c;
  // (long)c

  float e = d;
  double f = e;

  //...............................

  int x = 55;
  short y = (short) x;

  long j = 1000000;
  short k = (short) j;


  double l = 2.5;
  float m=(float)l;
    System.out.println(l + " : "+ m);

    double n=10.8;
    int s = (int)n;
    System.out.println(n+" : " + s);
}


}
