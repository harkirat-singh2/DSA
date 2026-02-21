package Patterns;

public class SpecialPatterns {
    public static void hollowRectangle(int n, int m) {

        for (int i = 0; i <= n; i++) {  // rows
            for (int j = 0; j <= m; j++) {  // columns

                if (i == 0 || j == 0 || i == n  || j == m )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void starPlus(int n) {

        for (int i = 1; i <= n; i++) {  // rows
            for (int j = 1; j <= n; j++) {  // columns

                if (i == (n/2 +1) || j == (n/2 +1)  )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void starCross(int n) {

        for (int i = 1; i <= n; i++) {  // rows
            for (int j = 1; j <= n; j++) {  // columns

                if (i == j || i+j == n+1  )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void floyddTriangle(int n){
        int a = 1;
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = 1; j <= i; j++) {  //Har lines mein kitna print hoga
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
    public static void binaryTriangle(int n){
        int b= 0;
        int a = 1;
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = 1; j <= i; j++) {  //Har lines mein kitna print hoga
                if ((i+j)%2!=0)System.out.print(b+" ");
                if ((i+j)%2==0)System.out.print(a+" ");

            }
            System.out.println();
        }
    }
    public static void oddTriangle(int n) {

        for (int i = 1; i <= n; i++) {   // rows

            int num = 1;   // reset to 1 every row

            for (int j = 1; j <= i; j++) {  // columns
                System.out.print(num + " ");
                num += 2;   // next odd number
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
    oddTriangle(7);
    }
}
