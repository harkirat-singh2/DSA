package OOPS;

class FractionClass{
    int num , den;
    FractionClass(int num , int den){
        this.num = num;
        this.den = den;
        simplyfy();
    }
    void print(){
        System.out.println(num+"/"+den);
    }
    void add(FractionClass f){
        num = num*f.den + f.num*den;
        den = den*f.den;
        simplyfy();
    }
    void simplyfy(){
        int gcd = hcf(num,den);
        num = num/gcd;
        den/=gcd;
    }
    int hcf(int a , int b){
        if (a==0) return b;
        return hcf(b%a,a);
    }
}

public class Fraction {
    public static void main(String[] args) {

    }
}
