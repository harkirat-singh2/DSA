package Patterns;

public class SquareAndRectangles {
    public static void rectangle(int n,int m){
        for (int i = 0; i < n; i++) { // Kitni lines Hogi
            for (int j = 0; j < m; j++) {  //Har lines mein kitna print hoga
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void square(int n){
        for (int i = 0; i < n; i++) { // Kitni lines Hogi
            for (int j = 0; j < n; j++) {  //Har lines mein kitna print hoga
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void numberSquare(int n){
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = 1; j <= n; j++) {  //Har lines mein kitna print hoga
                System.out.print((j)+" ");
            }
            System.out.println();
        }
    }
    public static void alphabetSquare(int n){
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = 1; j <= n; j++) {  //Har lines mein kitna print hoga
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
    public static void numbersquare2(int n){
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = 1; j <= n; j++) {  //Har lines mein kitna print hoga
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void alphabetSquare2(int n){
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = 1; j <= n; j++) {  //Har lines mein kitna print hoga
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
    public static void alternatealphabetSquare(int n){
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi, Simailar row print kregi eg=aaaa
            for (int j = 1; j <= n; j++) {  //Har lines mein kitna print hoga , different row print kregi eg=1234
                if (i%2!=0)System.out.print((char)(i+96)+" ");
                if (i%2==0)System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        alternatealphabetSquare(4);
    }
}
