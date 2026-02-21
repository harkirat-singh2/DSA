package TwoDArrays;

import java.util.Scanner;

public class ForEachLoop {
    public static void forEachloop(int n , int m){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[n][m];
        // Taking input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int[] a : arr){
            for(int el : a){
                System.out.print(el+" ");
            }
            System.out.println();
        }
//        for (int i = 0; i < arr.length; i++) {
//            for(int el : arr[i]){
//                System.out.print(el+" ");
//            }
//            System.out.println();
//        }
    }
    public static void main(String[] args) {

    }
}
