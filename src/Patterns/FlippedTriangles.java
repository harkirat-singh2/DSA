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
    public static void main(String[] args) {
flippedtriangle(5);
    }
}
