package Rec;

public class TowerOfHanoi {
    public static void hanoi(int n,String  S , String H ,String  D){
        if (n==0) return;
        hanoi(n-1,S,D,H);
        System.out.println(S+"->"+D);
        hanoi(n-1,H,S,D);
    }
    public static void main(String[] args) {
        hanoi(3,"A","B","C");
    }
}
