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
    public static void alphabetSquare(int n){
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = 1; j <= i; j++) {  //Har lines mein kitna print hoga
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    alphabetSquare(5);
    }
}
