package Strings;

import java.util.Scanner;

public class compareTO {
    public static  int cratingCompareToFunction(String a,String b){
        for (int i = 0; i <a.length() ; i++) {
            
        }return -1;
    }
    public static void countDigits(int n){
        String s =""+n;
        System.out.println(s.length());
    }

    public static void modifyString(String s){
        if (s.charAt(0)<90) System.out.print(s.toLowerCase());
        else System.out.println(s.toUpperCase());
    }
    public static void printAllSubstring(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {   // <= is important
                System.out.print(s.substring(i, j)+" ");
            }
            System.out.println();
        }
    }
    public static int sumOfAllSubstring(String s){
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
               String sub =s.substring(i,j);
                int num = Integer.parseInt(sub);
                sum+=num;
            }
        }return sum;
    }

    public static void main(String[] args) {
//        String z = "Harmeet";
//        String p = "Preet";
//        System.out.println(z.compareTo(p));  //  ans -> -8
//        String a ="Harsh";
//        String b = "Harshita";
//        System.out.println(a.compareTo(b)); // ans = -3
//        modifyString("harsh");
//
//        Scanner sc = new Scanner(System.in) ;
//        int n = sc.nextInt();
//        String s =""+n;
//        System.out.println(s.length());
        printAllSubstring("Harsh");
        System.out.println(sumOfAllSubstring("32456"));


    }
}
