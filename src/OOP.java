import java.util.Scanner;

public class OOP {
    public static class Student{
        String name;
        int rno;
        float cgpa;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        System.out.println("Print Name");
        s1.name= sc.nextLine();
        s1.rno= sc.nextInt();
        s1.cgpa=sc.nextFloat();

        System.out.println(s1.name+s1.rno+s1.cgpa);
    }
}
