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
    public static void main(String[] args) {
    triangle(5);
    }
}
