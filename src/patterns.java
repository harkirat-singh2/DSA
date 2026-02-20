public class patterns {
    public static void rectangle(int n,int m){
        for (int i = 0; i < n; i++) { // Kitni lines Hogi
            for (int j = 0; j < m; j++) {  //Har lines mein kitna print hoga
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void square(int n){
        for (int i = 0; i < n; i++) { // Kitni lines Hogi
            for (int j = 0; j < n; j++) {  //Har lines mein kitna print hoga
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void numberSquare(int n){
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = 1; j <= n; j++) {  //Har lines mein kitna print hoga
                System.out.print((j)+" ");
            }
            System.out.println();
        }
    }
    public static void alphabetSquare(int n){
        for (int i = 1; i <= n; i++) { // Kitni lines Hogi
            for (int j = 1; j <= n; j++) {  //Har lines mein kitna print hoga
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        alphabetSquare(6);
    }
}
