package TwoDArrays;

import java.util.Scanner;

public class TwoDArr {
    public static void twoDArrayCreation(int n,int m){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[n][m];
        // Taking input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Printing
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int sum(int n,int m) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int[][] arr = new int[n][m];
        // Taking input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    public static int maxEl(int n,int m) {
        Scanner sc = new Scanner(System.in);
        int minEl =Integer.MIN_VALUE;
        int[][] arr = new int[n][m];
        // Taking input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j]>minEl)minEl=arr[i][j];
            }
        }
        return minEl;
    }
    public static void maxRowSum(int n,int m) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[n][m];

        int maxSum = Integer.MIN_VALUE;
        int row = -1;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                row = i;
            }
        }

        System.out.println("Max Sum: " + maxSum);
        System.out.println("Row Index: " + row);
    }
    public static void main(String[] args) {
        maxRowSum(3,4);
    }
}
