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

    public static void main(String[] args) {
hollowRectangle(5,7);
    }
}
