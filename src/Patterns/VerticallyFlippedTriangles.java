package Patterns;

public class VerticallyFlippedTriangles {
    public static void starTriangleVertFlipconsiderSquare(int n){
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = 1; j <= n; j++) {  //Har lines mein kitna print hoga
                if (i+j>n)System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void starTriangleVertFlip(int n){
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = 1; j <= n-i; j++) { //Har lines mein kitna print hoga
                System.out.print("  ");
            }
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void numberTriangleVertFlip(int n){
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = 1; j <= n-i; j++) { //Har lines mein kitna print hoga
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void alphabetTriangleVertFlip(int n){
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = 1; j <= n-i; j++) { //Har lines mein kitna print hoga
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
    public static void rhombus(int n){
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = 1; j <= n-i; j++) { //Har lines mein kitna print hoga
                System.out.print("  ");
            }
            for (int j = 1; j <=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void starTriangleUpFlip(int n){
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = 1; j <= i-1; j++) { //Har lines mein kitna print hoga
                System.out.print("  ");
            }
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pyramid(int n){
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = 1; j <= n-i; j++) { //Har lines mein kitna print hoga
                System.out.print("  ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pyramidWithVariable(int n){
        int nsp = n-1 , nst=1;
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = 1; j <= nsp; j++) { //Har lines mein kitna print hoga
                System.out.print("  ");
            }
            for (int j = 1; j <=nst ; j++) {
                System.out.print("* ");
            }
            nsp -=1;
            nst +=2;
            System.out.println();
        }
    }
    public static void diamond(int n){
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = 1; j <= n-i; j++) { //Har lines mein kitna print hoga
                System.out.print("  ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*(n-i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void diamondWithVariable(int n){
        int nsp = n-1 , nst=1;
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = 1; j <= nsp; j++) { //Har lines mein kitna print hoga
                System.out.print("  ");
            }
            for (int j = 1; j <=nst ; j++) {
                System.out.print("* ");
            }
            nsp -=1;
            nst +=2;
            System.out.println();
        }
        nsp = 1; nst=2*n-3;
        for (int i = 0; i < n-1; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            nsp++;
            nst-=2;
            System.out.println();
        }
    }
    public static void main(String[] args) {
    diamondWithVariable(18);
    }
}
