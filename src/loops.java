public class loops {
    public static void printoddNumbers(int n){
        for (int i = 0; i < n; i++) {
            if (i%2!=0 && i%3==0) System.out.println(i);
        }
    }
    public static void displayAp(int n){
        for (int i = 2; i <= 2+(n-1)*3; i=i+3) {
            System.out.print(i+" ");
            System.out.println();
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

    public static int countDigits(int n){
        int count =0;
        while (n!=0){
            n = n/10;
            count++;
        }
        return count;
    }
    public static int sumOfDigits(int n){
        int sum =0;
        while (n!=0){
            sum+= n%10;
            n/=10;
        }
        return sum;
    }

    public static int revOfNum(int n){
        int rev =0;
        while (n!=0){
            rev= (n%10 )+ (rev*10);
            n/=10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(revOfNum(61234));
    }
}
