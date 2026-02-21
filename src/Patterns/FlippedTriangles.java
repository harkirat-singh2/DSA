package Patterns;

public class FlippedTriangles {
    public static void flippedtriangle(int n){
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = 1; j <= n-i+1; j++) {  //Har lines mein kitna print hoga
                System.out.print("* ");
            }
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

    public static void main(String[] args) {
    straightAlphabeticflippedtriangle(5);
    }
}
