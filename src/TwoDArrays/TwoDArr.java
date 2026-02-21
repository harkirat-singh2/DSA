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
    public static void minElFromRows(int n,int m) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[n][m];

        int minOfMax  = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int rowMax  = Integer.MIN_VALUE;

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                if (rowMax<arr[i][j])rowMax = arr[i][j];
            }
            if (rowMax<minOfMax)minOfMax=rowMax;

        }

        System.out.println("Max Element: " + minOfMax );
    }
    public static void printArrayColumnWise(int n,int m){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[n][m];

        // Taking input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Column-wise printing
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printArrayColumnWise(3,4);
    }
}
