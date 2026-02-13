package Rec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recurs {
    public static void nto1(int n){
        if (n==0) return;
        System.out.println(n);
        nto1(n-1);
    }
    public static void OneToNMethod1(int x,int n){
        if(x>n)return;
        System.out.println(x);
        OneToNMethod1(x+1,n);
    }
    public static void onetonmethod2(int n){
        if (n==0) return;
        onetonmethod2(n-1);
        System.out.println(n);
    }
    public static int fact(int n){
        if (n==0 || n==1) return 1;
        return n*fact(n-1);
    }
    public static int araisedb(int n, int m) {
        if (m == 0) return 1;   // ✅ base case FIRST

        int call = araisedb(n, m / 2);

        if (m % 2 == 0) {
            return call * call;
        } else {
            return n * call * call;
        }
    }

    public static int reverse(int n,int m){
        if (n==0) return m;
        return reverse(n/10,m*10+n%10);

    }
    public static void revbyloop(int n){
        int r = 0;
        while (n != 0){
            r *= 10;        // shift digits left
            r += n % 10;    // add last digit
            n /= 10;        // remove last digit
        }
        System.out.println(r);
    }
    public static void reverseExponention(int n){}
    public static int hcf(int n ,int m){
        if(m%n==0) return n;
        return hcf(m%n,n);
    }
    public static void printSubsets(String ans,String s,int idx,List<String> list){
      if (idx==s.length()){
          if (!ans.isEmpty())list.add(ans);   // to  remove the empty string
          return;
      }
      char ch = s.charAt(idx);
      printSubsets(ans+ch,s,idx+1,list);
      printSubsets(ans,s,idx+1,list);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "abc";
        List<String> list = new ArrayList<>();
        printSubsets("",s,0,list);










//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        nto1(n);
//        OneToNMethod1(1,n);
//        onetonmethod2(n);
//        System.out.println(araisedb(n,m));
//        revbyloop(n);
//        System.out.println(hcf(n,m));


    }
}
