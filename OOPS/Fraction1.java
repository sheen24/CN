import java.util.Scanner;


public Class Fraction{
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator= numerator;
        this.denominator = denominator;
        simplify();
    }

    public void simplify(){
      int gcd=1;
      int smaller= Math.min(numerator, denominator);
      for(int i=2; i<=smaller; i++){
        if(numerator%i==0 && denominator%i==0){
            gcd=i;
        }
      }
      numerator = numertor/gcd;
      denominator= denominator/gcd;
    }

    public void print(){
      System.out.println(numertor + "/"+ denominator);
    }

}
