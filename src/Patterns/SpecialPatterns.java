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

    public static void main(String[] args) {
starCross(7);
    }
}
