package Patterns;

public class Triangles {
    public static void triangle(int n){
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = 1; j <= i; j++) {  //Har lines mein kitna print hoga
               System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void numbertriangle(int n){
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = 1; j <= i; j++) {  //Har lines mein kitna print hoga
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void alphabetTriangle(int n){
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = 1; j <= i; j++) {  //Har lines mein kitna print hoga
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
    public static void alternatealphabetTriangle(int n){
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi, Simailar row print kregi eg=aaaa
            for (int j = 1; j <= i; j++) {  //Har lines mein kitna print hoga , different row print kregi eg=1234
                if (i%2!=0)System.out.print((char)(i+96)+" ");
                if (i%2==0)System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
    public static void alphanumericTriangle(int n){
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi, Simailar row print kregi eg=aaaa
            for (int j = 1; j <= i; j++) {  //Har lines mein kitna print hoga , different row print kregi eg=1234
                if (i%2!=0)System.out.print((j)+" ");
                if (i%2==0)System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    alternatealphabetTriangle(5);
    }
}
