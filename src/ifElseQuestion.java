import java.util.Scanner;

public class ifElseQuestion {
    static void ifElse(){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        double cgpa = sc.nextDouble();
        int backlog = sc.nextInt();;
        boolean isIntern = sc.nextBoolean();
        boolean hasReferral=sc.nextBoolean();
        if (age < 18 || age > 30) {
            System.out.println("Rejected");
            return;
        }
        if (backlog > 5){
            System.out.println("Rejected");
            return;
        }
        if (cgpa >= 9 && backlog == 0){
            System.out.println("Accepted");
            return;
        }
        if ((cgpa >= 8 && backlog <= 2) || hasReferral){
            System.out.println("Accepted");
            return;
        }
        if (isIntern  && cgpa >= 7){
            System.out.println("Intern Conversion");
            return;
        }
        if (cgpa >= 6 && cgpa < 8 && backlog <= 3){
            System.out.println("Waitlist");
            return;
        }
        else {
            System.out.println("Rejected");
        }
    }

     static void pattern(int n){
        int count = 1;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count +" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
