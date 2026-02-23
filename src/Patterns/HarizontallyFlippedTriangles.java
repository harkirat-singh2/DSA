package Patterns;

public class HarizontallyFlippedTriangles {
    public static void flippedtriangle(int n){
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = 1; j <= n-i+1; j++) {  //Har lines mein kitna print hoga
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void jugaadflippedtriangle(int n){
        int a = n;
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = 1; j <= a; j++) {  //Har lines mein kitna print hoga
                System.out.print("* ");
            }
            a--;
            System.out.println();
        }
    }
    public static void straightNumericflippedtriangle(int n){
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = 1; j <= n-i+1; j++) {  //Har lines mein kitna print hoga
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void straightAlphabeticflippedtriangle(int n){
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = 1; j <= n-i+1; j++) {  //Har lines mein kitna print hoga
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
    public static void sameAlphabetstraightAlphabeticflippedtriangle(int n){
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = 1; j <= n-i+1; j++) {  //Har lines mein kitna print hoga
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
    public static void diffMethodflippedtriangle(int n){
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = n; j >= i; j--) {  //Har lines mein kitna print hoga
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void diffMethodNumericflippedtriangle(int n){
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = n; j >= i; j--) {  //Har lines mein kitna print hoga
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void alternatealphabetFlippedTriangle(int n){
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi, Simailar row print kregi eg=aaaa
            for (int j = 1; j <= n-i+1; j++) {  //Har lines mein kitna print hoga , different row print kregi eg=1234
                if (i%2!=0)System.out.print((char)(i+96)+" ");
                if (i%2==0)System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        alternatealphabetFlippedTriangle(5);
    }
}
