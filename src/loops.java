public class loops {
    public static void printoddNumbers(int n){
        for (int i = 0; i < n; i++) {
            if (i%2!=0 && i%3==0) System.out.println(i);
        }
    }
    public static void displayAp(int n){
        for (int i = 2; i <= 2+(n-1)*3; i=i+3) {
            System.out.print(i+" ");
        }
    }
    public static void displayAp(int n,int a , int d){
        for (int i = 0; i < n; i++) {
            System.out.print(a+" ");
            a+=d;
        }
    }
    public static void displaySeries(int a , int d){
        for (int i = a; i > 0; i -= d) {
            System.out.print(a+" ");
        }
    }
    public static void displaySeriesDiffMethod(int a , int d){
        for (int i = 0; ; i++){
            int value = a - i * d;
            if (value <= 0) break;
            System.out.print(value + " ");
        }
    }
    public static void gp(int n,int a , int r){
        for (int i = 0;i<n; i++){
            System.out.print(a + " ");
            a*=r;
        }
    }
    public static void primeANdComposite(int n){
        boolean flag =true; // true means prime
        for (int i = 2; i * i <= n; i++) {
            if (n%i==0) {
                flag = false;
                break;
            }
        }
        if (n==1) System.out.println("neither prime nor composite");
        else if (flag) System.out.println("prime");
        if (!flag) System.out.println("Composite");
    }

    public static void printAsciiValues(String s){
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.print(ch+" "+(int)ch);
        }
    }
    public static void main(String[] args) {

    }
}
