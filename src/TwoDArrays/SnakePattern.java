package TwoDArrays;

import java.util.Scanner;

public class SnakePattern {
    public static void snakepattern(int n, int m) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[n][m];
        // Taking input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                }
            }
            else{
                for (int j = arr[0].length-1; j >=0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
        

    }

    public static void main(String[] args) {
        snakepattern(3,4);
    }
}
